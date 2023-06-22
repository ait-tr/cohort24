## HTTP

HTTP — это протокол, позволяющий получать различные ресурсы, например HTML-документы. Протокол HTTP лежит в основе обмена данными в Интернете. HTTP является протоколом клиент-серверного взаимодействия, что означает инициирование запросов к серверу самим получателем, обычно веб-браузером (web-browser).


### HTTP сообщения
HTTP сообщения - это обмен данными между сервером и клиентом. Есть два типа сообщений: запросы, отправляемые клиентом, чтобы инициировать реакцию со стороны сервера, и ответы от сервера.

HTTP запросы и ответы имеют близкую структуру. Они состоят из:

- Стартовой строки, описывающей запрос, или статус (успех или сбой). Это всегда одна строка.
- Произвольного набора HTTP заголовков, определяющих запрос или описывающих тело сообщения.
- Пустой строки, указывающей, что вся мета информация отправлена.
- Произвольного тела, содержащего пересылаемые с запросом данные (например, содержимое HTML-формы ) или отправляемый в ответ документ. Наличие тела и его размер определяется стартовой строкой и заголовками HTTP.

Стартовую строку вместе с заголовками сообщения HTTP называют головой запроса, а его данные - телом.

## Запросы на примере fetch 
### Пример 
```
fetch('url', {
    Method: 'POST',
    Headers: {
        Accept: 'application.json',
        'Content-Type': 'application/json'
    },
    Body: body
})
```
### Метод GET
Метод GET используется для получения данных с сервера. Это метод только для чтения, поэтому нет риска изменения или повреждения данных. Например, если мы вызовем метод get в нашем API, мы получим список всех задач.
#### Пример get запроса на получение user
```
fetch('https://fakestoreapi.com/users/1')
.then(res=>res.json())
.then(json=>console.log(json))
```
### Метод POST
Этот метод используется для создания новой записи данных.
#### Пример get запроса на создание user
```
fetch('https://fakestoreapi.com/users',{
            method:"POST",
            body:JSON.stringify(
                {
                    email:'John@gmail.com',
                    username:'johnd',
                    password:'m38rmF$',
                    name:{
                        firstname:'John',
                        lastname:'Doe'
                    },
                    address:{
                        city:'kilcoole',
                        street:'7835 new road',
                        number:3,
                        zipcode:'12926-3874',
                        geolocation:{
                            lat:'-37.3159',
                            long:'81.1496'
                        }
                    },
                    phone:'1-570-236-7033'
                }
            )
        })
            .then(res=>res.json())
            .then(json=>console.log(json))
```


### Метод DELETE
Метод для удаления.
```
fetch('https://fakestoreapi.com/users/6',{
method:"DELETE"
})
.then(res=>res.json())
.then(json=>console.log(json))
```

### Метод PUT
Метод для обновления записи. 
```
fetch('https://fakestoreapi.com/users/7',{
    method:"PUT",
    body:JSON.stringify(
        {
            email:'John@gmail.com',
            username:'johnd',
            password:'m38rmF$',
            name:{
            firstname:'John',
            lastname:'Doe'
        },
        address:{
            city:'kilcoole',
            street:'7835 new road',
            number:3,
            zipcode:'12926-3874',
            geolocation:{
                lat:'-37.3159',
                long:'81.1496'
                }
        },
        phone:'1-570-236-7033'
        }
   )
    })
    .then(res=>res.json())
    .then(json=>console.log(json))
```
## Redux toolkit (RTK)
React toolkit Redux Toolkit - это пакет, облегчающий работу с Redux. Он был разработан для решения трех главных проблем:

- Слишком сложная настройка хранилища (store)  
- Для того, чтобы заставить Redux делать что-то полезное, приходится использовать дополнительные пакеты  
- Слишком много шаблонного кода (boilerplate)

Redux Toolkit предоставляет инструменты для настройки хранилища и выполнения наиболее распространенных операций, а также содержит полезные утилиты, позволяющие упростить код.

Команда: npm i @reduxjs/toolkit

### action Creators
это функции, которые создают экшены. Эти функции передают результат в dispatch.


Пример:
в файле actionCreators пишем:
````
export const plus = (count: number): Action => ({
    type: "counter/plus",
    payload: count
})

export const minus = (count: number): Action => ({
    type: "counter/minus",
    payload: count 
})
````

в файле Counter.tsx в dispatch прокидываем эти экшены:
````
        <div>
            <button 
              type="button" 
              onClick={() => dispatch(minus(1))}>
                -1
            </button>{' '}
            
             <span style={{color}}>{value}</span>{' '}
              
            <button
              type="button" 
              onClick={() => dispatch(plus(1))}>
                +1
            </button>
        </div>
````
### Selectors
могут использоваться для эффективного вычисления производных данных из Redux store.

Пример:
в файле selectors.ts пишем:
````
export const selectCounerValue = (
    state: RootState
): number => state.counter.value
````

в файле Counter.tsx внутри компонента пишем:
````
const value = useSelector(selectCounterValue)
````

### Slice

Slices автоматизируют рутину, сокращают количество кода и предоставляют более удобные роуты для управления действиями и состоянием.
slice = ActionType + actionCreators + reducer

Для создания слайса нужно как минимум три компонента: имя, начальное состояние, набор редьюсеров.

Пример:
````
import { createAsyncThunk, createSlice, PayloadAction } from "@reduxjs/toolkit";
import Color from "./types/Color";
import CounterState from "./types/CounterState";

const initialState: CounterState = {
    value: 0,
    color: 'red'
};

const counterSlice = createSlice({
    name: 'counter',
    initialState,
    reducers: {
        minus(state, action: PayloadAction<number>) {
            state.value -= action.payload
        },
        plus(state, action: PayloadAction<number>) {
            state.value += action.payload
        },
    },
});
````

### createAsyncThunk
используется для создания асинхронных запросов. Создается в том же файле со слайсами. Результат выполнения этого асинхронного запроса с помощью createAsyncThunk используется в extraReducers, если нужно поменять стэйт.

````
import { createAsyncThunk, createSlice, PayloadAction } from "@reduxjs/toolkit";
import Color from "./types/Color";
import CounterState from "./types/CounterState";
import * as api from './api'

const initialState: CounterState = {
    value: 0,
    color: 'red'
};

// асинхронный action creator
// мы кидаем fetch
export const changeColor = createAsyncThunk(
    'counter/changeColor',
    async (color: Color) => {
        await api.colorChange(color);
        // этот результат уйдет в редьюсер
        return color;
    }
)


const counterSlice = createSlice({
    name: 'counter',
    initialState,
    reducers: {
        minus(state, action: PayloadAction<number>) {
            state.value -= action.payload
        },
        plus(state, action: PayloadAction<number>) {
            state.value += action.payload
        },
    },
    extraReducers: (builder) => {
        builder.addCase(changeColor.fulfilled, (state, action) => {
            // в action.payload придет результат из thunk 
            const color = action.payload;
            state.color = color;
        })
    }
});

export const {minus, plus} = counterSlice.actions;

export default counterSlice.reducer;
````
### configureStore
В файле store.ts теперь используются не createStore и CombineReducers, а configureStore и reducer из библиотеки @reduxjs/toolkit.

Также вместо хука useDispatch будет использоваться useAppDispatch.

Пример:
````
import { configureStore } from "@reduxjs/toolkit";
import { useDispatch } from "react-redux";
import authReducer from "./features/auth/authSlice";
import counterReducer from "./features/counter/counterSlice";

const store = configureStore({
    reducer: {
      counter: counterReducer,
      auth: authReducer
    }
})

export default store

export type RootState = ReturnType<typeof store.getState>

// для правильной типизации будем использовать useAppDispatch() вместо useDispatch
export type AppDispatch = typeof store.dispatch;
export const useAppDispatch: () => AppDispatch = useDispatch
````

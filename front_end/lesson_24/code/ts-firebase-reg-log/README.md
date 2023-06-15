# Регистрация и логинизация с firebase

## Начальные данные 
У вас есть проект в котором почти ничего нет, за исключением одного компонента `Profile.tsx`
и самого простого роутинга:

```
// src/components/App

import './App.css';
import { Route, Routes } from 'react-router-dom';
import Profile from '../components/Profile/Profile';

function App(): JSX.Element {
  return (
    <Routes>
      <Route path="/" element={<Profile />} />
    </Routes>
  );
}

export default App;
```

```
// src/components/Profile

import React from 'react';

function Profile():JSX.Element {
  return (
    <div>
      <div className="profile">
        <h1>Profile</h1>
        <p>Email:</p>
        <span>Sign Out</span>
      </div>
    </div>
  );
}

export default Profile;
```
## Подготовка проекта 

Первым делом следует установить Firebase Realtime Database  для этого выполним команду: `npm i firebase`.

После этого создаем в src папку api, в ней создаем файл firebase.ts

```
// src/api/firebase.js
// eslint-disable-next-line import/no-extraneous-dependencies
import { initializeApp } from 'firebase/app';
// eslint-disable-next-line import/no-extraneous-dependencies
import { getAuth } from 'firebase/auth';

const firebaseConfig = {
  apiKey: 'нужно заменить',
  authDomain: 'нужно заменить',
  projectId: 'нужно заменить',
  storageBucket: 'нужно заменить',
  messagingSenderId: 'нужно заменить',
  appId: 'нужно заменить',
  measurementId: 'нужно заменить'
};

const app = initializeApp(firebaseConfig);
const auth = getAuth(app);

export { app, auth };

```

Скопировали ключи.

## Регистрация пользователя
Создадим максимально простой компонент Register

```
// src/components/Register
import React, { useState } from 'react';


function Register():JSX.Element {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [confirmPassword, setConfirmPassword] = useState('');
  // eslint-disable-next-line @typescript-eslint/no-unused-vars
  const [error, setError] = useState('');
  return (
    <div>
      <div className="auth">
        <h1>Register</h1>
        {error && <div>{error}</div>}
        <form name="registration_form">
          <input
            type="email"
            value={email}
            placeholder="Enter your email"
            required
            onChange={(e) => setEmail(e.target.value)}
          />

          <input
            type="password"
            value={password}
            required
            placeholder="Enter your password"
            onChange={(e) => setPassword(e.target.value)}
          />

            <input
              type="password"
              value={confirmPassword}
              required
              placeholder="Confirm password"
              onChange={(e) => setConfirmPassword(e.target.value)}
            />
          <button type="submit">Register</button>
        </form>
        <span>
          Already have an account?
        </span>
      </div>
    </div>
  );
}

export default Register;
```
Добавим соответствующий путь в App:
```
function App(): JSX.Element {
  return (
    <Routes>
      <Route path="/" element={<Profile />} />
      <Route path="register" element={<Register />} />
    </Routes>
  );
}
```

### Валидация введенных данных 
Для валидации введенных данных внутри компонента Register мы можем использовать функцию validatePassword
```
  const validatePassword = ():boolean => {
    let isValid = true;
    if (password !== '' && confirmPassword !== '') {
      if (password !== confirmPassword) {
        isValid = false;
        setError('Passwords does not match');
      }
    }
    return isValid;
  };
```
### Отправка данных
Для того, чтобы наши данные отправились на сервер, мы должны:
во-первых, подятнуть импорты в компоненте Register:
```
import { createUserWithEmailAndPassword } from 'firebase/auth';
import { auth } from '../../api/firebase';
```
Во-вторых, написать функцию register: 
```
  const register = (e: React.SyntheticEvent): void => {
    e.preventDefault();
    setError('');
    if (validatePassword()) {
      // Создаем нового пользователя с использованием полученных email и password
      createUserWithEmailAndPassword(auth, email, password)
        .then((res) => {
          console.log(res.user);
        })
        .catch((err) => setError(err.message));
    }
    setEmail('');
    setPassword('');
    setConfirmPassword('');
  };
```
Плюс внутри формы требуется обновить поле: 
```
<form name="registration_form" onSubmit={register}>
```

Теперь, если вы введете данные, вы увидите, что создался пользователь и его можно посмотреть внутри интерфейса firebase в браузере.

Также если вы зайдете в консоль браузера, увидите, что в ответ нам пришел объект юзера UserImpl

## Контекст 
Мы можем положить необходимые данные о юзере в контекст, чтобы эти данные были доступны в любых компонентах, обернутых в этот контекст. Давайте разберерем этот процесс поэтапно.

### Создание контекста 
Чтобы создать контекст мы можем воспользоваться хуком createContext()
Создадим папку для контекстов, назовем ее contexts, внутри мы можем создать контекст для нашего пользователя: AuthContext.ts

```
import { User } from 'firebase/auth';
import { createContext } from 'react';

const AuthContext = createContext<User | undefined>(undefined);

export default AuthContext;

```
### Предоставление контекста
Для предоставления контекста, мы используем обертку AuthContext.Provider, в которую передаем значение пользователя.

`<AuthContext.Provider value={currentUser}>`

Ниже актуальное состояние App: 
```
import React, { useEffect, useState } from 'react';
import './App.css';
import { Route, Routes } from 'react-router-dom';
import { User, onAuthStateChanged } from 'firebase/auth';
import Profile from '../Profile/Profile';
import Register from '../Register/Register';
import { auth } from '../../api/firebase';
import AuthContext from '../../contexts/AuthContext';

function App(): JSX.Element {
  const [currentUser, setCurrentUser] = useState<User | null>(null);
  useEffect(() => {
    onAuthStateChanged(auth, (user) => {
      setCurrentUser(user);
      console.log(user);
    });
  }, []);
  return (
    // eslint-disable-next-line react/jsx-no-constructed-context-values
    <AuthContext.Provider value={currentUser}>
      <Routes>
        <Route path="/" element={<Profile />} />
        <Route path="register" element={<Register />} />
      </Routes>
    </AuthContext.Provider>
  );
}

export default App;

```
### Использование контекста
Чтобы получить необходимую информацию из контекса, мы должны воспользоваться хуком useContext. 

Мы хотим получить информацию об email внутри компонента Profile:
```
import React, { useContext } from 'react';
import AuthContext from '../../contexts/AuthContext';

function Profile():JSX.Element {
  const user = useContext(AuthContext);
  return (
    <div>
      <div className="profile">
        <h1>Profile</h1>
        <p>Email: {user?.email}</p>
        <span>Sign Out</span>
      </div>
    </div>
  );
}

export default Profile;

```

## Выход 
Для того чтобы можно было выйти из аккаунта мы можем воспользоваться функцией:
signOut

```
import { signOut } from 'firebase/auth'; 
```

Вот как будет выглядеть наш компонент: 
```
import { useContext, useEffect, useState } from 'react'
import './profile.css'
import { AuthContext } from './AuthContext';
import { signOut } from 'firebase/auth' 
import { auth } from './firebase'

function Profile() {
  const {currentUser} = useContext(AuthContext);
  return (
    <div className='center'>
      <div className='profile'>
        <h1>Profile</h1>
        <p><strong>Email: {currentUser?.email}</strong> </p>
        <p><strong>Email verified: </strong> </p>
        <span onClick={() => signOut(auth)}>Sign Out</span>
      </div>
    </div>
  )
}

export default Profile
```

## Вход, компонент Login 
Но как мы сможем войти обратно?

Создадим максимально простой компонент Login, он очень похож на Registration.

```
import React, { useState } from 'react';

function Login():JSX.Element {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  // eslint-disable-next-line @typescript-eslint/no-unused-vars
  const [error, setError] = useState('');
  return (
    <div>
      <div className="auth">
        <h1>Log in</h1>
        {error && <div className="auth__error">{error}</div>}
        <form name="login_form">
          <input
            type="email"
            value={email}
            required
            placeholder="Enter your email"
            onChange={(e) => setEmail(e.target.value)}
          />

          <input
            type="password"
            value={password}
            required
            placeholder="Enter your password"
            onChange={(e) => setPassword(e.target.value)}
          />

          <button type="submit">Login</button>
        </form>
        <p>
          Don`t have and account?
        </p>
      </div>
    </div>
  );
}

export default Login;

```

Добавим путь для компонента в App:
```
<Route path="login" element={<Login />} />
```
Опицонально можно добавить минимальные стили: 
```
.auth {
  padding: 30px;
  margin: 20px;
  border-radius: 10px;
  border: solid black 2px;
  display: flex;
  flex-direction: column;
}
```

### Добавление логики в Login
Данная функция будет отвечать за вход:
```
  const login = (e: React.SyntheticEvent):void => {
    e.preventDefault();
    signInWithEmailAndPassword(auth, email, password)
      .then((userCredentials) => {
        console.log(userCredentials);
      })
      .catch((err) => setError(err.message));
  };
```
Соответсвенно нужно подтянуть импорты: 
```
import { signInWithEmailAndPassword } from 'firebase/auth';
import React, { useState } from 'react';
import { auth } from '../../api/firebase';

```

Вход успешно осуществляется, но мы этого не видим, для удобства пользователя сделаем так, чтобы его переводило на нужный путь при удачном входе. 
Сделать это можно с помощью хука useNavigate: 
```
import { useNavigate } from 'react-router-dom';
```

```
  const navigate = useNavigate();

  const login = (e: React.SyntheticEvent): void => {
    e.preventDefault();
    signInWithEmailAndPassword(auth, email, password)
      .then((userCredentials) => {
        console.log(userCredentials);
        navigate('/');
      })
      .catch((err) => setError(err.message));
  };
```
Отлично, теперь, если пользователь осуществляет вход, его переводит на главную страницу.

## Создание приватного роута
Сделаем так, чтобы незалогиненных юзеров переводило на страницу входа.

Для этого требуется создать специальный компонент-обертку - который будет либо позволять пользователям увидеть нужный компонент, если у них есть на это права и они авторизованы, либо переводит их на страницу логин.
```
import React, { useContext } from 'react';
import { Navigate } from 'react-router-dom';
import AuthContext from '../../contexts/AuthContext';

export type ProtectedRouteProps = {
  outlet: JSX.Element;
};

export default function ProtectedRoute(
  { outlet }: ProtectedRouteProps): JSX.Element {
  const currentUser = useContext(AuthContext);
  if (currentUser) {
    return outlet;
  }
  return <Navigate to="/login" />;
}

```

```
<Route path="/" element={<ProtectedRoute outlet={<Profile />} />} />
```
Готово, теперь, когда юзер не залогинен, его будет переводить на страницу входа.

## Настройка переменных среды
Мы можем перенести ключи от firebase в отдельный файл, который мы внесем в .gitignore, чтобы ключи не попали вместе с остальным кодом в общий доступ.

Для того, чтобы это было возможно, необходимо установить пакет [env-cmd](https://www.npmjs.com/package/env-cmd).

Сделать это можно при помощи команды: `npm i env-cmd`

После этого создайте в корне проекта файл `.env.process`
В него вы можете положить свои ключи: 
```
REACT_APP_API_KEY = "ваш ключ"
REACT_APP_AUTH_DOMAIN = "ваш ключ"
REACT_APP_PROJECT_ID = "ваш ключ"
REACT_APP_STORAGE_BUCKET = "ваш ключ"
REACT_APP_MESSAGING_SENDER_ID = "ваш ключ"
REACT_APP_APP_ID = "ваш ключ"
```
Далее нужно изменить в package.json script для start:
```"start": "env-cmd -f .env.process react-scripts start",```
```
-f флаг можно использовать для указания пути до файла с переменными среды, по умолчанию - это корень проекта, но если бы мы хотели расположить его в другой папке, это можно было бы сделать так: 
"start": "env-cmd -f ../../.env.staging react-scripts start",
```

Последний шаг, это использовать переменные в файле firebase.ts 
Получится примерно следующее: 
````
const firebaseConfig = {
  apiKey: process.env.REACT_APP_API_KEY,
  authDomain: process.env.REACT_APP_AUTH_DOMAIN,
  projectId: process.env.REACT_APP_PROJECT_ID,
  storageBucket: process.env.REACT_APP_STORAGE_BUCKET,
  messagingSenderId: process.env.REACT_APP_MESSAGING_SENDER_ID,
  appId: process.env.REACT_APP_APP_ID
};
````
И не забудьте добавть в гитигнор строку: ``.env.process``

Обязательно перезапустите приложение!

## Todo list с базой данных 
### На сайте firebase
Cloud Database -> Creat database -> Start in test mode -> любая локация
Start a collection -> todos -> Auti-ID -> Field: todo Type:string Value: React with FB
### Настройка DB
Внутри ``firebase.ts`` следует:
- Добавить импорт:
```import { getFirestore } from 'firebase/firestore';```

- Инициализировать: 
```const db = getFirestore(app);```

- Добавить экспорт

### Создание компонента, в котором отображаются задачи 
```Todos.tsx```
```
import React, { useEffect, useState } from 'react';
import {
  DocumentData, collection,
  onSnapshot, orderBy, query,
} from 'firebase/firestore';
import { db } from '../../api/firebase';

export default function Todos(): JSX.Element {
  const [todos, setTodos] = useState<DocumentData[]>([]);
  const [input, setInput] = useState('');
  const q = query(collection(db, 'todos'), orderBy('timestamp', 'desc'));
  useEffect(() => {
    onSnapshot(q, (snapshot) => {
      setTodos(snapshot.docs.map((doc: DocumentData) => ({
        id: doc.id,
        item: doc.data()
      })));
    });
  }, [input]);
  return (
    <>
      <div>Todos</div>
      {todos.map((el) => (
        <div key={el.id}>
          {el.item.todo}
        </div>
      ))}
    </>
  );
}
```

### Добавление задач - addTodo
#### Логика:
```
  const [input, setInput] = useState('');
```
```
  const addTodo = (e: React.SyntheticEvent): void => {
    e.preventDefault();
    addDoc(collection(db, 'todos'), {
      todo: input,
      timestamp: serverTimestamp()
    });
    setInput('');
  };
```
### Форма для добавления
```
      <form onSubmit={addTodo} name="add_todo">
        <input
          type="text"
          value={input}
          required
          placeholder="What to do?"
          onChange={(e) => setInput(e.target.value)}
        />
        <button type="submit">Add</button>
      </form>

```

## Удаление
Достаточно добавить кнопки, deleteDoc, doc - это функции из библиотеки.
```
 {todos.map((el) => (
        <div key={el.id}>
          {el.item.todo}
          <button
            type="button"
            onClick={
              () => { deleteDoc(doc(db, 'todos', el.id)); }
            }
          >
            удалить
          </button>
        </div>
      ))}
 ```       

 ## Итоговый вид компопнента
```
import React, { useEffect, useState } from 'react';
import {
  DocumentData, addDoc, collection,
  deleteDoc,
  doc,
  onSnapshot, orderBy, query, serverTimestamp,
} from 'firebase/firestore';
import { db } from '../../api/firebase';

export default function Todos(): JSX.Element {
  const [todos, setTodos] = useState<DocumentData[]>([]);
  // eslint-disable-next-line @typescript-eslint/no-unused-vars
  const [input, setInput] = useState('');
  const q = query(collection(db, 'todos'), orderBy('timestamp', 'desc'));
  useEffect(() => {
    onSnapshot(q, (snapshot) => {
      setTodos(snapshot.docs.map((document: DocumentData) => ({
        id: document.id,
        item: document.data()
      })));
    });
    console.log(todos);
  }, [input]);

  const addTodo = (e: React.SyntheticEvent): void => {
    e.preventDefault();
    addDoc(collection(db, 'todos'), {
      todo: input,
      timestamp: serverTimestamp()
    });
    setInput('');
  };

  return (
    <>
      <div>Todos</div>
      <form onSubmit={addTodo} name="add_todo">
        <input
          type="text"
          value={input}
          required
          placeholder="What to do?"
          onChange={(e) => setInput(e.target.value)}
        />
        <button type="submit">Add</button>
      </form>
      {todos.map((el) => (
        <div key={el.id}>
          {el.item.todo}
          <button
            type="button"
            onClick={
              () => { deleteDoc(doc(db, 'todos', el.id)); }
            }
          >
            удалить
          </button>
        </div>
      ))}

    </>
  );
}

```
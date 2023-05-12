## Объекты и их свойства

### Object.keys, values, entries
Это методы, которые возвращают ключи, значения и пары ключ-значения соответственно.
Object.keys(someObj) – возвращает массив ключей
Object.values(someObj) – возвращает массив значений
Object.entries(someObj) – возвращает массив пар [ключ, значение], 

где someObj - это объект, к которого мы хотим что-то узнать

Пример:
```json lines
let human = {
    bones: "white",
    blood: "red",
    skin: "doesnt matter"
}

let a = Object.keys(human);
let b = Object.values(human);
let c = Object.entries(human)

console.log(a); // [ 'bones', 'blood', 'skin' ]
console.log(b); // [ 'white', 'red', 'doesnt matter' ]
console.log(c); // [
                //    [ 'bones', 'white' ],
                //    [ 'blood', 'red' ],
                //    [ 'skin', 'doesnt matter' ]
                //  ] 
```

### Object.assign 
Метод Object.assign() используется для копирования значений из исходного объекта в новый объект.
Для этого в скобках перым аргументом передаем ту переменную, В КОТОРУЮ хотим скопировать объект.
Вторым аргументом передаем переменную, содержащую копируемый объект.

Пример:
```json lines

let human = {
    bones: "white",
    blood: "red",
    skin: "doesnt matter"
}

let susan = {};
Object.assign(susan, human);
susan.age = 13;

console.log(human); // { bones: 'white', blood: 'red', skin: 'doesnt matter' }
console.log(susan); // { bones: 'white', blood: 'red', skin: 'doesnt matter', age: 13 }
```

### key in object
Возвращает true, если такой ключ присутствует в объекте, false = если нет.

Пример:
```json lines
let human = {
bones: "white",
blood: "red",
skin: "doesnt matter"
}

console.log("skin" in human); //true
```

###  for (key in object) {}
Цикл проходит через перечисляемые свойства объекта. Он пройдёт по каждому отдельному элементу.

Пример:
```json lines
let human = {
    bones: "white",
    blood: "red",
    skin: "doesnt matter"
}

for (bodyPart in human) {
    console.log(bodyPart.toUpperCase())   // BONES BLOOD SKIN
}
```

### оператор typeof
Оператор возвращает строку, указывающую тип операнда.

Пример: 
```json lines

let gadget = {
    samsung: "South Korea",
    apple: "USA",
    siemens: "Germany"
}

console.log(typeof gadget); // object
console.log(typeof 2); // number
console.log(typeof "miracle"); // string
console.log(typeof true); // boolean
console.log(typeof undefined); // undefined
console.log(typeof null); // object - исключение в JavaScript
```


## Методы массивов

### split(метод строки), join(метод массива) - часто используются в паре
Метод split нужен, чтобы разбить строку по какому-то символу на массив со строками.
Метод join нужен, чтобы собрать массив в одну строку по какому-то символу.

Пример:
```json lines
let apple = "a, p, p, l, e"

let appleArr = apple.split(", ")
console.log(appleArr) // [ 'a', 'p', 'p', 'l', 'e' ]

let appleWithDash = appleArr.join("/")
console.log(appleWithDash); // a/p/p/l/e
```

### slice
Метод используется для удаления элементов массива.
Он возвращает новый массив, в который копирует все элементы с индекса start до end (не включая end). 
Start и end могут быть отрицательными, в этом случае отсчёт позиции будет вестись с конца массива. 
Этот метод НЕ МУТИРУЕТ исходный массив.

Пример:
```json lines

let sisters = ["Sveta", "Masha", "Anna", "Zina"]

let twoSisters = sisters.slice(1, 3); // первый аргумент - с какого элемента начинаем отсчет, второй - по какой НЕ включительно
console.log(twoSisters); // [ 'Masha', 'Anna' ]

let threeSisters = sisters.slice(-1)  // указываем, с какого элемента с конца хотим вырезать элементы
console.log(sisters); // [ 'Sveta', 'Masha', 'Anna', 'Zina' ]
console.log(threeSisters); // [ 'Zina' ]
```

### splice
Метод используется для удаления или добавления элементов в исходный массив. 
Метод МУТИРУЕТ исходный массив и возвращает новый массив с выбранными элементами.

Пример:
```json lines

let arr = [1, 2, 3, 4, 5]

удалить элементы из массива
const splicedArr = arr.splice(1, 2)
console.log(arr); // [ 1, 4, 5 ]
console.log(splicedArr); // [ 2, 3 ]

удалить эл-т и вставить на его место новый эл-т
const arrWithstr = arr.splice(1, 1, "I love coding")
console.log(arrWithstr); // [ 2 ]
console.log(arr); // [ 1, 'I love coding', 3, 4, 5 ]

вставить новый эл-т без удаления
const addStr = arr.splice(2, 0, "Never give up!")
console.log(addStr); // [] - пустой массив, так как ничего не удалили
console.log(arr); // [ 1, 2, 'Never give up!', 3, 4, 5 ]
```

### reverse
Метод меняет порядок элементов в arr на обратный.

Пример: 
```json lines

let arr = [1, 2, 3, 4, 5]
console.log(arr.reverse()); // [ 5, 4, 3, 2, 1 ]
```

Полезные источники:

Документация [mozilla](https://developer.mozilla.org/ru/docs/Web/JavaScript/Guide)
Учебник [LearnJS](https://learn.javascript.ru/)

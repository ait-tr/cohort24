"use strict"
 
console.log("Привет JS");

let x;
x = 9;
const y = 12;
x = 144;

// тип string
let str1 = "Текст";
str1 = "Новая строка";
let str2 = 'Текст 2';

// тип number 
let num1 = 2;
let num2 = 2.2;
console.log(Number.MAX_SAFE_INTEGER);
console.log(Number.MIN_SAFE_INTEGER);

// арифметические операции: + - / * % **
// сумма
let sum = num1 + num2;
console.log(sum);
// вычитание
let dif = num1 - num2;
console.log(dif);
// деление
let dev = num1 / num2;
console.log(dev);
// остаток
let rem = 9 % 8;
console.log(rem);
// возведение в степень
let pow = 2 ** 3;
console.log(pow);

// тип boolean
// операторы сравнения 
let cond1 = 9 > 10;
console.log(cond1);
const cond2 = 10 >= 10; // true
const cond3 = 10 <= 9;  // false
const cond4 = 5 < 20;   // true
let isDrunk = true;
let isClever = false;

// тип bigint
let bigNumber = 12312n;
console.log(bigNumber);
// 
let variable;
console.log(variable); // undefined
variable = null;
console.log(variable); // null

// symbol
let symbol = Symbol("slovo");
console.log(symbol);

// Сравнение  "==", "===" 
// "===" - строгое с учетом типов
console.log(9 === "9"); // false
// == с преобразованием типов - после преобразования происходит сравнение
console.log(9 == "9");  // true
console.log("9" == 9); 

// coercion
let c1 = 9 + "15";      // "915"
console.log(c1);
let c2 = 11 + 9 + "15"; // "2015"
console.log(c2);
let c3 = "15" + 11 + 9; // 15119
const c4 = 1 + false; // 1
console.log(c4);
const c5 = 5 + true; // 6 
console.log(c5);
const c6 = false + "thought"; // falsethought
console.log(c6);
const c7 = 1 + false + "thought"; // 1thought
console.log(c7);
console.log(false + true);

console.log("12" / 6);

// Преобразование типов 
// неявное преобразование к строке:
let c8 = 12 + ''; 
// typeof определяет тип указанной переменной:
console.log(typeof c8 === 'string');

// неявно преобразование к числу:
// "12" -> 12
let c9 = + "12";
console.log(typeof c9 === 'number');

let c10 = 15 + +"12"; // 27

// Явные преобразования типов
// в стринг 
let c11 = String(12);
console.log(typeof c11 === 'string');
// в число 
let c12 = Number("пять"); // NaN - not a number
console.log(c12);

let c13 = Number("пять"); // NaN - not a number
console.log(c13);
console.log(typeof NaN); // number
Number.NaN; // такое специальное значение 
Number.NEGATIVE_INFINITY; // специальное значение 
Number.POSITIVE_INFINITY; // специальное значение 
// в булеан 
let c14 = Boolean("Apple"); // true
console.log(c14);

let c15 = Boolean("");      // false
console.log(c15);

let c16 = Boolean(12);      // true
console.log(c16);

let c17 = Boolean(-12);     // true
console.log(c17);

let c18 = Boolean(0);       // false
console.log(c18);

// Массив
// массив number
const arr = [1, 4, 7, 11];
console.log(arr);
// массив string
const arr2 = ["one", "two"];
console.log(arr2);
// как получить второй элемент
console.log(arr2[1]); // two

// заменим второй элемент на "orange"
arr2[1] = "orange";
console.log(arr2);

// пройдемся циклом for по arr
for(let i = 0; i < arr.length; i++){
  console.log(arr[i]);
}
// можем создать с помощью конструктора 
const arr3 = new Array(10).fill("Hey");
console.log(arr3);
// методы для добавления в массивa:
// добавляет в конец  - возвращает новую длину массива
const newLength = arr3.push("В конец");
console.log(arr3);
console.log(newLength);
// добавляет в начало - возвращает новую длину массива
arr3.unshift("В начало");
console.log(arr3);

// методы для удаления из массива: 
// удалить с конца 
// все эти методы мутируют исходный массив
// удаляет и возвращает элемент с конца 
const lastElement = arr3.pop();
// удаляет и возвращает элемент с начала 
const firstElement = arr3.shift();
console.log(lastElement);
console.log(firstElement);
console.log(arr3);







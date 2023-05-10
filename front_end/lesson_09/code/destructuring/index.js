// Spread syntax
// destucturing
const fruits = ["apple", "orange", "lemon", "banana"];
const [x, y, lemon] = fruits;
console.log(x);
console.log(y);
console.log(lemon);

// destucturing
const cars = ["BMW", "Mercedes", "Opel", "Ferrari"];
const [bmw, , opel] = cars;
console.log(bmw);
console.log(opel);

// spread
const countries = ["Germany", "Israel", "Italy", "France"];
const [germany, ...restElements] = countries;
console.log(countries);
console.log(germany);
console.log(restElements);

// copy array
const newCountries = [...countries];
newCountries.reverse();
console.log(newCountries);
console.log(countries);

// copy array and add elements
const oldCountries = ["Greece", ...countries];
console.log(oldCountries);

// copy two arrays in new array
const fruitsPlusCars = [...fruits, ...cars];
console.log(fruitsPlusCars);

// JS Functions 

// Function Declaration
// объявление функции
function print() {
  console.log("Функция print распечатывает этот текст");
}
// вызов функции
print();

// функция с параметрами
function sum(x, y) {
  return x + y;
}
console.log(sum(10, 35));
// что возвращает функция в которой нет return? 
console.log(print()); // undefined

// напишите функцию getSecondElement, которая принимает массив строк,
// возвращает второй элемент массива,
// используйте spread syntax 

// * напишите 
function getSecondElement(arr) {
  const [, second] = arr;
  return second;
}

let str = getSecondElement(["Berlin", "New York", "Amsterdam"]);
console.log(str);

// Function Expression
const hello = function () {
  console.log("Hello");
}
// вызов функции 
hello();

const goodbye = function () {
  console.log("Goodbye");
}
// более сложные функции, которые принимают в себя в качестве параметров другие функции
const complexFunction = function (f1, f2) {
  f1();
  f2();
}
// вызов - передаем функции в качестве праметров
complexFunction(goodbye, hello);

// Задание 2
// создайте четыре функции - сумма, вычитание, деление, умножение 
// создайте функцию calculate, которая принимает - функцию и два числа 
// три параметра: операция, число1, число2
// пусть функция возвращет результат выполнения операции с этими числами

const add = function (a, b) {
  return a + b;
}

const subtract = function (a, b) {
  return a - b;
}

const multiply = function (a, b) {
  return a * b;
}
const divide = function (a, b) {
  return a / b;
}

const calculate = function (operate, a, b) {
  return operate(a, b);
}

const result = calculate(multiply, 10, 14);
console.log(result);

// Arrow function
// однострочная стрелочная функция
const powOfTwo = (a) => a * a;
const res2 = powOfTwo(3);
console.log(res2);
// блочный вариант того же самого
const powOfTwoVersion2 = (a) => {
  return a * a;
}
console.log(powOfTwoVersion2(3));

// анонимная функция и ее вызов 
() => { console.log("Hey anonymus") };
// вызов анонимной функции
(() => { console.log("Hey anonymus") })();

// пример использования ad hoc
console.log(calculate((a, b) => a * b - a, 12, 16));
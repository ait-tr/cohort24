console.log("Типизация в TS");

// Типизация
// неявная implicit 
let x = 10;         // неявная типизация 
let y: number = 20; // явная типизация

// При неявной типизации - может выбрать не тот тип, который нам нужен.

let isDrunk: boolean = true;
let str1: string = "Wonderful instance of text";

// number | boolean - это юнион тип
// создали тип OurSpecialType
// n.b. Типы пишутся с большой буквы
// Юнион 
type OurSpecialType = number | boolean;
x = 12;
// x = "12"; // здесь ошибка - не тот тип
let p: OurSpecialType = 110;
const q: OurSpecialType = true;
// задать другое значение переменной, если оно подходит под тип переменной
// p = true;

// типизировать массива - и она просиходит также как в Java
const arr: string[] = ["apple", "orange", "lemon"];

// типизация объектов 
// тип интерфейс
interface User {
  name: string;
  age: number;
  isAdmin: boolean;
}
// создали объект указанного типа
const bob: User = {
  name: "Bob",
  age: 34,
  isAdmin: false
};
// Здесь будет ошибка:
// const sam: User = {
//   name: "Sam",
//   age: 34
// };
// Тип для оружия либо "pistol" "saber"
type Weapon = "pistol" | "saber";
type Ship = "caravella" | "fregat";

interface Pirate {
  name: string;
  weapon: Weapon;
  parrotName?: string; // опциональное поле - отметили его занком вопроса
  ship: Ship;          // обязательное поле
}

const captainJackSparrow: Pirate = {
  name: "Captain Jack Sparrow",
  weapon: "pistol",
  ship: "fregat"
}
// пистолет намок - думаю лучше взять саблю
captainJackSparrow.weapon = "saber";
// записали значение в поле попугай
captainJackSparrow.parrotName = "Amber Heard";
// интерфейсы 
// создать новый тип - который бы расширял функционал базового типа
// мы создать на основании одного интерфейса другой 

interface PirateWithMonkey extends Pirate {
  monkey: string;
}

const blackBeard: PirateWithMonkey = {
  monkey: "Apu",
  name: "Black Beard",
  weapon: "pistol",
  ship: "caravella"
}
console.log(blackBeard);

console.log(typeof blackBeard);
console.log(typeof p);
console.log(typeof q);
let l: OurSpecialType;
// console.log(typeof l); // здесь ошщибка- не можем использовать до инициализации 

// Типизация функций
// после скобочек указываем тип возвращаемого значения 
function sum(x: number, y: number): number {
  return x + y;
}
// Как расширить тип юнион 
type Gender = "male" | "female"; // традиционная система ценностей
const gender1: Gender = "female";


type ExtendenedGender = Gender | "non-binary person";
const gender2: ExtendenedGender = "non-binary person";

// Типизация стрелочной функции
// в скобочках (имяПараметра: тип):типВозращаемогоЗначения
const divide = (a: number, b: number): number => a / b;

// any - это что-то вроде Object - максимально недетализированный тип
// js можно представить как TS, где у всех переменных тип any

// Tuple Кортеж
type UserInfo = [string, number, boolean];
let t = ["Ivan", 28, true];


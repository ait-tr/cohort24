// Методы массивов

// 1. map - не мутирует исходный массив 
// - создает новый массив на основании данных из старого массива
const spells = ["cruciatus", 'spectlo', 'patronus', 'lux'];

const empoweredSpells = spells.map((spell) => "magus " + spell);
console.log(spells);
console.log(empoweredSpells);

const numbers = [3, 9, 18, 27, 67];
// создадим новый массив на основании numbers, чтобы в новом массиве все значения были больше 10 
const newNumbers = numbers.map((number) => 10 + number);
console.log(newNumbers);

// тоже самое но блочные функции
const newNumbers2 = numbers.map((number) => {
  // console.log(number);
  return 10 + number;
});
console.log(newNumbers2);
//  продвинутое использование 1 - указание индекса элемента
//  первая переменная === текущий элемент 
//  вторая переменная === индекс текущего элемента
const beasts = ["hyppogrif", "unicorn", "manticora", "dragon"];
const indexedBeasts = beasts.map((beast, index) => {
  // console.log(beast);
  // console.log(index);
  return index + beast;
});
console.log(indexedBeasts);

const magicians = [
  { name: "Dambledoor", age: 117, wand: "fenix" },
  { name: "Harry Potter", age: 12, wand: "fenix" },
  { name: "Hermione Grenger", age: 12, wand: "unicorn" },
  { name: "Ron Whisley", age: 13, wand: "dragon" }
];

// создайте массив строк по образцу 
// ["Dambldoor, age: 117, wand-material: fenix", ...]
const strArr = magicians.map((magician) =>
  `${magician.name}, age: ${magician.age}, wand-material: ${magician.wand} `);
console.log(strArr);

// 
{ // поместим в отдельный блок кода
  const name = "Ivan Dolin";
  const age = 36;
  // "Иван Долин родился 36 лет назад"
  const str1 = name + " родился " + age + " лет назад";
  const str2 = `${name.toUpperCase()} родился ${age} лет назад`;
  console.log(str1);
  console.log(str2);
}

// 2. reduce - не мутирует массив - возвращет значение аккумулятора
//   редуцировали массив к сумме его значений
const numbersOfPlayers = [18, 26, 37, 3, 4, 15];
// получим сумму этих чисел
const sum = numbersOfPlayers.reduce((acc, currentElement) => acc + currentElement, 0);
console.log(sum);
console.log(numbersOfPlayers);

const str2 = strArr.reduce((acc, str) => acc + "***" + str);
console.log(str2);
// посчитаем общий возраст волшебников из массива magicians 
// первый аргумент: (acc, magician)=> acc + magician.age
// второй аргумент: 0  -это начальное значение аккумулятора
const magiciansTotalAge = magicians.reduce((acc, magician) => { return acc + magician.age }, 0);
console.log(magiciansTotalAge);

//  цепочки вызовов функций // chains 
const totalAge2 = magicians.map((element) => element.age).reduce((acc, age) => acc + age);
console.log(totalAge2);

// также можно обращаться к индексу
const arr3 = [10, 20, 30];
const res = arr3.reduce((acc, element, index) => {
  console.log(acc);
  console.log(index);
  console.log(element);
  return acc + index * element;
}, 0);
console.log(res);

// 3. forEach - не возвращает новый массив - !!! возвращает undefined !!!
// если нужно сделать операцию для кажого элемента 
const res2 = arr3.forEach((element) => { console.log(element); })
console.log(res2);

// 4. filter - не мутирующий 
const magician2 = [
  { name: "Garry", isGood: true },
  { name: "Dambledoor", isGood: true },
  { name: "Volandemort", isGood: false },
  { name: "Malfoy", isGood: false }
];
//     более короткая запись   .filter((element) => element.isGood)  - такие элементы - которые хорошие  
const goodMagicians = magician2.filter((element) => element.isGood === true);
//     более короткая запись   .filter((element) => !element.isGood)   - такие элементы - которые не хорошие  
const evilMagicians = magician2.filter((element) => element.isGood === false);
console.log(goodMagicians);
console.log(evilMagicians);

const magicians2 = [
  { name: "Dambledoor", age: 117, wand: "fenix" },
  { name: "Harry Potter", age: 12, wand: "fenix" },
  { name: "Hermione Grenger", age: 12, wand: "unicorn" },
  { name: "Ron Whisley", age: 13, wand: "dragon" }
];
// выберу по двум условиям - останутся только удовлетворяющие им элементы
// wand === "fenix" 
// age > 12

const magArr3 = magicians2.filter((element) => (element.wand === "fenix" && element.age > 12));
console.log(magArr3);

// 5. some - возвращает boolean 
// - что хотя бы один элемент удовлетворяет указанному условию 
const magician3 = [
  { name: "Garry", isGood: true },
  { name: "Dambledoor", isGood: true },
  { name: "Volandemort", isGood: false },
  { name: "Malfoy", isGood: false }
];
const res3 = magician3.some((element) => element.isGood === false);
console.log(res3); // true
const res4 = magician3.some((element) => element.name === "Snape");
console.log(res4); // false
// 6. every - возвращает boolean
// - все элементы удовлетворяет указанному условию 
const res5 = magician3.every((element) => element.isGood === false);
console.log(res5); // false - потому что не все злые 



// У вас есть массив объектов:
const arr = [
  { brand: "BMW", price: 20000, isDizel: true },
  { brand: "Mercedes", price: 22000, isDizel: false },
  { brand: "Porshe", price: 50000, isDizel: true },
  { brand: "Nissan", price: 25000, isDizel: false },
];
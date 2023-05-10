"use strict"
// ### Задание 1
// Создайте массив из следующих элементов: "Семен", "Иван", "Петр", "Татьяна".
// Создайте еще один массив с возрастами: 18, 27, 74, 34;
// Создайте и заполните при помощи цикла этот новый массив новыми элементами по образу: "Семен 18 лет/годов"

const names = ["Семен", "Иван", "Петр", "Татьяна"];
const ages = [18, 27, 74, 34];
const namesAges = new Array(); //
for(let i = 0; i < names.length; i++){
  // version 1
  // namesAges[i] = names[i] + " " + ages[i] + " лет/годов";
  // version 2
  namesAges.push(names[i] + " " + ages[i] + " лет/годов");
}
console.log("****");
console.log(namesAges);


// const arr2 = [];
// arr2[8] = "Vadim";
// console.log(arr2);
// console.log(arr2[1]);
// console.log(arr2.length);


// ### Задание 2 
// Используя пройденные на занятии методы массива получите из этого массива новый массив, в котором элементы идут в обратной последовательности.

// version with mutation - not good
// const reversedArr = namesAges.reverse();
// console.log(namesAges);
// console.log(reversedArr);

// version 1
// const reversedArr = [];
// for(let i = namesAges.length - 1; i >= 0; i--){
//   reversedArr.push(namesAges[i]);
// }
// console.log(reversedArr);

// version 2
// const reversedArr = [];
// for(let i = 0; i < namesAges.length; i++){
//   reversedArr.unshift(namesAges[i]);
// }
// console.log(reversedArr);

// version 3
// for of   в джаве называлось for-each
const reversedArr = [];
for(const element of namesAges){
  reversedArr.unshift(element);
}
console.log(reversedArr);
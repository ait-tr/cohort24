// ### Задание 1
// Создайте стрелочную функцию, которая бы принимала массив и цифру, возвращала бы элемент массива под этим индексом.

// ### Задание 2 
// Создайте функцию, которая бы принимала бы следующие параметры: 
// - код погоды
// - функция decode, которая дает расшифровку погоды по коду. 
  
// Функция должна возвращать строку, описывающую погоду.
// ### Таблица соответствия код-описание: 
//  - SQ – шквал
//  - PO – пыльный вихрь
//  - FC - торнадо
//  - BR – дымка (видимость от 1 до 9 км)
//  - HZ – мгла (видимость менее 10 км)
//  - FU – дым (видимость менее 10 км)
//  - DS - пыльная буря (видимость менее 10 км)
//  - SS - песчаная буря (видимость менее 10 км)

// Подсказка: удобно использовать в одном из методов switch-case:
// ```

// const getElementBYIndex = (array, index) => {
//     return array[index];
// };

// Задание 1
const getElementByIndex = (array, index) => array[index];
const arr = ["Apple", "Orange", "Mango", "Lime"];
let result = getElementByIndex(arr, 1);
console.log(result);

// Задание 2
const decode = (code)=>{
  switch(code){
    case "SQ":
      return "шквал";
    case "PO": 
      return "пыльный вихрь";
    case "BR": 
      return "пыльный вихрь";
    case "HZ": 
      return "мгла";
    case "SS": 
      return "песочная буря";
    default:
      return "";
  }
};
console.log(decode("PO"));

const getWeather = (decode, code)=> {
  return decode(code);
};

console.log(getWeather(decode, "HZ"));;



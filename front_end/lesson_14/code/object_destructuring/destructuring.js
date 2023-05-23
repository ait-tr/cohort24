// Destructuring assignment
// Example 1
const user = { name: "Igor", age: 34, isMale: true };
// как получить значения из полей в отдельный переменный 
// порядок следования переменных не играет роли
// так обязательно перечислять все поля можно взять только нужные
const { age, name, isAdmin } = user;
console.log(name);   // "Igor"
console.log(age);    // 34
console.log(isAdmin);// undefined

// Example 2 
const kid = { familyName: "Kotov", dateOfBirth: new Date() };
const { familyName, dateOfBirth } = kid;
console.log(familyName);
console.log("Часы: " + dateOfBirth.getHours());
console.log("Минуты: " + dateOfBirth.getMinutes());
console.log(`${dateOfBirth.getHours()}:${dateOfBirth.getMinutes()}`);
console.log(dateOfBirth.toLocaleDateString());
console.log(new Date().toLocaleDateString('de-DE', { weekday: 'long', year: 'numeric', month: 'long', day: 'numeric' }));

// Example 3
const finland = { population: 5_000_000, title: "Finland" };
// хотим сохранить значения поля population в переменную с другим названием 
const { population: populationOfFinland, title } = finland;
// создали переменную другую по названию чем поле нашего объекта
console.log(populationOfFinland);
console.log(title);

// Example 4
const israel = { population: 6_000_000, title: "Israel", mostCommonName: "Adam" };
// значения по умолчания // применяется только undefined
// то есть есть ли было значение у поля какое-то - то оно и останется
const { population: populationOfIsrael, title: titleOfIsrael, mostCommonName = "Asaf" } = israel;
// создали переменную другую по названию чем поле нашего объекта
console.log(populationOfIsrael);
console.log(titleOfIsrael);
console.log(mostCommonName);

// Example 5
// spread syntax 
// spread operator ...
const france = { capital: "Paris", population: 67_000_000 };
// скопируем поля из объекта france
const newFrance = { ...france, numberOfCruasant: 1_000_000 };
console.log(newFrance);

newFrance.capital = "Berlin";
console.log(france);
console.log(newFrance);

// Example 6
// скопировать, но заменить значения на нужные у некоторых полей
const oldFrance = { ...france, population: 37_000_000 };
console.log(oldFrance);

// Example 7 
// сложный случай 
const arr = [
  { name: "Max", color: "green" },
  {
    name: "Igor", color: "green",
    possessions: [{ title: "Porsche" }, { title: "gold cup", price: 1_000_000 }]
  },
  { name: "Vlad", color: "green" }
];
// как получить цену
// igor - это случайное слово, только позиция играет роль при дестр. массива
// вариант 1 
const [,igor] = arr;
const {possessions} = igor;
const [,goldenCup] = possessions;
const {price} = goldenCup; 
console.log(price);
// вариант 2
// const [,{possessions}] = arr;
// const [,{price}] = possessions;
// console.log(price);

// вариант 3
// const [, {possessions: [,  {price}] } ] = arr;
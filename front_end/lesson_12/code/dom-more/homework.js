// ##  Homework

// ### Задание 1
// Перепишите задание прошлого урока, используя методы get и set

// ---> Задание прошлого урока:
// Создайте классы:Plant, Rose. Роза должна наследовать Растение.
// Пусть у растения будут поля: рост, возраст. И метод grow, который увеличивает его рост на 10 см.
// У розы должно быть поле - количество бутонов (numberOfFlowers).
// Создайте объект класса розы, вызовите метод.

class Plant {
  #height;
  #age;
  constructor(height, age) {
    this.#height = height;
    this.#age = age;
  }
  get height() {
    return this.#height;
  }

  get age() {
    return this.#age;
  }

  set height(height) {
    this.#height = height;
  }

  set age(age) {
    this.#age = age;
  }

  grow() {
    this.#height += 10;
  }
}

class Rose extends Plant {
  #numberOfFlowers;
  constructor(height, age, numberOfFlowers) {
    super(height, age);
    this.#numberOfFlowers = numberOfFlowers;
  }
  get numberOfFlowers() {
    return this.#numberOfFlowers;
  }
}
const teaRose = new Rose(30, 2, 13);
console.log(teaRose.age);
console.log(teaRose.height);
console.log(teaRose.numberOfFlowers);
teaRose.grow();
console.log("After the call of grow method the height has changed: ");
console.log(teaRose.height);

// ### Задание 2
// Создайте объект garden с несколькими свойствами, например (orange, apple, pear и др.).  
// 1. При помощи синтаксиса for (key in object) {} измените название ключей, сделав все их 
// буквы заглавными
// 2. При помощи синтаксиса for (key in object) {} выведите значения всех ключей
// 3. Используйте синтаксис for (key in object) {} и добавьте проверку на наличие ключа "apple".
// Если такой ключ существует, то выведите в консоль значение ключа "pear",  
// присвоив ему новое значение "delicious"  

class Garden {
  constructor(orange, apple, pear){
    this.orange = orange;
    this.apple = apple;
    this.pear = pear;
  }
}
// 2.1
// const garden = {orange: 12, apple: 10, pear: 3}; // объект-литерал object-literal
const garden = new Garden(12, 10, 3);  // с помощью конструктора создали объект 
// промeжуточный вариант: Garden { orange: 12, apple: 10, pear: 3, ORANGE: 12, APPLE: 10, PEAR: 3 }
for(key in garden){
  // console.log(key.toUpperCase());
  const newKey = key.toUpperCase();
  garden[newKey] = garden[key];
  delete garden[key];
}
console.log(garden);

// 2.2
console.log("*".repeat(10)+ " 2.2 " + "*".repeat(10));
for(key in garden){
  console.log(garden[key]);
}

// 2.3

// Используйте синтаксис for (key in object) {} и добавьте проверку на наличие ключа "apple".
// Если такой ключ существует, то выведите в консоль значение ключа "pear",  
// присвоив ему новое значение "delicious"  

console.log("*".repeat(10)+ " 2.2 " + "*".repeat(10));
// coersion 1. string 2. number 3. boolean
for(key in garden){
  if(key === "APPLE"){ // in the task it should have been in small letters
    console.log(garden.pear = "delicious");
  }
}
// два метода для проверки наличия ключей в объекте
console.log(garden.hasOwnProperty("apple"));
console.log(garden.hasOwnProperty("APPLE"));
console.log(Object.hasOwn(garden, "APPLE"));

// ### Задание 3
// + Создайте строку classmates. Перечислите в ней имена нескольких студентов.  
// Разбейте строку, используя метод split, положите значение в константу classmatesArr  
// Затем соедините массив, используя метод join, положите значение в константу newClassmates  
const classmates = "John, Bob, Frank, Joe, Anna, Roxanna";
console.log(classmates);
const classmatesArr = classmates.split(", ");
console.log(classmatesArr);
const newClassmates = classmatesArr.join(", ");
console.log(newClassmates);
// ### Задание 4
// Cоздайте массив currency, положите в него 6 разных значений.  
// Создайте переменную newCurrency.  
// Используя метод splice, удалите из массива 3 элемента, начиная со второго,  
// и вместо удаленных элементов вставьте 1 элемент со значением "I will earn big money by programming".  
// Все это положите в переменную newCurrency.  
// Выведите в сонсоль currency и newCurrency, посмотрите, мутировал ли исходныц массив.  

const currency = [123, 12, 23, 28, 39, 67];
const newCurrency = currency.splice(1, 3, 'I will earn big money by programming');
console.log(currency);
console.log(newCurrency);


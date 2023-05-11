
// Object literal
// создали объект
const user = {
  name: "John",
  age: 15,
  isMale: true
};

console.log(user);
// получили доступ к свойству объекта
console.log(user.name);
// менять значения по ключу
user.name = "Joahnna";
user.isMale = false;
console.log(user);
// можем добавлять ключ в кавычки
// можем ставить или не ставить запятую у последней пары ключ-значения
const user2 = {
  "name": "Bob",
  "age": 18
};
console.log(user2.name);

// представим, что ключ состоит из двух слов: has dog
const user3 = {
  name: "Sam",
  age: 39,
  "has dog": true,
}

console.log(user3.name);
console.log(user3["has dog"]); // если свойство с пробелами - то obj["attribute name"]

let name = "Fred";
const user4 = {
  name,
  age: 18,
  isMale: true
}

console.log(user4.name);
let age = 18;
let isMale = true;
const user5 = { name, age, isMale };

// methods
const user6 = {
  name: "Pete",
  age: 26,
  hello() {
    console.log("Hello!");
  }
}
// вызов метода
user6.hello();

// Прототипное наследование 
const bike = {
  brand: "Linux",
  price: 400,
  drive() {
    console.log("Br-br-br-br Whooo");
  }
};

// __proto__ - по два нижних подчеркивания с каждой стороны 
const mountainBike = {
  __proto__: bike,
  speeds: 7
}

mountainBike.drive();
// Задание 1
// Создайте переменную brand  с значением "BMW".

// Создайте объект car с полями: brand, price, doors.
// в поле бренд - "BMW", остальные на ваше усмотрение
// В объекте car долже быть метод drive(personName) 
// при вызове --> Едем, пассажир: <имя пассажира>

// Создайте объект ferrari c дополнительным полем:
// color и значением в этом поле: "yellow".

let brand = "BMW";

const car = {
  brand,
  price: 25000,
  doors: 2,
  drive(personName) {
    console.log("Едем, пассажир: " + personName);
  }
}

const ferrari = {
  __proto__: car,
  color: "yellow"
};

ferrari.drive("Bill Black");
console.log(ferrari.brand = "ferrari");
console.log(ferrari.brand);

// Class
// объявление класс
class Animal {
  constructor(age, breed, title) {
    this.age = age;
    this.breed = breed;
    this.title = title;
  }
  info() {
    console.log("Меня знают под именем " + this.title);
  }
}
// создание экземпляра класса
const panda = new Animal(2, "panda red", "panda");
console.log(panda);
panda.info();

const bamboo = {
  height: 3,
  color: "yellow"
};
delete bamboo.color; // если хотите удалить свойство - можно воспользоваться delete
console.log(bamboo);

delete panda.breed;
console.log(panda);
panda.breed = "Bandus usual";
console.log(panda);
console.log(panda instanceof Animal);

// inheritance
class Parrot extends Animal {
  constructor(age, breed, title, feathersColor) {
    super(age, breed, title);
    this.feathersColor = feathersColor;
  }
}

const kesha = new Parrot(2, "Cockatoo", "Kesha", "green and yellow");
console.log(kesha);
kesha.info(); // console.log("Меня знают под именем " + kesha.title);

// Создайте класс Алкоголь с полями:
// - название
// - крепость
// - объем
// - метод drink - который в консоль "Приятно выпить <имя напитка>";

// Создать дочерний класс коньяк c полями:
// - годы выдержки
// - страна происхождения. 

// Создайте еще класс Мартини с полями:
// - isBlack - это поле булеан

// создайте экземпляры данных классов - коньяк и мартини 
class Alcohol {
  constructor(title, strength, volume) {
    this.title = title;
    this.strength = strength;
    this.volume = volume;
  }
  drink() {
    console.log("Приятно выпить " + this.title);
  }
}

class Cognac extends Alcohol {
  constructor(title, strength, volume, age, countryOfOrigin) {
    super(title, strength, volume);
    this.age = age;
    this.countryOfOrigin = countryOfOrigin;
  }
}

class Martini extends Alcohol {
  constructor(title, strength, volume, isBlack) {
    super(title, strength, volume);
    this.isBlack = isBlack;
  }
}

const blackLabel = new Martini("Black Label", 12, 0.7, false);
const ararat = new Cognac("Ararat", 30, 1, 10, "Armenia");
blackLabel.drink();
ararat.drink();

// getters, setters
class Square {
  #side;
  constructor(side) {
    this.#side = side;
  }
  get side() {
    return this.#side;
  }
  set side(value) {
    this.#side = value;
  }
  get area() {
    return this.#side ** 2;
  }
}

const square1 = new Square(4);
console.log(square1.side);
console.log(square1.area); // обратите внимаение - без вызова 
console.log(square1);
// как воспользоваться setter 
square1.side = 8;
console.log(square1.side);
delete side; // не получилось :(
console.log(square1.side);

// создайте класс Сircle с защищеным полем radius 
// создайте сеттерры и гетеры 
// и метод get area - который бы возвращал площадь круга
// Создайте объект круг и вызовите метод

class Circle {
  #radius;
  constructor(radius) {
    this.#radius = radius;
  }
  set radius(value) {
    this.#radius = value;
  }
  get radius() {
    return this.#radius;
  }
  get area() {
    return Math.pow(this.#radius, 2) * Math.PI;
  }
}

const circle = new Circle(5);
console.log(circle.area);
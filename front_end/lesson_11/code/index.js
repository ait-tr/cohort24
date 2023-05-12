// Объекты и их свойства

let weekends = {
    saturday: 6,
    sunday: 7,
    "favorite day": "monday"
}

// console.log(weekends.saturday);
// console.log(weekends["favorite day"]);

// delete weekends["favorite day"];
// console.log(weekends);

// delete weekends.sunday;
// console.log(weekends);

const breakfast = {
    spoon: 1,
    eggs: 2,
    butter: 5
}

// breakfast.butter = 3;
// console.log(breakfast.butter);

// key in object
console.log("butter" in breakfast); //true

if ("butter" in breakfast) {
    breakfast.butter = 3
}

console.log(breakfast);
let resultArr = Object.keys(breakfast)
let result = resultArr[2] = "bread"

console.log(result);

// for in
// синтаксис for (key in object) {}

let family = {
    father: "Misha",
    mother: "Sveta",
    son: "Denis",
    age: 34
}

for (let member in family) {
    console.log(member.toLocaleUpperCase());
}

// for (let member in family) {
//     if (typeof(family[member]) === "string") {
//         console.log(family[member].toUpperCase());
//     }
//     number = "number"
//     if (typeof(family[member]) === number) {
//         console.log(family[member]);
//     }
// }


function cookDinner(potato, onion) {
    return {
        potato: potato, // можно написать просто potato
        onion: onion // можно написать просто onion
    };
}

let fridayDinner = cookDinner(4, 1)
console.log(fridayDinner);


// Создайте функцию learnProgramming, которая принимает в себя аргументы JS, TS, 
// и создает объект с такими же свойствами
// Затем создайте переменную learnFrontend, используя функцию learnProgramming, в которой зададите количество часов JS и TS (указать цифру)
// Добавьте в вашу переменую learnFrontend свойство Java, выведите в консоль переменную


function learnProgramming(js, ts) {
    return {
        js,
        ts
    }
}

let learnFrontend = learnProgramming(40, 30)
console.log(learnFrontend);

learnFrontend.java = 15;
console.log(learnFrontend);



// Object.keys 

let room = {
    walls: "grey",
    door: "white"
}

let roomKeys = Object.keys(room) // получили массив ключей
// console.log(roomKeys);

let newRoom = {};

for (let i = 0; i < roomKeys.length; i++) {
    if (roomKeys[i] === "walls") {
        newRoom["table"] = room[roomKeys[i]];
    } else {
        newRoom[roomKeys[i]] = room[roomKeys[i]]
    }
}

// console.log(newRoom);

room = newRoom;

console.log(room);



// Object.assign()

let school = {
    pupils: 100,
    teachers: 20
}

let higherScool = {}
Object.assign(higherScool, school)

// console.log(higherScool);
// console.log(secondSchool);
higherScool.slass = 1

console.log(higherScool);
console.log(school);


// Методы массивов
// push () – добавляет элементы в конец
// pop() – извлекает элемент с конца
// shift() – извлекает элемент с начала
// unshift() – добавляет элементы в начало

//split - метод для строки, join - метод массива

let studensStr = "Andrii, Vadim, Andrii, Valentina, Maksim, Elena, Leon"


// console.log(studensArr.length);

let splittedStudents = studensStr.split(", ").reverse().join(" \"\" ")
console.log(splittedStudents);

// let againTogether = splittedStudents.join("__")
// console.log(againTogether);


let array = ["blabla", 2, true, Symbol, null]

let resArr = array.join("---")
console.log(resArr);

// console.log(a);
// let a 

// console.log(b);

// function check () {
//     var b = 5
// }

// console.log(b);

// reverse()
let gradesArr = [1, 5, 9]
console.log(gradesArr.reverse());


// slice - чтобы вырезать эл-ты массива и вернуть их в новом массиве
let sisters = ["Sveta", "Masha", "Anna", "Zina"]

// console.log(sisters.slice(1, 3));

twoSisters = sisters.slice(-2)
console.log(sisters);
console.log(twoSisters);

//splice  - чтобы удалять или добавлять элементы в массив 
let arr = [1, 2, 3, 4, 5]

// удалить элементы из массива
// const splicedArr = arr.splice(1, 2);
// console.log(arr);
// console.log(splicedArr);

// console.log(arr.indexOf(4));


// удалить эл-т и вставить на его место новый эл-т
// const arrWithstr = arr.splice(1, 1, "I love coding")
// console.log(arrWithstr);
// console.log(arr);

// вставить новый эл-т без удаления
// const addStr = arr.splice(2, 0, "kfjvkevhdfkj")
// console.log(addStr);
// console.log(arr);

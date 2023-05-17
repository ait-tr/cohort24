// EventLoop, timers, Promise, then 

// console.log(1);
// console.log(2);

function start() {
    console.log('start1');
    console.log('start2');
}

function end() {
    console.log('3');
    start()
    console.log('4');
}

// end()

// создаем асинхронность
// console.log("one");
// console.log("two"); 

// setTimeout(() => {
//     console.log("Hey, timeout!");
// }, 3000)

// console.log("three");

// setTimeout(() => {
//     console.log("А я выполнюсь раньше или позже?");
// }, 0)

// напишите функцию, которая принимает слово и выводит его через
// 9 секунд. Назовите ее latePrint

function latePrint(word) {
    setTimeout(() => {
        console.log(word);
    }, 9000)
}
// вызов функции
// latePrint("hehehe");


// функция setInterval будет работать непрерывно, пока мы ее не остановим
// const ourInterval = setInterval(() => {
//     console.log("Буду появляться каждые 3 секунды");
// }, 3000)

// чтобы остановить, используем clearInterval

// setTimeout (() => {
//     clearInterval(ourInterval)
// }, 10000)

// Создайте функцию, которая будет выводить фразу "орилрлоири" с интервалом 3 сек.
//  Остановите выполнение функции через 9 секунд

function vivaAsynchrony() {
    const interval = setInterval(() => {
        console.log("Да здравствует асинхронность!");
    }, 3000)
    setTimeout(() => {
        clearInterval(interval)
    }, 9000)
}

// vivaAsynchrony()

// Промисы

// мы пробовали вернуть число 5
// function getNumber() {
//     console.log(2);
//     setTimeout(() => {
//         return 5
//         // console.log(3);
//     }, 0)
// }

// console.log(getNumber());
// console.log(result);

// когда хотим создать внутри функции переменную и вернуть её же
// function getNumber() {
//     let num;
    
//     setTimeout(() => {
//       num = 5;
//     }, 3000);
    
//     return num;
//   }
  
//   console.log(getNumber())

function getNumber() {
    setTimeout(() => {
        return 5;
    }, 3000)
}

// let result = getNumber()
// console.log(result); // undefined, так как код еще не выполнился

// чтобы решить проблему, используем Промис
// resolve = успешный результат выполнения функции, reject - в случае отказа, то есть невыполнения
let promice = new Promise(function(resolve, reject) {
    setTimeout(() => {
        resolve(5)
    }, 3000)
})

// console.log(promice);
// const ourFive = promice.then((value) => {
//     let result = console.log(value);
// })

// создадим Промис с reject
let promice2 = new Promise(function(resolve, reject) {
    setTimeout(() => {
        reject (new Error("Ошибкааааа!!!!!"))
    }, 4000)
})

// promice2.catch((err) => console.log(err))


function getNumber5(exression) {
        return new Promise(function(resolve, reject) {
            if (exression) {
                resolve(exression)
            } reject (new Error("Ошибкааааа!!!!!"))
        })
    } 


getNumber5()
.then((data) => console.log(data))
.catch((err) => console.log(err))





// Задайте функцию loadNumber, которая возвращает Промис, а в промисе число 12. 
// Причем внутри промиса лежит setTimeout, который выполнится через 8 сек.
// Затем обработайте эту функцию с помощью then
// Выведите в консоль console.log("Inside callback" + value)

function loadNumber() {
    return new Promise(function(resolve, rej) {
        setTimeout(() => {
            resolve(12)
        }, 2000)
    })
}

const loadNumberResult = loadNumber()
loadNumberResult.then((value) => {
    console.log(`Inside callback ${value}`) // можно через бэктики, а можно через конкатенацию
})

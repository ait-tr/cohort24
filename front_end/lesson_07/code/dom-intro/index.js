//чтобы посмотреть код в консоли браузела
console.log("Привет, Java Script!");

// слово let означает, что мы задаем переменную
let word = "я слово";
// на следующей строке мы переопределяем переменную
word = 'уже другое слово';

// слово const означает, что мы тоже задали переменную, но ее нельзя переопределить
const something = "какой-то текст";
// something = "хочу изменить текст"

let myNumber = 20;
//проверить тип данных
// console.log(typeof myNumber);
myNumber = "теперь не число, а строка";

console.log(myNumber);

//getElementById позволяет получить элемент по id
const btn = document.getElementById("btn1");
console.log(btn);

//getElementsByClassName позволяет получить элемент по имени класса
let text = document.getElementsByClassName("text");
//выводим весь массив данных
console.log(text);
//выводим один элемент массива
console.log(text[2]);


//getElementsByTagName позволяет получить элемент по тегу
let pumkinByTeg = document.getElementsByTagName("a");
//выводим первый элемент
console.log(pumkinByTeg[0]);

//Создание элемента
//создать элемент с тегом h2, и в нем ничего нет
const heading = document.createElement("h2");
console.log(heading);
document.body.appendChild(heading)

//создать текст для элемента
const textNode = document.createTextNode("Дом - это узелки")

//кладем текст внутрь элемента
heading.appendChild(textNode)
console.log(heading); //только после этого заголовок появится на странице


//создаем div
const newDiv = document.createElement("div")
const coding = document.createTextNode("я люблю кодить")
newDiv.appendChild(coding)
console.log(newDiv);


//другой способ или изменить его
let secondDiv = document.createElement("div")
secondDiv.innerText = "Я хочу создать див другим способом"
// console.log(secondDiv);
secondDiv.innerText = "hahaha"
console.log(secondDiv);


//получить значение атрибута
let attribute = document.getElementById('btn1').getAttribute('id')
console.log(attribute);


//innerTHML - добавляем разметку
let fruit = document.getElementById("apple");
fruit.innerHTML = "<p>Люблю апельсины</p>"
console.log(fruit);

const apple = document.getElementById("apple")
apple.style.backgroundColor = "rgb(255,0,0)"
apple.style.fontWeight = "bold"

// apple.remove()


//слушатель события (если клик - то сработает блок кода)
apple.addEventListener('click', () => {
    if (apple.style.fontWeight === "bold" ) {
        console.log(apple.style.backgroundColor);
        apple.style.backgroundColor = "rgb(59,179,58)"
    } else {
        apple.style.backgroundColor = "rgb(255,86,0)"
    }
})

















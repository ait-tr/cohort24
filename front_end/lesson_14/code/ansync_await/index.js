
// Async Await

// Как было с then 
function f1() {
  return new Promise((resolve, reject) => {
    resolve(1);
  })
}
// console.log(f1());
// раскрыли с помощь then
// f1().then((data) => {
//   console.log(data);
// })

// async - синтаксический сахар
async function f2() {
  return 1;
}

// console.log(f2());

// f2().then((data) => {
//   console.log(data);
// })
// если нету промиса, async его добавляет 
// если есть - ничего не меняется 
async function f3() {
  return new Promise((resolve, reject) => {
    resolve(1);
  });
}
// console.log(f3());
// f3().then((data) => {
//   console.log(data);
// })
// await 
// вместо then мы мождем использовать await
// проблема в том, что мы можем его использовать 
// только в ассинхронном контексте

// поэтому создаем ассинхронную обертку
function getStudent() {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve({ name: "Anri", age: 32 });
    }, 4000);
  });
}
function getStudent2() {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve({ name: "Anri", age: 32 });
    }, 20000);
  });
}

async function load(){
  const x = await f2();
  const z = await getStudent2();
  const y =  await getStudent();
  console.log(x);
  console.log(y);
  console.log(x + z);
}

load();


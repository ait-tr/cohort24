const factElement = document.getElementById("randomFact");
const refreshBtn = document.getElementById("refresh");
// console.log(refreshBtn);

async function load(){
  // ассинхронный метод - соответвенно он возвращает 
  // Promise в котором лежит ResponseObj
  const responseObj = await fetch("https://catfact.ninja/fact");
  console.log(responseObj);
  // на  приходит Response - у него есть метод json()
  // json - тоже ассинхронный - он раскрывает объект ответа responseObj
  const obj = await responseObj.json();
  console.log(obj);
  // теперь мы можем получить нужное свойство используя деструктуризацию
  const {fact} = obj;
  console.log(fact);
  factElement.textContent = fact;
}
load();
refreshBtn.addEventListener('click', load);
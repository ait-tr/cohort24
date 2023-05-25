const imgElement = document.getElementById("dogImage");
const btnElement = document.getElementById("refresh");
const btnPrev = document.getElementById("prev");
let prev = '';

async function loadDoggy(){
  const response = await fetch("https://dog.ceo/api/breeds/image/random");
  const obj = await response.json();
  // console.log(obj);
  const {message} = obj;
  prev = imgElement.src;
  imgElement.src = message;
}

loadDoggy();
loadDoggy();

btnElement.addEventListener('click', loadDoggy);

btnPrev.addEventListener('click', ()=>{
  imgElement.src = prev;
});

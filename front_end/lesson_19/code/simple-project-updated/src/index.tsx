import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './componets/App/App';
import Counter from './componets/Counter/Counter';
import Sandwich from './componets/Sandwich/Sandwich';
import Car from './componets/Car/Car';
import Instrument from './componets/Instrument/Instrument';
import Parent from './componets/Parent/Parent';
import ParentFlower from './componets/Flower/ParentFlower';
import Buttons from './componets/UseEffectExample/Buttons';
import GenderIdentification from './componets/GenderIdentification/GenderIdentification';

const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement
);
root.render(
  <React.StrictMode>
    <Counter />
    <Sandwich />
    <App />
    {/*  передаем пропсы color и brand */}
    <Parent />
    <Car color="black" brand="BMW" />
    <Car color="yellow" brand="Ferrari" />
    <Car color="yellow" brand="Submmarine" />
    <Car color="grey" brand="Kia" />
    <Car color="red" brand="Lamborghini" />
    <Car color="violet" brand="Lada" />
    <Instrument title="guitar" dateOfManufacturing="2023-02-02" type="strings" />
    <ParentFlower />
    {/* <Buttons /> */}
    <GenderIdentification />
  </React.StrictMode>
);

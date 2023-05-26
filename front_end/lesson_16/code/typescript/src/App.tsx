import React, { useState } from 'react';
import './App.css';

function App() {
  // let count = 0
  // count - переменная
  // setCount - функция, которая меняет переменную count
  const [count, setCount] = useState(0)
  const [step, setStep] = useState(1)


  function handleClickMinus() {
    setCount(count - step) 
  }
  function handleClickPlus() {
    setCount(count + step) 
  }

  function handleChange(event: React.ChangeEvent<HTMLInputElement>): void {
   const value = event.target.value
    setStep(Number(value))
  }
  // console.log(step)
  return (
    <div className="App">
      <header className="App-header">
        <p>Hello</p>
        <div>
        <button onClick={handleClickMinus}>-</button> {"  "}
        <span>{count}</span> {"  "}
        <button onClick={handleClickPlus}>+</button>
        </div>
        <input 
        value={step} 
        onChange={handleChange} 
        onClick={handleClickPlus}
        type='number'/>
      </header>
    </div>
  );
}

export default App;
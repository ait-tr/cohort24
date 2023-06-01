import React, { useState } from 'react';

function Sandwich(): JSX.Element {
  const [sandwich, setSandwich] = useState<string>('');
  function handleAddBreadClick(): void {
    setSandwich(sandwich.concat(' ', 'хлеб'));
  }
  function handleAddCheeseClick(): void {
    setSandwich(sandwich.concat(' ', 'сыр'));
  }
  function handleRemoveCheese(): void {
    setSandwich(sandwich.replaceAll(' сыр', ''));
  }
  function handleRemoveLast(): void {
    setSandwich(sandwich.replaceAll(/\s\S+$/g, ''));
  }
  return (
    <>
      <p>Бутерброд с: {sandwich}</p>
      <button type="button" onClick={handleAddBreadClick}>Добавить хлеб</button>
      <button type="button" onClick={handleAddCheeseClick}>Добавить сыр</button>
      <button
        type="button"
        onClick={() => { setSandwich(sandwich.concat(' ', 'салями')); }}
      >
        Добавить салями
      </button>
      <button type="button" onClick={handleRemoveCheese}>Убрать сыр</button>
      <button type="button" onClick={handleRemoveLast}>Убрать последний</button>
    </>
  );
}

export default Sandwich;

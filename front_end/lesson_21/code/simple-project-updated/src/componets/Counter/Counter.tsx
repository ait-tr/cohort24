import React, { useState } from 'react';
import styles from './Counter.module.css';

function Counter(): JSX.Element {
  // хук принимает начальное состояние
  // мы можем у useState - задать тип в дженерике - это необязательно
  // возращает массив/кортеж - на первом месте переменная состояния
  // на втором - функция сетер - для изменения этой переменной
  const [count, setCount] = useState<number>(0);
  function handlePlusClick(): void {
    setCount(count + 1);
  }
  return (
    <div className={styles.counterCard}>
      <h2>Counter</h2>
      <button className={`${styles.plusButton} ${styles.specialButton}`} type="button" onClick={handlePlusClick}>+</button>
      <button className={styles.plusButton} type="button" onClick={handlePlusClick}>+</button>
      <span>{count}</span>
    </div>
  );
}

export default Counter;

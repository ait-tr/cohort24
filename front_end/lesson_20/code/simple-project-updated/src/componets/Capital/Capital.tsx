import React, { useEffect, useRef, useState } from 'react';

export default function Capital(): JSX.Element {
  const [capitalName, setCapitalName] = useState<string>('');
  useEffect(() => {
    async function loadCapital(): Promise<void> {
      const res = await fetch('https://restcountries.com/v3.1/capital/tallinn');
      const arr = await res.json();
      const [obj] = arr;
      const { capital } = obj;
      const [capitalStr] = capital;
      console.log(capitalStr);
      setCapitalName(capitalStr);
    }
    loadCapital();
  }, []);
  const inputElement = useRef<HTMLInputElement>(null);
  async function loadNewCapital(): Promise<void> {
    console.log(inputElement.current?.value);
    const res = await fetch(`https://restcountries.com/v3.1/capital/${inputElement.current?.value}`);
    const arr = await res.json();
    const [obj] = arr;
    const { capital } = obj;
    const [capitalStr] = capital;
    setCapitalName(capitalStr);
    // Две строки ниже это пример, не имеют отношения к нашей программе
    const obj2: any = null;
    console.log(obj2?.name);
  }
  return (
    <>
      <div>Capital {capitalName}</div>
      <input ref={inputElement} type="text" placeholder="Введите столицу" />
      <button type="button" onClick={() => { loadNewCapital(); }}>Узнать</button>
    </>
  );
}

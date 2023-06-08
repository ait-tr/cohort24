import React from 'react';

interface Props {
  brand: string;
  color: string;
}
// Создайте компонент Instrument
// требуется передать в него три пропса:
// название
// дата производства
// тип интрумента, наприме: ударный, щипковый, смычковый
// Создайте три элемента с разными значениями пропсов
// Дополнительно - подключите стили

function Car({ brand, color }: Props): JSX.Element {
  return (
    <div style={{ backgroundColor: color }}>
      <h3>Карточка машины</h3>
      <p>Бренд машины: {brand} Цвет машины: {color}</p>
    </div>
  );
}
// Пример с деструктуризацией в два шага, удобно когда много пропсов
// function Car(props:Props): JSX.Element {
//   const {brand, color} = props;
//   return (
//     <div>
//       <h3>Карточка машины</h3>
//       <p>Бренд машины: BMW Цвет машины: black</p>
//     </div>
//   );
// }

export default Car;

import React from 'react';

interface Props {
  title: string;
  dateOfManufacturing: string;
  type: string;
}

function Instrument({ title, dateOfManufacturing, type }: Props): JSX.Element {
  function typeToColor(titleOfInstument: string): string {
    switch (titleOfInstument) {
      case 'guitar':
        return 'yellow';
      default:
        return 'blue';
    }
  }
  return (
    <div>
      <h3 style={{ backgroundColor: typeToColor(title) || 'green' }}>Карточка музыкального инструмента</h3>
      Инструмент: {title}
      Тип: {type}
      Дата производства: {dateOfManufacturing}
    </div>
  );
}

export default Instrument;

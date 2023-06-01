import React from 'react';
import PirateCard from '../PirateCard/PirateCard';
import Pirate from '../../types/Pirate';

function Parent(): JSX.Element {
  const john: Pirate = {
    name: 'John',
    isDrunk: true,
    ship: 'Black pearl',
    numberOfLegs: 2
  };

  return (
    <div>
      <h2>Родительский компонент</h2>
      <PirateCard pirate={john} />
    </div>
  );
}

export default Parent;

import React from 'react';
import Pirate from '../../types/Pirate';

interface Props {
  pirate: Pirate;
}

function PirateCard({ pirate }: Props): JSX.Element {
  const {
    name, isDrunk, ship, numberOfLegs
  } = pirate;
  return (
    <div>
      <h3>Карточка пирата</h3>
      <p>Пират {name}</p>
      <p>{isDrunk ? 'Будучи пьяным ' : 'В трезвом состоянии '}</p>
      <p>захватил корабль {ship}.</p>
      <p>{numberOfLegs > 1 ? 'И при этом остался цел.' : 'Но потярял ногу.'}</p>
    </div>
  );
}

export default PirateCard;

import React from 'react';

interface Props {
  guest: string;
}

export default function GuestCard(props: Props): JSX.Element {
  const { guest } = props;
  return (
    <>
      <div>GuestCard</div>
      <p>Имя гостя: {guest}</p>
    </>
  );
}

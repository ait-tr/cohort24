import React from 'react';
import { Link } from 'react-router-dom';

export default function Settings(): JSX.Element {
  return (
    <>
      <div>Settings</div>
      <p>Настройки пользователя</p>
      <Link to="..">
        Back to User
      </Link>
    </>
  );
}

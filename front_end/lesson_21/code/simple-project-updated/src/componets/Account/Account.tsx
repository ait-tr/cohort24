import React from 'react';
import { Link } from 'react-router-dom';

export default function Account():JSX.Element {
  return (
    <>
      <div>Account</div>
      <p>Это акаунт пользователя</p>
      <Link to="..">
        Back to User
      </Link>
    </>
  );
}

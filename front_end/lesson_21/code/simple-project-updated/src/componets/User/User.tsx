import React from 'react';
import { Link, Outlet } from 'react-router-dom';

export default function User(): JSX.Element {
  return (
    <>
      <div>User</div>
      <Link to="settings">
        Settings
      </Link>
      <Link to="account">
        Account
      </Link>
      <Outlet />
    </>
  );
}

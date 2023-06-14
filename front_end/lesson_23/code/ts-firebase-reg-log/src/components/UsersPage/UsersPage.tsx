import React, { useEffect, useState } from 'react';
import { Outlet, Link, useParams } from 'react-router-dom';
import type User from '../../types/User';

export default function UsersPage(): JSX.Element {
  const [users, setUsers] = useState<User[]>([]);
  const { userId } = useParams();
  useEffect(() => {
    fetch('https://fakestoreapi.com/users')
      .then((res) => res.json())
      .then((arr) => {
        console.log(arr);
        setUsers(arr);
      });
  }, []);
  return (
    !userId ? (
      <>
        <div> UsersPage</div>
        {users.map((user) => (
          <div>
            {user?.username} {user?.email}
            <Link to={user?.id.toString()}>К пользователю</Link>
          </div>
        ))}
      </>
    ) : (<Outlet />)
  );
}

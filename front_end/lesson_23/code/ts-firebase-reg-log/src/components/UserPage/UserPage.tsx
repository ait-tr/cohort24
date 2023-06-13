import React, { useEffect, useState } from 'react';
import { Link, useParams } from 'react-router-dom';
import User from '../../types/User';

export default function UserPage(): JSX.Element {
  const [user, setUser] = useState<User>();
  const { userId } = useParams();
  useEffect(() => {
    fetch(`https://fakestoreapi.com/users/${userId}`)
      .then((res) => res.json())
      .then((json) => {
        setUser(json);
      });
  }, [userId]);
  return (
    <>
    <div>UserPage</div>
    <div>
      {user?.name?.firstname}
      {user?.name?.lastname}
      {user?.email}
    </div>
    <Link to="..">UsersPage</Link>
    </>
  );
}

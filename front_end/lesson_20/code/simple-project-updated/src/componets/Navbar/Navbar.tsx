import React from 'react';
import { Link, NavLink, useNavigate } from 'react-router-dom';

export default function Navbar(): JSX.Element {
  const navigate = useNavigate();
  function handleMainClick(): void {
    navigate('/');
  }
  function handleSandwichClick(): void {
    navigate('/sandwich');
  }
  return (
    <nav>
      <button type="button" onClick={handleMainClick}>Главная</button>
      {/* <a href="/a" onClick={handleSandwichClick}>Главная</a> */}
      <button type="button" onClick={handleSandwichClick}>Сендвич</button>
      <button type="button" onClick={handleMainClick}>Главная</button>
      <a href="/counter">Каунтер</a>
      <NavLink
        to="capital"
      >Столица NavLink
      </NavLink>
      <Link
        to="gender"
      >
        Определитель пола
      </Link>
      <a href="/gender">Определитель пола</a>
    </nav>
  );
}

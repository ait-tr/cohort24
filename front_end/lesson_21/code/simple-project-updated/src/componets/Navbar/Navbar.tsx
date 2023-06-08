import React from 'react';
import { NavLink } from 'react-router-dom';
import styles from './Navbar.module.css';

export default function Navbar(): JSX.Element {
  const getStatus = (navData: { isActive: boolean }): string =>
    navData.isActive ? styles.active : '';
  return (
    <nav>
      <ul className={styles.navBarList}>
        <li className={styles.item}>
          <NavLink
            to="capital"
            className={getStatus}
          >
            Определитель столицы
          </NavLink>
        </li>
        <li className={styles.item}>
          <NavLink
            to="counter"
            className={getStatus}
          >
            Counter
          </NavLink>
        </li>
        <li className={styles.item}>
          <NavLink
            to="sandwich"
            className={getStatus}
          >
            Sandwich
          </NavLink>
        </li>
        <li className={styles.item}>
          <NavLink
            to="/"
            className={getStatus}
          >
            Home
          </NavLink>
        </li>
        <li className={styles.item}>
          <NavLink
            to="gender"
            className={getStatus}
          >
            Gender
          </NavLink>
        </li>
        <li className={styles.item}>
          <NavLink
            to="user"
            className={getStatus}
          >
            User
          </NavLink>
        </li>
        <li className={styles.item}>
          <NavLink
            to="products"
            className={getStatus}
          >
            Shop
          </NavLink>
        </li>
      </ul>
    </nav>
  );
}

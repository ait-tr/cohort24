import React from 'react';
import './App.css';
import { Route, Routes } from 'react-router-dom';
import Layout from '../../layouts/Layout';
import Counter from '../Counter/Counter';
import Capital from '../Capital/Capital';
import HomePage from '../HomePage/HomePage';
import Sandwich from '../Sandwich/Sandwich';
import GenderIdentification from '../GenderIdentification/GenderIdentification';
import User from '../User/User';
import Account from '../Account/Account';
import Settings from '../Settings/Settings';
import Shop from '../Shop/Shop';
import ProductPage from '../ProductPage/ProductPage';

function App(): JSX.Element {
  return (
    <Routes>
      <Route path="/" element={<Layout />}>
        {/* '/' можно писать, а можно и не писать */}
        <Route path="counter" element={<Counter />} />
        <Route path="capital" element={<Capital />} />
        <Route path="sandwich" element={<Sandwich />} />
        <Route path="gender" element={<GenderIdentification />} />
        <Route path="products" element={<Shop />}>
          <Route path=":productId" element={<ProductPage />} />
        </Route>
        <Route index element={<HomePage />} />
        {/* '*' - значит любой */}
        <Route path="user" element={<User />}>
          <Route path="account" element={<Account />} />
          <Route path="settings" element={<Settings />} />
        </Route>
        <Route path="*" element={<HomePage />} />
      </Route>
    </Routes>
  );
}

export default App;

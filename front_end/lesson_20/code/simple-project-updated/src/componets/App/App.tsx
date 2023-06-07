import React from 'react';
import './App.css';
import { Route, Routes } from 'react-router-dom';
import Layout from '../../layouts/Layout';
import Counter from '../Counter/Counter';
import Capital from '../Capital/Capital';
import HomePage from '../HomePage/HomePage';
import Sandwich from '../Sandwich/Sandwich';
import GenderIdentification from '../GenderIdentification/GenderIdentification';

function App(): JSX.Element {
  return (
    <Routes>
      <Route path="/" element={<Layout />}>
        {/* '/' можно писать, а можно и не писать */}
        <Route path="/counter" element={<Counter />} />
        <Route path="/capital" element={<Capital />} />
        <Route path="/sandwich" element={<Sandwich />} />
        <Route path="/gender" element={<GenderIdentification />} />
        <Route path="/" element={<HomePage />} />
        {/* '*' - значит любой */}
        <Route path="*" element={<HomePage />} />
      </Route>
    </Routes>
  );
}

export default App;

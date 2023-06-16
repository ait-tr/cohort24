import './App.css';
import React from 'react';
import { useSelector } from 'react-redux';
import { Link, Route, Routes } from 'react-router-dom';
import Counter from './features/counter/Counter';
import { RootState } from './store';
import Login from './features/auth/Login';
import Tasks from './features/tasks/Tasks';

function App(): JSX.Element {
  const value = useSelector((state: RootState) => state.counter.value);
  const user = useSelector((state: RootState) => state.auth.login);
  return (
    <div className="App">
      <h1>Счет: {value}</h1>
      <br />
      {user && (<h2>Привет, {user}</h2>)}
      <nav>
        <Link to="/login">Login</Link>{' '}
        <Link to="/counter">Counter</Link>
        <Link to="/tasks">Tasks</Link>
      </nav>
      <br />
      <Routes>
        <Route path="/login" element={<Login />} />
        <Route path="/counter" element={<Counter />} />
        <Route path="/tasks" element={<Tasks />} />
      </Routes>
    </div>
  );
}

export default App;

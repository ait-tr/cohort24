/* eslint-disable import/no-extraneous-dependencies */
import React, { useEffect, useState } from 'react';
import './App.css';
import { Route, Routes } from 'react-router-dom';
import { User, onAuthStateChanged } from 'firebase/auth';
import Profile from '../components/Profile/Profile';
import Register from '../components/Register/Register';
import AuthContext from '../contexts/AuthContext';
import { auth } from '../api/firebase';

function App(): JSX.Element {
  const [currentUser, setCurrentUser] = useState<User | null>(null);
  useEffect(() => {
    onAuthStateChanged(auth, (user) => {
      setCurrentUser(user);
      console.log(user);
    });
  }, []);
  return (
    // eslint-disable-next-line react/jsx-no-constructed-context-values
    <AuthContext.Provider value={currentUser}>
      <Routes>
        <Route path="/" element={<Profile />} />
        <Route path="register" element={<Register />} />
      </Routes>
    </AuthContext.Provider>
  );
}

export default App;

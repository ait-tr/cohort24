// src/api/firebase.ts
// eslint-disable-next-line import/no-extraneous-dependencies
import { initializeApp } from 'firebase/app';
// eslint-disable-next-line import/no-extraneous-dependencies
import { getAuth } from 'firebase/auth';

const firebaseConfig = {
  apiKey: 'AIzaSyD5xBIdiXmg0-GNeghLrOG2wqT2_DPD-oI',
  authDomain: 'ts-firebase-ff4d3.firebaseapp.com',
  projectId: 'ts-firebase-ff4d3',
  storageBucket: 'ts-firebase-ff4d3.appspot.com',
  messagingSenderId: '422520342709',
  appId: '1:422520342709:web:d4f688895cc2c2cd5696fc'
};

const app = initializeApp(firebaseConfig);
const auth = getAuth(app);

export { app, auth };

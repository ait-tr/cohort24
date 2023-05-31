import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './componets/App/App';
import Counter from './componets/Counter/Counter';

const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement
);
root.render(
  <React.StrictMode>
    <Counter />
    <Counter />
    <App />
  </React.StrictMode>
);

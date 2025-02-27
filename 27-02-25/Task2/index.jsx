// src/index.jsx
import React from 'react';
import ReactDOM from 'react-dom';
import Main from './Main';
import './index.css'; // Optional: For any global styles

ReactDOM.render(
  <React.StrictMode>
    <Main />
  </React.StrictMode>,
  document.getElementById('root')
);

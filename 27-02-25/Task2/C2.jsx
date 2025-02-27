// src/f1/C2.jsx
import React from 'react';
import C3 from './C3';
import { Suspense } from 'react';

// Dynamically import C4 and C5 with fallback
const C4 = React.lazy(() => import('../outside-src/C4'));
const C5 = React.lazy(() => import('../outside-src/C5'));

const C2 = () => {
  return (
    <div>
      <h3>Component C2</h3>
      <C3 />
      <Suspense fallback={<div>Loading C4...</div>}>
        <C4 />
      </Suspense>
      <Suspense fallback={<div>Loading C5...</div>}>
        <C5 />
      </Suspense>
    </div>
  );
};

export default C2;

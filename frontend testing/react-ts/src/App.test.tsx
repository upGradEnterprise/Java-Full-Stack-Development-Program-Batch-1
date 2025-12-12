import React from 'react';
import { render, screen } from '@testing-library/react';
import App from './App';

xtest('renders learn react link', () => {
  render(<App />);
 // const linkElement = screen.getByText(/learn react/i);
  const linkElement = screen.getByText("Learn React");
  expect(linkElement).toBeInTheDocument();
});

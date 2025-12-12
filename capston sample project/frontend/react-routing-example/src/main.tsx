import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import App from './App.tsx'
import { BrowserRouter, MemoryRouter } from 'react-router-dom'

createRoot(document.getElementById('root')!).render(
  <StrictMode>
    {/* <BrowserRouter> */}
    <MemoryRouter>
        <App />
    </MemoryRouter>
    {/* </BrowserRouter> */}

  </StrictMode>,
)

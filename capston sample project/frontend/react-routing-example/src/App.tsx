import { Link, Route, Routes } from "react-router-dom"
import { AboutUs } from "./AboutUs"
import { ContactUs } from "./ContactUs"
import { Feedback } from "./Feedback"
import Login from "./Login"
import { NotFound } from "./NotFound"
import Dashboard from "./Dashboard"
import AddProduct from "./AddProduct"
import ViewProducts from "./ViewProducts"


function App() {


  return (
    <>
      <h2>React Routing Example</h2>
      <nav>
        <Link to="aboutUs">About Us</Link> |
        <Link to="contactUs">Contact Us</Link> |
        <Link to="feedback">Feedback </Link> |
        <Link to="login">Login</Link> |
      </nav>

      <Routes>
        <Route path="/" element={<Login/>} />
        <Route path="/login" element={<Login/>} />
        <Route path="aboutUs" element={<AboutUs/>} />
        <Route path="contactUs" element={<ContactUs/>} />
        <Route path="feedback" element={<Feedback/>} />
        <Route path="home" element={<Dashboard/>}>

            <Route path="addProduct" element={<AddProduct/>}/>
            <Route path="viewProduct" element={<ViewProducts/>}/>
            
        </Route>
        <Route path="*" element={<NotFound/>} />
      </Routes>
    </>
  )
}

export default App

import { useSelector } from "react-redux"
import WelcomeComponent from "./WelcomeComponent"

function App() {
let counter=useSelector((gs:any)=>gs.counter)
let name=useSelector((gs:any)=>gs.name)
  return (
    <>
    <h2>React with Redux Concept</h2> 
    <p>In Parent Component global state variable is {counter}</p>
    <p>Global state name in parent component is {name}</p>
    < WelcomeComponent></WelcomeComponent>     
    </>
  )
}

export default App

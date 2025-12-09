import { useState } from "react"
import AddNames from "./AddNames"
import DisplayNames from "./DisplayNames"
import Parent from "./Parent"

function App() {
let [names,setNames]=useState<string[]>([]) 
let receiveData = (data:any)=> {
    //console.log(data);
    setNames(data)
}
  return (
    <>
    <h2>Component Communication Example</h2>  
    {/* <Parent></Parent> */}
    <AddNames sendDataToParent={receiveData}></AddNames>
    <DisplayNames data = {names}></DisplayNames>
    </>
  )
}

export default App

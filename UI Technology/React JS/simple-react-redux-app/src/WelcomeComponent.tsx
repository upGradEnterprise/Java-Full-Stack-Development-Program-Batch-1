import { useState } from "react";
import { useSelector } from "react-redux";
import IncrementNComponent from "./IncrementNComponent";

function WelcomeComponent() {
let [msg,setMsg]=useState("Welcome to React Component by User "); // local state variable 
let name = useSelector((gs:any)=>gs.name)
let gs = useSelector((gs:any)=>gs)
console.log(gs)
    return(
        <div>
            <h3>{msg}:{gs.name}</h3>
            <IncrementNComponent></IncrementNComponent>
        </div>
    )

}
export default WelcomeComponent;
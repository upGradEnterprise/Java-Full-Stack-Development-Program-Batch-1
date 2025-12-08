import { useState } from "react";

function PrimitiveStateVariable() {
//console.log(useState())
//console.log(useState("Raj"))
let [id,setId]=useState(100)    // state variable 
let mgrId = 200;                // local variable
let changeValue= function(): void {
    // console.log("event fired")
    // console.log(" id is "+id)
    // console.log("mgrId is "+mgrId)
    // id = 101;
    // mgrId= 201;
    // console.log(" id is "+id)
    // console.log("mgrId is "+mgrId)
    setId(id+1);    // if we do change using set function in state variable it re-render on dom
} 
    return(
        <div>
            <h3>Primitive State variable</h3>
            <p>state id variable value is {id} and local mgrId is {mgrId}</p>
            <input type="button" value="Click Here"
            onClick={changeValue}/>
        </div>
    )
}

export default PrimitiveStateVariable;
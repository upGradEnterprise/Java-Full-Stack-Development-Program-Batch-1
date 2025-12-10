import { useState } from "react";
import { useDispatch } from "react-redux";

function DynamicIncrementNComponent() {
let [num,setNum]=useState<number>(0)
let dispatch = useDispatch();

let incrementValue = ()=> {
    console.log("Event fired with dynamic value")
    dispatch({type:"DYNAMIC_INCREMENT",payload:num});
    setNum(0)
}
    return(
        <div>
            <h2>Dynamic Increment Component</h2>
            <input type="number" name="num" value={num}
            onChange={(event:any)=>setNum(event.target.value)}/>
            <input type="button" value="Dynamic Increment"
            onClick={incrementValue}/>
            <br/>
            
        </div>
    )
}

export default DynamicIncrementNComponent;
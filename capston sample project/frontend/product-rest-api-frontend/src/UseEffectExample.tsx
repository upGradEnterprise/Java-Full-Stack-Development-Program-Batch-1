import { useEffect, useState } from "react";

function UseEffectExample() {
let [n,setN]=useState<number>(100)
let [x,setX]=useState<number>(100)
// it call initially and called again and again whenever re-render if we do any changes on state variable 
// useEffect(()=> {
//     console.log("usEffect get called..")
// })

// it call only once 
// useEffect(()=> {
//     console.log("usEffect get called..")
// },[])
// it call initially and if any changes on n state variable then only called.
useEffect(()=> {
    console.log("usEffect get called..")
},[n])

let init = ()=> {
    console.log("init function")
}
init();
    return(
        <div>
            <h2>useEffect Example</h2>
            <p>Value of n is {n} and value of X is {x}</p>
            <input type="button" value="N increment" onClick={()=>setN(n+1)}/>
            <input type="button" value="X increment" onClick={()=>setX(x+1)}/>
        </div>
    )
}
export default UseEffectExample;
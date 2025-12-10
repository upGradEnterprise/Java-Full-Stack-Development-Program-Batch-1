import { useState } from "react";
import Child1 from "./Child1";
import { MyContext } from "./Context";

function Parent() {
let [name,setName]=useState<string>("Raj Deep")

    return(
        <MyContext.Provider value={name}>
        <div>
            <h3>Parent Component</h3>
            <p>Name is in parent component is {name}</p>
            <Child1 fname={name}></Child1>
        </div>
        </MyContext.Provider>
    )
}

export default Parent;
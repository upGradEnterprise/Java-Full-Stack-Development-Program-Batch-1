import { useState } from "react";
import Child3 from "./Child3";

function Child2() {

let [colorName,setColorName]=useState<string>("RED");
    return(
        <div style={{"color":colorName}}>
            <h3>Child2 Component</h3>
            <Child3></Child3>
        </div>
    )
}

export default Child2;
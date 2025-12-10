import { useContext } from "react";
import { MyContext } from "./Context";

function Child4() {
let fname = useContext(MyContext);// pull the data from context reference 

    return(
        <div>
            <h3>Child4 Component</h3>
            <p>Value from parent component in child4 component is {fname}</p>
        </div>
    )
}

export default Child4;
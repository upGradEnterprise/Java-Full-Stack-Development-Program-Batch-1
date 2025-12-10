import { useContext } from "react";
import { MyContext } from "./Context";

function Child4() {
let obj = useContext(MyContext);// pull the data from context reference 

    return(
        <div>
            <h3>Child4 Component</h3>
            <p>Value from parent component in child4 component is {obj.name} and age is {obj.age}</p>
        </div>
    )
}

export default Child4;
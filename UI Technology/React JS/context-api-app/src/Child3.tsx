import { useContext } from "react";
import Child4 from "./Child4";
import { MyContext } from "./Context";
import Child5 from "./Child5";

function Child3() {
let data = useContext(MyContext);// pull the data from context reference 

    return(
        <div>
            <h3>Child3 Component</h3>
            <p>Name is in child3 component from parent component is {data.name} and age is {data.age}</p>
            <Child4></Child4>
            <Child5></Child5>
        </div>
    )
}

export default Child3;
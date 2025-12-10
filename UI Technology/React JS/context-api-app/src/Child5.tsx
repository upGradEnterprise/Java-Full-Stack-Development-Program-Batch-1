import { useContext } from "react";
import { MyContext } from "./Context";

function Child5() {
let ref = useContext(MyContext);

    return(
        <div>
            <h3>Child5 Component</h3>
            <input type="button" value="Change Age"
            onClick={()=>ref.setAge(25)}/>
            
        </div>
    )
}

export default Child5;
import { useDispatch } from "react-redux";
import DecrementNComponent from "./DecrementNComponent";

function IncrementNComponent() {

let dispatch = useDispatch();

let incrementValue = ()=> {
    console.log("Event fired")
    dispatch({type:"INCREMENT"});
}
    return(
        <div>
            <h2>Increment Component</h2>
            <input type="button" value="Increment"
            onClick={incrementValue}/>
            <hr/>
            <DecrementNComponent></DecrementNComponent>
        </div>

    )
}

export default IncrementNComponent;
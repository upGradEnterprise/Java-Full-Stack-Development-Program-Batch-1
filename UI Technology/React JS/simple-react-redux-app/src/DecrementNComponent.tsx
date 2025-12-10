import { useDispatch } from "react-redux";

function DecrementNComponent() {

let dispatch = useDispatch();

let decrementValue = ()=> {
    console.log("Event fired")
    dispatch({type:"DECREMENT"});
}
    return(
        <div>
            <h2>Decrement Component</h2>
            <input type="button" value="Decrement"
            onClick={decrementValue}/>
            <br/>
            
        </div>
    )
}

export default DecrementNComponent;
import { useDispatch, useSelector } from "react-redux";
import { increment } from "./counterSlice";

function IncrementComponent() {

let n = useSelector((gs:any)=>gs.counter.n);
let dispatch = useDispatch();

let incrementValue = ()=> {
    dispatch(increment());
}
return(
    <div>
        <h2>Increment Component</h2>
        <p>Value of n is {n}</p>
        <input type="button" value="Increment" onClick={incrementValue}/>
    </div>
)
}

export default IncrementComponent;
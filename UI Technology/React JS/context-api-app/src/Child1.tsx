import Child2 from "./Child2";

function Child1(props:any) {


    return(
        <div>
            <h3>Child1 Component</h3>
            <p>parent name in child1 component receive as props {props.fname}</p>
            <Child2></Child2>
        </div>
    )
}

export default Child1;
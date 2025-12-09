import { useState } from "react";

function Child1(props:any) {
let [user1,setUser1]=useState<string>("raj@gmail.com")
    return(
        <div style={{"backgroundColor":"orange"}}>
            <h3>Child1 Component</h3>
            <p>User1 name in child1 component is {user1}</p>
            <p>Admin name in child1 component is {props.adminName} and age is {props.age}</p>
            {props.passValueToChild1(user1)}
        </div>
    )
}

export default Child1;
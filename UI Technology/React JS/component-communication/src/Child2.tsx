import { useState } from "react";

function Child2(props:any) {
let [user2,setUser2]=useState<string>("ravi@gmail.com")
    return(
         <div style={{"backgroundColor":"gray"}}>
            <h3>Child2 Component</h3>
            <p>User2 name in child2 component is {user2}</p>
             <p>Admin name in child2 component is {props.adminName} and age is {props.age}</p>
             <p>User1 name in child2 component os {props.child1Value}</p>
        </div>
    )
}

export default Child2;
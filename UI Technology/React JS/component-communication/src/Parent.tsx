import { useState } from "react";
import Child1 from "./Child1";
import Child2 from "./Child2";
function Parent() {
let [admin,setAdmin]=useState<string>("admin@gmail.com")
let [user1Value,setUser1Value]=useState<string>("");
let receiveChild1Value = (data:any)=>{
    console.log("Child1 value is "+data)
    setUser1Value(data);
}
    return(
        <div style={{"backgroundColor":"yellow"}}>
            <h3>Parent Component</h3>
            <p>Admin name in admin component is {admin}</p>
            <Child1 adminName={admin} age="34" passValueToChild1={receiveChild1Value}></Child1>
            <Child2 adminName={admin} age="34" child1Value={user1Value}></Child2>
            <p>Child1 name in admin component is {user1Value}</p>
        </div>
    )
}

export default Parent;
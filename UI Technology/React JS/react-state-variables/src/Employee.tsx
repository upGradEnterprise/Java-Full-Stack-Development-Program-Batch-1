import { useState } from "react";
interface AddressType {
    city:string;
    state:string;
}
interface ProjectType{
    pid:number;
    pname:string;
    clientId?:number;
}
function Employee() {
let [id,setId]=useState<number>(100);   // primitive type   
let [name,setName]=useState<string>("Ravi");    // primitive type 
let [skillSet,setSkillSet]=useState<string[]>(["Java","Python"]) // array type 
let [address,setAddress]=useState<AddressType>({"city":"Bangalore","state":"Kar"}); // object type 
let [projects,setProjects]=useState<ProjectType[]>([{"pid":123,"pname":"Java"},{"pid":456,"pname":"python","clientId":1122}]); // array of object type 
    return(
        <div>
            <h2>Employee details </h2>
            <p> id is {id} and name is {name}</p>
            <h3>SkillSet</h3>
            <ul>
                {skillSet.map(s=><li>{s}</li>)}
            </ul>
            <p>City is {address.city} and state is {address.state}</p>
            <ul>
                {projects.map(p=><li>Pid {p.pid} PName {p.pname} and Client id {p.clientId}</li>)}
            </ul>
        </div>
    )
}

export default Employee;
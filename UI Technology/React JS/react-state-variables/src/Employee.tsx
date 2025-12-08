import React, { useState } from "react";
const ButtonComponent:React.FC= ()=> {
    const buttonClick = (event:React.SyntheticEvent)=>{
        console.log("event fired")
        console.log(event)
    }
    return(
        <div>
            <input type="button" onClick={buttonClick} value="Click Here"/>
        </div>
    )
}
interface AddressType {
    city?:string;
    state?:string;
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
let changePrimitiveValue= ()=> {
    setId(200)
    setName("Ravi Kumar");
}   
let addNewSkill = ()=> {
    //setSkillSet(["Angular Framework"]); // override new value
    //skillSet.push("Angular")
    //setSkillSet(skillSet) 
    setSkillSet([...skillSet,"Angular Framework"]); // 1st parameter spread operator [...oldValue,newValue]
    //let skill = skillSet.slice();  // slice method copy only value in skill variable shallow copy 
    //skill.push("Angular Framework")
    //setSkillSet(skill)
} 
let changeObjectValue= ()=> {
    //setAddress({city:"Mumbai","state":"Mh"}); // update all property 
    //setAddress({...address,city:"Mysore"});         // update partial property ...address hold old property value 
    let addressTemp = {...address}; // it copy only values not references 
    addressTemp.city="Mysore";
    setAddress(addressTemp)
}
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
            <br/>
            <ButtonComponent/>
            <input type="button" value="Change Primitive Value" onClick={changePrimitiveValue}/>
            <input type="button" value="Add new skill set " onClick={addNewSkill}/>
            <input type="button" value="Change user defined property" onClick={changeObjectValue}/>
        </div>
    )
}

export default Employee;
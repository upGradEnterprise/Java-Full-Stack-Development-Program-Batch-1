import { useState } from "react";
import DisplayNames from "./DisplayNames";

function AddNames() {
let [name,setName]=useState<string>("");
let [names,setNames]=useState<string[]>([]);

let addData = ()=> {
    setNames([...names,name])
    setName("");
}
    return(
        <div>
            <h2>Add Names</h2>
            <input type="text" placeholder="Add Names"
            name="name" onChange={(event:any)=>setName(event.target.value)} value={name}/>
            <input type="button" value="Add Name" onClick={addData}/>
            <hr/>
            <DisplayNames data={names}></DisplayNames>
        </div>
    )

}

export default AddNames;
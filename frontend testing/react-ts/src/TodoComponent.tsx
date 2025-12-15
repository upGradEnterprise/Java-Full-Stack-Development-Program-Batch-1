//import axios from "axios";
import { useEffect, useState } from "react";
function TodoComponent(){
let URL = "https://dummyjson.com/todos";
let [todos,settodos]=useState([])

let loadtodosDetails= async ()=> {
    console.log("event fired")
    // fetch(URL).then(response=>response.json()).then(result=> {
    //     console.log("in fetch")
    //     console.log(result.todos)
    //     settodos(result.todos)
    // }).catch(error=>console.log(error))
    console.log("event fired1")
    let response = await fetch(URL);
    let result = await response.json();
    //console.log(result)
    settodos(result.todos)
    console.log("event fired2")

}
useEffect(()=> {
loadtodosDetails();
},[])
    return(
        <div>
            <h2>todos Details</h2>
            <input type="button" value="Load todos"  onClick={loadtodosDetails} data-testid="b1"/>
            <br/>
            <h1>Number of todos are {todos.length}</h1>
            <table>
                <thead>
                <tr>
                    <th>id</th>
                    <th>todo</th>
                </tr>
                </thead>
                <tbody>
                {
                    todos.map((p:any)=>
                        <tr key={p.id}>
                            <td>{p.id}</td>
                            <td>{p.todo}</td>
                        </tr>
                    )
                }
                </tbody>
            </table>
        </div>
    )
}
 
export default TodoComponent;
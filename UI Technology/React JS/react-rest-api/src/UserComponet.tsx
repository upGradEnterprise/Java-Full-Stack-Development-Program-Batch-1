import { useState } from "react";

function UserComponent() {

let URL ="https://dummyjson.com/users";
let [users,setUsers]=useState([]);
let loadFakeData = ()=> {
  //fetch(URL).then(response=>response.json()).then(result=>console.log(result.users)).catch(error=>console.log(error))

fetch(URL).then(response=>response.json()).then(result=>{
    setUsers(result.users)
}).catch(error=>console.log(error))

}

    return(
        <div>
            <h3>User Data</h3>
            <input type="button" value="Load User Data" onClick={loadFakeData}/>
            <br/>
            <h2>Number of users are {users.length}</h2>
            <ol>
                {
                    users.map((u:any,index:number)=><li key={index}>{u.firstName}, {u.email} <img src={u.image} width="200px" height="200px"/></li>)
                }
            </ol>
        </div>
    )
}

export default UserComponent;
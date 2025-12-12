import { useState } from "react"

function Login() {
let [emailId,setEmailId]=useState<any>("")
let [password,setPassword]=useState<any>("");
let [msg,setMessage]=useState<any>("")
let handleSubmit= (event:any)=> {
    event.preventDefault()
    if(emailId=="admin@gmail.com" && password=="123"){
        setMessage("success")
    }else {
        setMessage("failure");
    }
    reset();
}
let reset= ()=> {
    setEmailId("")
    setPassword("")
}
    return(
        <div>
            <span>{msg}</span>
            <h2>Login Page</h2>
            <form onSubmit={handleSubmit}>
            <input type="email" name="emailId" value={emailId}
            placeholder="Enter emailId" onChange={(event)=>setEmailId(event.target.value)}/><br/>
            <input type="password" name="password" value={password} 
            placeholder="Enter password" onChange={(event)=>setPassword(event.target.value)}/><br/>
            <button type="submit" name="b1">SignIn</button>
            <button type="button" name="b2">Reset</button>
            </form>
        </div>
    )
}

export default Login;
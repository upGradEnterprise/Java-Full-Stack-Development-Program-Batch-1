import { useState } from "react"
import { useNavigate } from "react-router-dom";
function LoginRouting() {
let [emailId,setEmailId]=useState<any>("")
let [password,setPassword]=useState<any>("");
let [msg,setMessage]=useState<any>("")
let navigate = useNavigate();
let handleSubmit= (event:any)=> {
    event.preventDefault()
    if(emailId=="admin@gmail.com" && password=="123"){
        navigate("home")
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
        <input type="email" name="emailId" value={emailId} data-testid="emailId"
            placeholder="Enter emailId" onChange={(event)=>setEmailId(event.target.value)}/><br/>
        <input type="password" name="password" value={password} data-testid="password"
            placeholder="Enter password" onChange={(event)=>setPassword(event.target.value)}/><br/>
        <input type="submit" value="submit" data-testid="submit"/>
            <input type="button" value="reset"/>
            </form>
        </div>
    )
}

export default LoginRouting;
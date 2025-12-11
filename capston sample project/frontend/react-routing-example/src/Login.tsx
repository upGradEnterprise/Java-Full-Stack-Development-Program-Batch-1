import { useState } from "react";
import { useNavigate } from "react-router-dom";
function Login() {
let [emailId,setEmailId]=useState<string>("")
let [password,setPassword]=useState<string>("")
let [error,setError]=useState<string>("");
let navigate = useNavigate();
let checkLogin = (event:any)=>{
    event.preventDefault();
    if(emailId.length==0){
        setError("Email Id is required")
    }else if(password.length==0){
        setError("Password is required")
    }else if(emailId==="admin@gmail.com" && password==="admin@123"){
            //setError("successfully login")
            sessionStorage.setItem("user","admin@gmail.com");   // set user name in session scope 
            sessionStorage.setItem("token","tokenValue");
            navigate("/home")
    }else {
        setError("EmailId or password is wrong");
    }
    reset();
}
let reset= ()=> {
    setEmailId("");
    setPassword("")
}
    return(
        <div>
            <span style={{"color":"red"}}>{error}</span>
            <h2>Login Page</h2>
            <form onSubmit={checkLogin}>
            <input type="email" name="emailId" value={emailId} placeholder="Enter the email id"
            onChange={(event)=>setEmailId(event.target.value)}/><br/>
            
            <input type="password" name="password" value={password} placeholder="Enter the password"
            onChange={(event)=>setPassword(event.target.value)}/><br/>

            <input type="submit" value="SignIn"/>
            <input type="button" value="reset" onClick={reset}/>
            </form>
        </div>
    )
}

export default Login;
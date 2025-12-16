import { useState } from "react";
import { useDispatch, useSelector } from "react-redux";
import { signInUser } from "./authSlice";
import { NavLink, useNavigate } from "react-router-dom";

const Login = () => {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");   // local state variable 
  const dispatch = useDispatch<any>();      // pass the action slice 
  const navigate = useNavigate();         // navigate with condition 
  let error = useSelector((gs:any)=>gs.auth.error)  // error 
  
  const handleLogin = async () => {
    /*axios.post(url,data).then(result=> {
        console.log(result)   // {role:"CUSTOM",token:""} 
    }).catch(error=>console.log(result))

    */
    const res = await dispatch(signInUser({ email, password }));
    //console.log(res)
    if (res.meta.requestStatus === "fulfilled") {
      let token = res.payload.token
      let role = res.payload.role
      localStorage.setItem("role",role);
      localStorage.setItem("token",token)
      navigate(role === "ADMIN" ? "/admin" : "/customer");
    }
    setEmail("")
    setPassword("")
  };

  return (
    <div>
      <span style={{"color":"red"}}>{error}</span>
      <h2>Login</h2>
      <input type="email" placeholder="Email" onChange={(e) => setEmail(e.target.value)} value={email}/><br/>
      <input type="password" placeholder="Password" onChange={(e) => setPassword(e.target.value)} value={password}/><br/>
      <button onClick={handleLogin}>Sign In</button><br/>
      <NavLink to="signUp">SignUp</NavLink>
    </div>
  );
};

export default Login;

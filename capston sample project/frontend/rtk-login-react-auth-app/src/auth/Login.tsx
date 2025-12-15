import { useState } from "react";
import { useDispatch, useSelector } from "react-redux";
import { signInUser } from "./authSlice";
import { NavLink, Route, useNavigate } from "react-router-dom";

const Login = () => {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const dispatch = useDispatch<any>();
  const navigate = useNavigate();
  let error = useSelector((gs:any)=>gs.auth.error)  
  
  const handleLogin = async () => {
    
    const res = await dispatch(signInUser({ email, password }));
    
    if (res.meta.requestStatus === "fulfilled") {
      let token = res.payload.token
      let role = res.payload.role
      localStorage.setItem("role",role);
      localStorage.setItem("token",token)
      navigate(role === "ADMIN" ? "/admin" : "/customer");
    }
  };

  return (
    <div>
      <span style={{"color":"red"}}>{error}</span>
      <h2>Login</h2>
      <input type="email" placeholder="Email" onChange={(e) => setEmail(e.target.value)} /><br/>
      <input type="password" placeholder="Password" onChange={(e) => setPassword(e.target.value)} /><br/>
      <button onClick={handleLogin}>Sign In</button><br/>
      <NavLink to="signUp">SignUp</NavLink>
    </div>
  );
};

export default Login;

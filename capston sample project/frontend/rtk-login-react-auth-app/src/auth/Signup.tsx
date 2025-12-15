import { useState } from "react";
import { useDispatch, useSelector } from "react-redux";
import { signUpUser } from "./authSlice";
import { NavLink } from "react-router-dom";


const Signup = () => {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [role, setRole] = useState("CUSTOMER");
  const dispatch = useDispatch<any>();
  let message = useSelector((gs:any)=>gs.auth.message)

  return (
    <div>
      <span style={{"color":"red"}}>{message}</span>
      <h2>Signup</h2>
      <input type="email" placeholder="Email" onChange={(e) => setEmail(e.target.value)} /><br/>
      <input type="password" placeholder="Password" onChange={(e) => setPassword(e.target.value)} /> <br/>
      <select onChange={(e) => setRole(e.target.value)}>
        <option value="CUSTOMER">Customer</option>
        <option value="ADMIN">Admin</option>
      </select><br/>
      <button onClick={() => dispatch(signUpUser({ email, password, role }))}>
        Sign Up
      </button><br/>
      <NavLink to="/">Login</NavLink>
    </div>
  );
};

export default Signup;

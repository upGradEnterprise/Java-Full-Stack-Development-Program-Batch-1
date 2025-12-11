import { useNavigate } from "react-router-dom";

function Dashboard() {

    let navigate =  useNavigate();
    let user = sessionStorage.getItem("user");
let logout = ()=> {
    sessionStorage.removeItem("user");
    navigate("/")
    //axios.post(url,object,{header:{authorization:tokenValue}})
}
    return(
        <div>
            <h2>Welcome to Home Page <input type="button" value="logout" onClick={logout}/></h2>
            <p>Welcome user {user}</p>
        </div>
    )
}

export default Dashboard;
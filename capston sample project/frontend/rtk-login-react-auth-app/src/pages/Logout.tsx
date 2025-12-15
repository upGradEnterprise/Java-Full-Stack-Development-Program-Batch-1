import { useNavigate } from "react-router-dom";
//import { useDispatch } from "react-redux";

export default function LogoutButton() {
  const navigate = useNavigate();
  //const dispatch = useDispatch<any>();

  const handleLogout = () => {

    localStorage.removeItem("token");


    // redirect to login
    navigate("/", { replace: true });
  };

  return (
    <button
      onClick={handleLogout}
      style={{
        padding: "8px 8px",
        color: "black",
        border: "none",
        borderRadius: "4px",
        cursor: "pointer"
      }}
    >
      Logout
    </button>
  );
}

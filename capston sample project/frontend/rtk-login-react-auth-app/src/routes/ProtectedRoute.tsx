import { useSelector } from "react-redux";
import { Navigate } from "react-router-dom";
//import { RootState } from "../app/store";

const ProtectedRoute = ({ children, role }: any) => {
  const { token, role: userRole } = useSelector((gs:any) => gs.auth);
  if (!token || userRole !== role) return <Navigate to="/" />;
  return children;
};

export default ProtectedRoute;

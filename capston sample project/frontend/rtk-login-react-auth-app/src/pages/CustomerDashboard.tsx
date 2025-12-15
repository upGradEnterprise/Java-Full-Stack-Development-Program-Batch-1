import ProductList from "../components/ProductList";
import LogoutButton from "./Logout";

export default () => (
  <>
    <h2>Customer Dashboard<LogoutButton/> </h2>
    <ProductList />
  </>
);

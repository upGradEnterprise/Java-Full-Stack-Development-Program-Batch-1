import ProductList from "../components/ProductList";
import AddProduct from "../components/AddProduct";
import LogoutButton from "./Logout";

export default () => (
  <>
    <h2>Admin Dashboard<LogoutButton/> </h2>
    <AddProduct />
    <ProductList />
  </>
);

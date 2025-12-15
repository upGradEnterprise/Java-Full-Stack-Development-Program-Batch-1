import { useEffect } from "react";
import { useDispatch, useSelector } from "react-redux";
import { fetchProducts } from "../service/productSlice";
//import { RootState } from "../service/store";

const ProductList = () => {
  const dispatch = useDispatch<any>();
  const products = useSelector((gs:any) => gs.products.products);

  useEffect(() => {
    dispatch(fetchProducts());
  }, []);

  return (
    <ul>
      {products.map((p: any) => (
        <li key={p.id}>{p.name} - {p.price} - {p.description}</li>
      ))}
    </ul>
  );
};

export default ProductList;

import { useState } from "react";
import { useDispatch } from "react-redux";
import { createProduct } from "../service/productSlice";

interface ProductPayload {
  name: string;
  price: number;
  description: string;
}

function AddProduct() {
  const dispatch = useDispatch<any>();

  const [name, setName] = useState<string>("");
  const [price, setPrice] = useState<number>(0);
  const [description, setDescription] = useState<string>("");

  const handleAddProduct = () => {
    const product: ProductPayload = {
      name,
      price,
      description
    };

    dispatch(createProduct(product));

    setName("");
    setPrice(0);
    setDescription("");
  };

  return (
    <div style={{ width: "300px" }}>
      <h3>Add Product</h3>

      <input
        type="text"
        placeholder="Product Name"
        value={name}
        onChange={(e) => setName(e.target.value)}
      />

      <br /><br />

      <input
        type="number"
        placeholder="Price"
        value={price}
        onChange={(e) => setPrice(Number(e.target.value))}
      />

      <br /><br />

      <textarea
        placeholder="Description"
        value={description}
        onChange={(e) => setDescription(e.target.value)}
      />

      <br /><br />

      <button onClick={handleAddProduct}>
        Add Product
      </button>
    </div>
  );
}

export default AddProduct
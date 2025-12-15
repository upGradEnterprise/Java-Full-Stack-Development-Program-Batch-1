import { useEffect, useState } from "react";
import { getProducts } from "../services/productService";

const ProductList = () => {
  const [products, setProducts] = useState<any>([]);
  const [error, setError] = useState("");
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    getProducts()
      .then(setProducts)
      .catch(() => setError("Failed to load products"))
      .finally(() => setLoading(false));
  }, []);

  if (loading) return <p>Loading...</p>;
  if (error) return <p role="alert">{error}</p>;

  return (
    <div>
      <h2>Product List</h2>
      <p>{products.length} Products Loaded</p>

      <ul>
        {products.map((product:any) => (
          <li
            key={product.id}
            data-testid={`product-${product.id}`}
          >
            <span data-testid={`product-title-${product.id}`}>
              {product.title}
            </span>
            {" - "}
            <span data-testid={`product-price-${product.id}`}>
              {product.price}
            </span>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default ProductList;

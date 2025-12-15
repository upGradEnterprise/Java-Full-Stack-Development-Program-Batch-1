import { render, screen } from "@testing-library/react";
import ProductList from "./ProductList";
import * as service from "../services/productService";
import { vi } from "vitest";

//1st parameter reference 2nd parameter function name 
// fake rest api 
// fake data 
vi.spyOn(service, "getProductsUsingAxios").mockResolvedValue(
  [
  { id: 1, title: "Mock Product", price: 100, category: "test" }
  ]
);

test("loads products from fake API", async () => {
render(<ProductList url="abc"/>);


const productItem = await screen.findByTestId("product-1");
  const productTitle = screen.getByTestId("product-title-1");
  const productPrice = screen.getByTestId("product-price-1");

  expect(productItem).toBeInTheDocument();
  expect(productTitle.textContent).toBe("Mock Product");
  expect(productPrice.textContent).toBe("100");

});

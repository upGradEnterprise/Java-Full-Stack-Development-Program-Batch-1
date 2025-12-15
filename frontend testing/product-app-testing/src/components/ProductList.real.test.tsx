import { render, screen } from "@testing-library/react";
import ProductList from "./ProductList";

test("checks specific product details", async () => {
  render(<ProductList />);

  // Wait until products load
  await screen.findByText("20 Products Loaded");

  // Example: product with ID = 1 (FakeStore API)
  const productItem = await screen.findByTestId("product-2");
  const productTitle = await screen.getByTestId("product-title-2");
  const productPrice = await screen.getByTestId("product-price-2");

  expect(productItem).toBeInTheDocument();
  expect(productTitle.textContent).toBe("Mens Casual Premium Slim Fit T-Shirts ");
  expect(productPrice.textContent).toBe("22.3");
});

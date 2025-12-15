import { render, screen } from "@testing-library/react";
import ProductList from "./ProductList";

test("checks specific product details", async () => {
  render(<ProductList />);

  // Wait until products load
  await screen.findByText(/Products Loaded/i);

  // Example: product with ID = 1 (FakeStore API)
  const productItem = await screen.findByTestId("product-1");
  const productTitle = screen.getByTestId("product-title-1");
  const productPrice = screen.getByTestId("product-price-1");

  expect(productItem).toBeInTheDocument();
  expect(productTitle.textContent).toBe("Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops");
  expect(productPrice.textContent).toBe("109.95");
});

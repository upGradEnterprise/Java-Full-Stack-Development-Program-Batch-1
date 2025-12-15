import axios from "axios";

export const getProducts = async () => {
  const res = await fetch("https://fakestoreapi.com/products");
  if (!res.ok) throw new Error("API error");
  return res.json();
};


export const getProductsUsingAxios = async () => {
  const res = await axios.get("https://fakestoreapi.com/products");
  return res.data
};
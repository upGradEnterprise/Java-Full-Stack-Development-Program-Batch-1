import axios from "axios";

const API = axios.create({
  baseURL: "http://localhost:8080/api/products",
});

// API hold root path 

API.interceptors.request.use((config) => {
  const token = localStorage.getItem("token");    // token receive from localStorage 
  console.log("in product token "+token)
  if (token) {
    config.headers.Authorization = `Bearer ${token}`;   // Bearer token 
  }
  console.log("In Config object in interceptor")
  console.log(config)
  return config;
});

export const getProducts = async () => {
  const res = await API.get("/find");
  console.log(res)
  return res.data;
};

export const addProduct = async (product: any) => {
  const res = await API.post("/storeProduct", product);
  console.log(res)
  return res.data;
};

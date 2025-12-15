import axios from "axios";

const API = "http://localhost:8080/api/auth";

export const signIn = async (data: any) => {
  const res = await axios.post(`${API}/signin`, data);
  console.log(res.data)
  return res;
};

export const signUp = async (data: any) => {
  const res = await axios.post(`${API}/signup`, data);
  console.log(res.data)
  return res;
};

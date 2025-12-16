import { createAsyncThunk, createSlice } from "@reduxjs/toolkit";
import { signIn, signUp } from "./authService";

export const signUpUser = createAsyncThunk(
  "auth/signup",
  async (data: any, { rejectWithValue }) => {
    try {
      const res = await signUp(data);
      return res.data;
    } catch (err: any) {
      return rejectWithValue(err.response.data);
    }
  }
);

export const signInUser = createAsyncThunk(
  "auth/login",
  async (data: any, { rejectWithValue }) => {
    try {
      const res = await signIn(data);
      localStorage.setItem("token", res.data.token);
      localStorage.setItem("role", res.data.role);
      return res.data;
    } catch (err: any) {
      return rejectWithValue(err.response.data);
    }
  }
);

const authSlice = createSlice({
  name: "auth",
  initialState: {
    user: null,
    loading: false,
    error: "",
    message:"",
    role:"",
    token:""
  },
  reducers: {},
  extraReducers: (builder) => {
    builder
      // signup
      .addCase(signUpUser.pending, (state) => {
        state.loading = true;
      })
      .addCase(signUpUser.fulfilled, (state,action) => {
        state.loading = false;
        state.message = action.payload.message;
        
      })
      .addCase(signUpUser.rejected, (state, action:any) => {
        state.loading = false;
        state.error = action.payload.message;
      })

      // login
      .addCase(signInUser.pending, (state) => {
        state.loading = true;
        state.error = "";
      })
      .addCase(signInUser.fulfilled, (state, action) => {
        state.loading = false;
        state.user = action.payload;
        //state.message=action.payload.message
        state.token = action.payload.token;
        state.role  = action.payload.role
      })
      .addCase(signInUser.rejected, (state, action:any) => {
        state.loading = false;
        state.error = action.payload.message
  
      });
  },
});

export default authSlice.reducer;

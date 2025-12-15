import { createAsyncThunk, createSlice } from "@reduxjs/toolkit";
import { getProducts, addProduct } from "./productService";



export const fetchProducts = createAsyncThunk(
  "products/fetch",
  async (_, { rejectWithValue }) => {
    try {
      return await getProducts();
    } catch (error: any) {
      return rejectWithValue(error.message || "Failed to fetch products");
    }
  }
);

export const createProduct = createAsyncThunk(
  "products/add",
  async (product: any, { rejectWithValue }) => {
    try {
      return await addProduct(product);
    } catch (error: any) {
      return rejectWithValue(error.message || "Failed to add product");
    }
  }
);


const productSlice = createSlice({
  name: "products",
  initialState: {
    products: [] as any[],
    loading: false,
    error: null as any,
  },
  reducers: {},
  extraReducers: (builder) => {

    builder
      .addCase(fetchProducts.pending, (state) => {
        state.loading = true;
        state.error = null;
      })
      .addCase(fetchProducts.fulfilled, (state, action) => {
        state.loading = false;
        state.products = action.payload;
      })
      .addCase(fetchProducts.rejected, (state, action) => {
        state.loading = false;
        state.error = action.payload;
      });


    builder
      .addCase(createProduct.pending, (state) => {
        state.loading = true;
        state.error = null;
      })
      .addCase(createProduct.fulfilled, (state, action) => {
        state.loading = false;
        state.products.push(action.payload);
      })
      .addCase(createProduct.rejected, (state, action) => {
        state.loading = false;
        state.error = action.payload;
      });
  },
});

export default productSlice.reducer;

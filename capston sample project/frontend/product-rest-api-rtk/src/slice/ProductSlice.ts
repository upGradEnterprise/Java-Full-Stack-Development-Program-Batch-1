import { createAsyncThunk, createSlice } from "@reduxjs/toolkit";
import { loadProductFromBackend, storeProductInBackend } from "../api_service/ProductAPI";

interface ProductType{
    products:any[],     // hold all product retrieve from backend technologies. 
    loading:boolean,
    error:string|null|undefined,
    msg:string
}
let initialState:ProductType={
    products:[],        // load the data 
    loading:true,       // check status ie pending, full fill or rejected 
    error:null,          // handle the error 
    msg:""
}
export let loadProducts = createAsyncThunk("product/load",async()=> {
    let result = await loadProductFromBackend();
    return result;
})

export let storeProducts = createAsyncThunk("product/store",async(product:any)=> {
    //console.log("in slice "+product)
    let result = await storeProductInBackend(product);
    return result;
})



export let productSlice = createSlice({
    name:"product",
    initialState,
    reducers: {},  // i need to write action and manually handle all promise state 
    extraReducers:(builder)=> {
        // load product data 
        builder.
        addCase(loadProducts.fulfilled,(state,action)=> {
            state.loading=false
            state.products=action.payload
        }).addCase(loadProducts.rejected,(state,action)=> {
            state.error=action.error.message
            state.loading=false;
        }).addCase(loadProducts.pending,(state)=> {
            state.loading=true;
        }).addCase(storeProducts.fulfilled,(state,action)=> {
            state.loading=false
            //state.products=action.payload
            state.msg="Your product store with id as "+action.payload
        }).addCase(storeProducts.rejected,(state,action)=> {
            state.error=action.error.message
            state.loading=false;
        }).addCase(storeProducts.pending,(state)=> {
            state.loading=true;
        })
    }
})
//export const {loadProducts}=productSlice.actions
export default productSlice.reducer
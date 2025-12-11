import { configureStore } from "@reduxjs/toolkit";
import productReducer from './slice/ProductSlice'

let storeRef = configureStore({
    reducer: {
        product:productReducer
    }
})

export default storeRef;
//export type AppDispatch = typeof storeRef.dispatch;
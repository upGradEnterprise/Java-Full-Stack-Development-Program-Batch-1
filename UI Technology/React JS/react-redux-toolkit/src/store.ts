import { configureStore } from "@reduxjs/toolkit";
import counterReducer from './counterSlice';

let storeRef = configureStore({
    reducer:{
        counter:counterReducer
    }
})

export default storeRef;
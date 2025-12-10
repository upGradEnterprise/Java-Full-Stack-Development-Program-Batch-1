import { createSlice } from "@reduxjs/toolkit"
let initialState = {
    n :0
}
let counterSlice = createSlice({
name:"counter",
initialState,
reducers:{
    increment:(state)=> {
        state.n= state.n+1
    },
    decrement:(state)=> {
        state.n= state.n-1
    }
}
});
export const {increment,decrement}=counterSlice.actions
export default counterSlice.reducer;

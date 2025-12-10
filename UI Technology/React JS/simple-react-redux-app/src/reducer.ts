// name is global state variable. 
let initialState = {
        name:"Akash Kale" ,      // name of type string 
        counter:100,
        products:[
            {pid:100,pname:"TV",price:56000},
            {pid:101,pname:"Computer",price:35000},
        ]
}
function reducer(state:any=initialState,action:any): any{
        // with condition we can do the change on state variable 
        console.log(action)
        if(action.type==="INCREMENT"){
            return {...state,counter:state.counter+1}
        }
        if(action.type==="DECREMENT"){
            return {...state,counter:state.counter-1}
        }
        if(action.type==="DYNAMIC_INCREMENT"){
            return {...state,counter:state.counter+eval(action.payload)}
        }
        if(action.type==="ADD_PRODUCT"){
            let newProduct = action.payload;
            return {...state,products:[...state.products,newProduct]}
        }
        return state;
}

export default reducer;
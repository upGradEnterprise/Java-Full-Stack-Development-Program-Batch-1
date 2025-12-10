// name is global state variable. 
let initialState = {
    name:"Akash Kale" ,      // name of type string 
    counter:100
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
        return state;
}

export default reducer;
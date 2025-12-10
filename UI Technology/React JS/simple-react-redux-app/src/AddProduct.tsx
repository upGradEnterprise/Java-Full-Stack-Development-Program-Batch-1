import { useState } from "react";
import { useDispatch, useSelector } from "react-redux";
function AddProduct() {
let [product,setProduct]=useState<any>({pid:"",pname:"",price:""});
let products = useSelector((gs:any)=>gs.products)
let dispatch = useDispatch();
let [msg,setMsg]=useState<any>("");

let addProductData = (event:any)=> {
    event.preventDefault();
    console.log(product)
    let result = products.find((p:any)=>p.pid==product.pid);
    if(result!=undefined){
        setMsg("Product id must be unique");
    }else {
       // setMsg("ready to store")
       dispatch({type:"ADD_PRODUCT",payload:product})
    }
    setProduct({pid:"",pname:"",price:""})
}
    return(
        <div>
            <span style={{"color":"red"}}>{msg}</span>
            <h2>Add Product</h2>
            <form onSubmit={addProductData}>
            <input type="text" name="pid" value={product.pid} placeholder="Enter the pid"
            onChange={(event)=>setProduct({...product,"pid":event.target.value})}/><br/>
            <input type="text" name="pname" value={product.pname} placeholder="Enter the pname"
            onChange={(event)=>setProduct({...product,"pname":event.target.value})}/><br/>
            <input type="text" name="price" value={product.price} placeholder="Enter the price"
            onChange={(event)=>setProduct({...product,"price":event.target.value})}/><br/>
            <input type="submit" value="Add Product"/>
            </form>
        </div>
    )
}

export default AddProduct;
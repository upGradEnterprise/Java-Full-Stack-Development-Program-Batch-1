import { useState } from "react";
import { useDispatch, useSelector } from "react-redux";
import { storeProducts } from "../slice/ProductSlice";
function AddProduct() {
let [product,setProduct]=useState<any>({pname:"",price:"",qty:""});

let dispatch = useDispatch<any>();
//let loading = useSelector((gs:any)=>gs.product.loading)
let error = useSelector((gs:any)=>gs.product.error)
let msg = useSelector((gs:any)=>gs.product.msg)
let addProduct= (event:any)=> {
    event.preventDefault();
    console.log(product);
    dispatch(storeProducts(product))
    setProduct({pname:"",price:"",qty:""});
}
    return(
        <div>
            <h3>Add Product</h3>
            <span style={{"color":"red"}}>{error}</span>
            <span>{msg}</span>
            <form onSubmit={addProduct}>
            <input type="text" name="pname" value={product.pname} 
            placeholder="Enter Product Name"
            onChange={(event)=>setProduct({...product,"pname":event.target.value})}/><br/>

            <input type="text" name="price" value={product.price} 
            placeholder="Enter Product Price"
            onChange={(event)=>setProduct({...product,"price":event.target.value})}/><br/>

            <input type="text" name="qty" value={product.qty} 
            placeholder="Enter Product Qty"
            onChange={(event)=>setProduct({...product,"qty":event.target.value})}/><br/>
            <input type="submit" value="Store Product"/>
            </form>
        </div>
    )
}

export default AddProduct;
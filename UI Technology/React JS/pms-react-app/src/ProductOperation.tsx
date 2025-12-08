import { useState } from "react";
import {ProductType } from "./ProductType";

function ProductOperation(){
let [product,setProduct]=useState<ProductType>()
let addProduct = (event:any)=> {
    console.log("event fired")
    event.preventDefault();         // disable form action behaviour 
    console.log(product)
}
    return(
        <div>
            <h2>Product CRUD Operation</h2>
            <form onSubmit={addProduct}>
                <label>PId</label>
                <input type="number" name="pid" onChange={(event:any)=>{
                    //console.log(event.target.value)
                    setProduct({...product,"pid":event.target.value})
                }}/><br/>
                <label>PName</label>
                <input type="text" name="pname" onChange={(event:any)=>{
                    //console.log(event.target.value)
                    setProduct({...product,"pname":event.target.value})
                }}/><br/>
                <label>Price</label>
                <input type="number" name="price" onChange={(event:any)=>{
                    //console.log(event.target.value)
                    setProduct({...product,"price":event.target.value})
                }}/><br/>
                <label>qty</label>
                <input type="number" name="qty" onChange={(event:any)=>{
                    //console.log(event.target.value)
                    setProduct({...product,"qty":event.target.value})
                }}/><br/>
                <label>Image URL</label>
                <input type="url" name="imageUrl" onChange={(event:any)=>{
                    //console.log(event.target.value)
                    setProduct({...product,"imageUrl":event.target.value})
                }}/><br/>
                <input type="submit" value="Add Product"/>
            </form>
        </div>
    )
}
export default ProductOperation;
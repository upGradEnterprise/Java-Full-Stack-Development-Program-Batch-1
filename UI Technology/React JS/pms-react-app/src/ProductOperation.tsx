import { useState } from "react";
import  type {ProductType } from "./ProductType";

function ProductOperation(){
let [product,setProduct]=useState<ProductType>({"pid":0,"pname":"",price:0.0,"qty":0,imageUrl:"",}); // array type 
let [products,setProducts]=useState<ProductType[]>([]);                     // array of object type 
let addProduct = (event:any)=> {
    console.log("event fired")
    event.preventDefault();         // disable form action behaviour 
    console.log(product)
    
    let tempProducts = products.slice();
    tempProducts.push(product);
    setProducts(tempProducts);

    //setProducts([...products,product])
    setProduct({"pid":0,"pname":"",price:0.0,"qty":0,imageUrl:""});
    console.log("Product Added")
}
    return(
        <div>
            <h2>Product CRUD Operation</h2>
            <form onSubmit={addProduct}>
                <label>PId</label>
                <input type="number" name="pid" value={product.pid} onChange={(event:any)=>{
                    //console.log(event.target.value)
                    setProduct({...product,"pid":event.target.value})
                    
                }}/><br/>
                <label>PName</label>
                <input type="text" name="pname" value={product.pname} onChange={(event:any)=>{
                    //console.log(event.target.value)
                    setProduct({...product,"pname":event.target.value})
                }}/><br/>
                <label>Price</label>
                <input type="number" name="price" value={product.price} onChange={(event:any)=>{
                    //console.log(event.target.value)
                    setProduct({...product,"price":event.target.value})
                }}/><br/>
                <label>qty</label>
                <input type="number" name="qty" value={product.qty} onChange={(event:any)=>{
                    //console.log(event.target.value)
                    setProduct({...product,"qty":event.target.value})
                }}/><br/>
                <label>Image URL</label>
                <input type="url" name="imageUrl" value={product.imageUrl} onChange={(event:any)=>{
                    //console.log(event.target.value)
                    setProduct({...product,"imageUrl":event.target.value})
                }}/><br/>
                <input type="submit" value="Add Product"/>
            </form>
            <hr/>
            <table>
                <tr>
                    <th>PId</th>
                    <th>PName</th>
                    <th>Price</th>
                    <th>Qty</th>
                    <th>ImageUrl</th>
                </tr>
                {
                products.map(product=>
                    <tr>
                        <td>{product.pid}</td>
                        <td>{product.pname}</td>
                        <td>{product.price}</td>
                        <td>{product.qty}</td>
                        <td><img src={product.imageUrl} width="100px" height="100px"/></td>
                    </tr>
                )       
                }
            </table>
        </div>
    )
}
export default ProductOperation;
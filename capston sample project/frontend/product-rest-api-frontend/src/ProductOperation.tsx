import { useState } from "react";
import type {Product } from "./Product";
import axios from "axios";

function ProductOperation() {
let [product,setProduct]=useState<Product>({id:"",pname:"",price:0.0,qty:0});
let [products,setProducts]=useState<Product[]>([])
let [errorMsg,setErrorMsg]=useState<any>("")
let PRODUCT_BASE_URL="http://localhost:8080/api/product";

let [pname,setPName]=useState<string>("")
let [price,setPrice]=useState<number>(0.0)
let [qty,setQty]=useState<number>(0)

let loadProduct = async ()=> {
    setErrorMsg("")
    try{
    let result =   await axios.get(PRODUCT_BASE_URL+"/find")
    //console.log(result.data)
    setProducts(result.data)
    }catch(error : any){
        console.log(error.message)
        setErrorMsg(error.message)
    }
}

let storeProduct=async (event:any)=> {
    event.preventDefault();
    //console.log("event fired")
    console.log(pname,price,qty)            
    let product = {pname,price,qty} // converting each state variable to object. 
    //console.log(product)
    try{
    let result = await axios.post(PRODUCT_BASE_URL+"/store",product)
    console.log(result);
    setErrorMsg("Your record stored with id as "+result.data)
    }catch(error:any){
        console.log(error.message)
        setErrorMsg(error.message)
    }
    setPName("")
    setPrice(0.0)
    setQty(0)
}
return(
    <div>
        <h3>Product Component</h3>
        <span style={{"color":"red"}}>{errorMsg}</span>
        <input type="button" value="Load Product" onClick={loadProduct}/>
        <form onSubmit={storeProduct}>
            <label>PName</label>
            <input type="text" name="pname" value={pname} 
            onChange={(event:any)=>setPName(event.target.value)}/><br/>

            <label>Price</label>
            <input type="number" name="price" value={price} 
            onChange={(event:any)=>setPrice(event.target.value)}/><br/>

            <label>Qty</label>
            <input type="number" name="qty" value={qty} 
            onChange={(event:any)=>setQty(event.target.value)}/><br/>

            <input type="submit" value="Add Product"/>
        </form>
        <hr/>
        <table>
            <thead>
                <tr>
                    <th>PId</th>
                    <th>PName</th>
                    <th>Price</th>
                    <th>Qty</th>
                </tr>
            </thead>
            <tbody>
                {
                    products.map((p:Product)=>
                    <tr key={p.id}>
                        <td>{p.id}</td>
                        <td>{p.pname}</td>
                        <td>{p.price}</td>
                        <td>{p.qty}</td>
                    </tr>
                    )
                }
            </tbody>
        </table>
    </div>
)
}

export default ProductOperation;
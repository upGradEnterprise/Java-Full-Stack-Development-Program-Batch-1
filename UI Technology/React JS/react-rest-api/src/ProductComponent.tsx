import axios from "axios";
import { useState } from "react";
function ProductComponent(){
let URL = "https://api.escuelajs.co/api/v1/products";
let [product,setProducts]=useState([])
let loadProductDetails= ()=> {
   //axios.get(URL).then(result=>console.log(result.data)).catch(error=>console.log(error))
    axios.get(URL).then(result=>{
        setProducts(result.data)
    }).catch(error=>console.log(error))
}
    return(
        <div>
            <h2>Product Details</h2>
            <input type="button" value="Load Product"  onClick={loadProductDetails}/>
            <br/>
            <h1>Number of product are {product.length}</h1>
            <table>
                <thead>
                <tr>
                    <th>Title</th>
                    <th>Price</th>
                </tr>
                </thead>
                <tbody>
                {
                    product.map((p:any)=>
                        <tr key={p.id}>
                            <td>{p.title}</td>
                            <td>{p.price}</td>
                        </tr>
                    )
                }
                </tbody>
            </table>
        </div>
    )
}

export default ProductComponent;
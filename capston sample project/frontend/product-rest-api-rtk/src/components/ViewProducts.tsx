import { useEffect, useState } from "react";
import { useDispatch, useSelector } from "react-redux";
import { loadProducts } from "../slice/ProductSlice";
import DeleteProduct from "./DeleteProduct";
import UpdateProduct from "./UpdateProduct";
function ViewProducts() {

let dispatch = useDispatch<any>();
let products = useSelector((gs:any)=>gs.product.products)
let loading = useSelector((gs:any)=>gs.product.loading)
let error = useSelector((gs:any)=>gs.product.error)
let msg = useSelector((gs:any)=>gs.product.msg);
let [flag,setFlag]=useState(true);
useEffect(()=> {
    setTimeout(()=> {
    dispatch(loadProducts())
    },500)

},[msg])

    if(loading) return <h3>Data Loading....</h3>
    if(!loading) return( 
    <div>
        {
            flag?
        <div>    
        <h3>Number of records are {products.length}</h3>
        <span style={{"color":"red"}}>{error}</span>
        <table>
            <thead>
                <tr>
                    <th>PId</th>
                    <th>PName</th>
                    <th>Price</th>
                    <th>Qty</th>
                    <th>Delete</th>
                    <th>Update</th>
                </tr>
            </thead>
            <tbody>
                {products.map((product:any)=>
                <tr key={product.id}>
                    <td>{product.id}</td>
                    <td>{product.pname}</td>
                    <td>{product.price}</td>
                    <td>{product.qty}</td>
                    <td><DeleteProduct pid={product.id}/></td>
                    <td><UpdateProduct product={product} flagFun={setFlag}></UpdateProduct> </td>
                </tr>
                )}
            </tbody>
        </table>
        </div>        
            :
            null    

        }

    </div>)
}

export default ViewProducts;
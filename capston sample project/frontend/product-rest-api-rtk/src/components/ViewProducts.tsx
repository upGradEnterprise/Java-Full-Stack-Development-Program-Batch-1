import { useEffect } from "react";
import { useDispatch, useSelector } from "react-redux";
import { loadProducts } from "../slice/ProductSlice";
function ViewProducts() {

let dispatch = useDispatch<any>();
let products = useSelector((gs:any)=>gs.product.products)
let loading = useSelector((gs:any)=>gs.product.loading)
let error = useSelector((gs:any)=>gs.product.error)
useEffect(()=> {
    setTimeout(()=> {
    dispatch(loadProducts())
    },3000)

},[])

    if(loading) return <h3>Data Loading....</h3>
    if(!loading) return( 
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
                </tr>
            </thead>
            <tbody>
                {products.map((product:any)=>
                <tr key={product.id}>
                    <td>{product.id}</td>
                    <td>{product.pname}</td>
                    <td>{product.price}</td>
                    <td>{product.qty}</td>
                </tr>
                )}
            </tbody>
        </table>
    </div>)
}

export default ViewProducts;
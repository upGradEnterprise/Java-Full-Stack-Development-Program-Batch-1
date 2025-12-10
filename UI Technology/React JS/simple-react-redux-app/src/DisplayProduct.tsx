import { useSelector } from "react-redux";

function DisplayProduct(){
let products = useSelector((gs:any)=>gs.products)
return(
    <>
    <h3>All Global State Products</h3>
    <ul>
        {products.map((p:any)=><li key={p.pid}>PId {p.pid} PName {p.pname} Price {p.price}</li>)}
    </ul>
    </>
)
}

export default DisplayProduct;
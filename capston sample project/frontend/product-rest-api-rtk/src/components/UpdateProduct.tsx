function UpdateProduct(props:any) { // props ready to take all property of props, {pid:any} only ready receive only value 

let updateProduct= (product:any)=> {
    //alert(pid)
    console.log(product)
    props.flagFun(false)
}
    return(
        <div>
            <input type="button" value="update" onClick={()=>updateProduct(props.product)}/>
        </div>
    )
}

export default UpdateProduct;
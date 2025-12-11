function DeleteProduct(props:any) { // props ready to take all property of props, {pid:any} only ready receive only value 

let deleteProduct= (pid:any)=> {
    alert(pid)
}
    return(
        <div>
            <input type="button" value="delete" onClick={()=>deleteProduct(props.pid)}/>
        </div>
    )
}

export default DeleteProduct;
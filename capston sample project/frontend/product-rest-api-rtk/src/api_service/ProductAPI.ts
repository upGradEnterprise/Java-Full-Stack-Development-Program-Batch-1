import axios from "axios"

let PRODUCT_URL="http://localhost:8080/api/product"

export let loadProductFromBackend = async() => {
    let result = await axios.get(PRODUCT_URL+"/find")
    console.log(result.data)
    return result.data;
}

export let storeProductInBackend = async(product:any) => {
    let result = await axios.post(PRODUCT_URL+"/store",product)
    console.log(result)
    console.log(result.data)
    return result.data;
}
fetch("https://dummyjson.com/products").then(response=>response.json()).
then(result=>{

    //console.log(result.products)
    result.products.forEach(p=> {
        let div = document.createElement("div")
        let divValue = document.createTextNode(p.title)
        //console.log(p.title)
        div.appendChild(divValue)
        document.body.appendChild(div)
    })
}).catch(error=>console.log("error "+error))
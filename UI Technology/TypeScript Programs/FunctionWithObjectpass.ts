
function receiveObject(obj:object): void {
    console.log(obj)
}
let emp1 = {id:100,name:"Ravi",salary:12000}
let product1 = {pid:123,pname:'Tv',price:56000}
receiveObject(emp1)
receiveObject(product1)
receiveObject({})
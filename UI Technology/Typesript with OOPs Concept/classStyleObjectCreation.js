// class Customer {
//     id;
//     name;
//     age;
//     constructor(id:number,name:string="Unknown",age:number=18){
//         this.id = id;
//         this.name = name;
//         this.age  = age;
//     }
//     displayEmpInfo():void {
//         console.log("id is "+this.id)
//         console.log("name is "+this.name)
//         console.log("age is "+this.age)
//     }
// }
// let cust1 = new Customer(100,"Ravi",21)
// let cust2 = new Customer(101,"Raju")
// let cust3 = new Customer(103)
// cust1.displayEmpInfo();
// cust2.displayEmpInfo();
// cust3.displayEmpInfo();
// typescript with constructor short cut initialization 
class Customer {
    //id;
    // name;
    // age;
    constructor(id, name = "Unknown", age = 18) {
        this.id = id;
        this.name = name;
        this.age = age;
        // this.id = id;
        // this.name = name;
        // this.age  = age;
    }
    displayEmpInfo() {
        console.log("id is " + this.id);
        console.log("name is " + this.name);
        console.log("age is " + this.age);
    }
}
let cust1 = new Customer(100, "Ravi", 21);
let cust2 = new Customer(101, "Raju");
let cust3 = new Customer(103);
cust1.displayEmpInfo();
cust2.displayEmpInfo();
cust3.displayEmpInfo();
console.log(cust1.age);

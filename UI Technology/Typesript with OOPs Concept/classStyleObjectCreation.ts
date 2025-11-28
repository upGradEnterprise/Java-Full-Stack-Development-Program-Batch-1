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
// class Customer {
//     constructor(private id:number,private name:string="Unknown",public age:number=18){ // automatically variable consider as instance if we use private or public 
   
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
// console.log(cust1.age)

// Simple inheritance example 

// class Employee {
//     displayEmp(): void {
//         console.log("Employee class function")
//     }
// }
// class Manager extends Employee {
//     displayMgr(): void {
//         console.log("Manager class function")
//     }
// }
// let emp1 = new Employee();
// let mgr1 = new Manager();
// emp1.displayEmp();
// mgr1.displayEmp();
// mgr1.displayMgr();

// interface with only function 
interface Bank {
    withdrawn(): void;
    deposit(): void;
}
class Hdfc implements Bank {
    withdrawn(): void {
        
    }
    deposit(): void {
        
    }
}








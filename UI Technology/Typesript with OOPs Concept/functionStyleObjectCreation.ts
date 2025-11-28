// function Employee() {
//     this.id = 100;
//     this.name = "Ravi";
//     this.age = 21;
//     this.displayEmployeeInfo = function() {
//         console.log("id is "+this.id)
//         console.log("name is "+this.name)
//         console.log("age is "+this.age)
//     }
// }

// let emp1 = new Employee();
// emp1.displayEmployeeInfo();

interface EmployeeType {
        id:number;
        name:string;
        age?:number;
}
function Employee(this:EmployeeType){
    this.id = 100;
    this.name = "Ravi";
    //this.salary = 34000;
    this.age = 21;
}
//let emp1 = new Employee();        // Error 
let emp1 = new (Employee as any);   // object creation of function in typescript in strict mode 
console.log(emp1.id+" "+emp1.name+" "+emp1.age)     
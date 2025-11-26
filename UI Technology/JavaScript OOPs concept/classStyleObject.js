// class Employee {

//     id=0
//     name=""
//     salary=0.0;

//     displayEmployeeInfo() {
//         document.write("<br/>Employee class method or function <br/>")
//         document.write("<br/>id is "+this.id)
//         document.write("<br/>name is "+this.name)
//         document.write("<br/>salary is "+this.salary)
//     }
// }

// let emp1 = new Employee();
// emp1.id=100;
// emp1.name="Raj"
// emp1.salary= 12000;
// emp1.displayEmployeeInfo();

// let emp2 = new Employee();
// emp2.id=101;
// emp2.name="Raju"
// emp2.salary= 15000;
// emp2.displayEmployeeInfo();

// constructor 
// class Employee {
//     constructors() {
//         document.write("object create of employee<br/>")
//     }
//     display() {
//         document.write("display function <br/>")
//     }
// }
// let emp1 = new Employee();
// emp1.display();

// creating object with parameterize constructor 


class Employee {
    // id=0
    // name=""
    // salary=0.0;
    constructor(id=0,name="Unknown",salary=0){
        this.id = id;           // this.id is consider as instance variable with dynamic value 
        this.name = name;
        this.salary=salary;
    }
    displayEmployeeInfo() {
        document.write("<br/>Employee class method or function <br/>")
        document.write("<br/>id is "+this.id)
        document.write("<br/>name is "+this.name)
        document.write("<br/>salary is "+this.salary)
    }
}

let emp1 = new Employee(100,"Raj",12000);
emp1.displayEmployeeInfo();

let emp2 = new Employee(101,"Raju",14000);
emp2.displayEmployeeInfo();

let emp3 = new Employee(102,"Mahesh")
emp3.displayEmployeeInfo();

let emp4 = new Employee(103,)
emp4.displayEmployeeInfo();

let emp5 = new Employee()
emp5.displayEmployeeInfo();
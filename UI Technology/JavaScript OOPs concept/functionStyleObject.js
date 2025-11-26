// function Employee() {
//     console.log("Employee Object Created");
//     this.id = 0;              // instance variable 
//     this.name = "";
//     this.salary = 0.0;

//     let company = "UpGrad"; // private variable
//     this.displayEmployeenInfo = function() {    // instance method/function
//         document.write("<h3>Employee Details:</h3>");
//         document.write("ID: " + this.id + "<br>");
//         document.write("Name: " + this.name + "<br>");
//         document.write("Salary: " + this.salary + "<br>");
//         document.write("Company: " + company + "<br>");
//     }
//     let getCompany = function() { // private method
//         return company;
//     }
// }
// //Employee(); // normal function call
// let emp1 = new Employee(); // function style object creation
// emp1.id = 101;
// emp1.name = "John Doe";
// emp1.salary = 75000;
// document.write("id is is "+emp1.id+"Company "+emp1.company)
// emp1.displayEmployeenInfo();
// //emp1.getEmployee();           // Error: getEmployee is not accessible
// let emp2 = new Employee();
// emp2.id = 102;
// emp2.name = "Jane Smith";
// emp2.salary = 80000;
// emp2.displayEmployeenInfo();

// parameterized function style object creation

// function Employee(id,name="Unknown",salary=0.0) {
//     console.log("Employee Object Created");
//     this.id = id;              // instance variable 
//     this.name = name;
//     this.salary = salary;
//    this.displayEmployeenInfo = function() {    // instance method/function
//         document.write("<h3>Employee Details:</h3>");
//         document.write("ID: " + this.id + "<br>");
//         document.write("Name: " + this.name + "<br>");
//         document.write("Salary: " + this.salary + "<br>");
//     }
// }
// let emp1 = new Employee(101,"John Doe",75000); // function style object creation
// emp1.displayEmployeenInfo();

// let emp2 = new Employee(102,"Jane Smith",80000);
// emp2.displayEmployeenInfo();    

// let emp3 = new Employee(103,"Alice Johnson");
// emp3.displayEmployeenInfo();

// let emp4 = new Employee(104);
// emp4.displayEmployeenInfo();

// Adding dynamic property and method to function style object
function Employee(id,name,salary) {
    console.log("Employee Object Created");
    this.id = id;              // instance variable 
    this.name = name;
    this.salary = salary;
    this.displayEmployeenInfo = function() {    // instance method/function
        document.write("<h3>Employee Details:</h3>");
        document.write("ID: " + this.id + "<br>");
        document.write("Name: " + this.name + "<br>");
        document.write("Salary: " + this.salary + "<br>");
    }
}
let emp1  = new Employee(101,"John Doe",75000); // function style object creation
let emp2 = new Employee(102,"Jane Smith",80000);

// Adding dynamic property
emp1.department = "IT";             // particular object 
emp2.department = "HR";             // particular object
    Employee.prototype.city="Bangalore";    // adding dynamic property to prototype all object 

emp1.displayEmployeenInfo();
emp2.displayEmployeenInfo();
document.write("Department of emp1: " + emp1.department + "<br>");
document.write("Department of emp2: " + emp2.department + "<br>");

// Adding dynamic method
Employee.prototype.getAnnualSalary = function() {
    return this.salary * 12;
}
document.write("Annual Salary of emp1: " + emp1.getAnnualSalary() + "<br>");
document.write("Annual Salary of emp2: " + emp2.getAnnualSalary() + "<br>");
document.write("City of emp1: " + emp1.city + "<br>");
document.write("City of emp2: " + emp2.city + "<br>");
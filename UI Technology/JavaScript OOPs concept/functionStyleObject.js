function Employee() {
    console.log("Employee Object Created");
    this.id = 0;              // instance variable 
    this.name = "";
    this.salary = 0.0;

    let company = "UpGrad"; // private variable
    this.displayEmployeenInfo = function() {    // instance method/function
        document.write("<h3>Employee Details:</h3>");
        document.write("ID: " + this.id + "<br>");
        document.write("Name: " + this.name + "<br>");
        document.write("Salary: " + this.salary + "<br>");
        document.write("Company: " + company + "<br>");
    }
    let getCompany = function() { // private method
        return company;
    }
}
//Employee(); // normal function call
let emp1 = new Employee(); // function style object creation
emp1.id = 101;
emp1.name = "John Doe";
emp1.salary = 75000;
document.write("id is is "+emp1.id+"Company "+emp1.company)
emp1.displayEmployeenInfo();
//emp1.getEmployee();           // Error: getEmployee is not accessible
let emp2 = new Employee();
emp2.id = 102;
emp2.name = "Jane Smith";
emp2.salary = 80000;
emp2.displayEmployeenInfo();
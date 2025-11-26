class Employee {

    id=0
    name=""
    salary=0.0;

    displayEmployeeInfo() {
        document.write("<br/>Employee class method or function <br/>")
        document.write("<br/>id is "+this.id)
        document.write("<br/>name is "+this.name)
        document.write("<br/>salary is "+this.salary)
    }
}

let emp1 = new Employee();
emp1.id=100;
emp1.name="Raj"
emp1.salary= 12000;
emp1.displayEmployeeInfo();

let emp2 = new Employee();
emp2.id=101;
emp2.name="Raju"
emp2.salary= 15000;
emp2.displayEmployeeInfo();
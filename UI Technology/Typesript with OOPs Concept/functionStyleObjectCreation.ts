function Employee() {
    this.id = 100;
    this.name = "Ravi";
    this.age = 21;
    this.displayEmployeeInfo = function() {
        console.log("id is "+this.id)
        console.log("name is "+this.name)
        console.log("age is "+this.age)
    }
}

let emp1 = new Employee();
emp1.displayEmployeeInfo();
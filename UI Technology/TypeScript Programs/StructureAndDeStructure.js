// structure the data in array of same type or different type 
var num = [10, 20, 30, 40, 50]; // literal style 
var names = ["Ravi", "Raj", "Ramesh", "Lokesh"];
var num1 = [100, 200, 300, 400, 500]; // generic style 
var empInfo = [100, "Ravi", 12000, true];
var n1 = num[0];
var n2 = num[1];
var n3 = num[2];
var n4 = num[3];
var n5 = num[4];
var n11 = num[0], n22 = num[1], n33 = num[2], n44 = num[3], n55 = num[4]; // array de-structure 
console.log(n1 + " " + n11);
console.log(n5 + " " + n55);
var id = empInfo[0], fname = empInfo[1], salary = empInfo[2], result = empInfo[3];
console.log(id + " " + fname + " " + salary + " " + result);
var id1 = empInfo[0], fname1 = empInfo[1], result1 = empInfo[3];
console.log(id1 + " " + fname1 + " " + result1);
console.log("------------------------------------");
var emp = { eid: 100, ename: "Ravi", eage: 21, eresult: true }; // structure 
var eid = emp.eid, ename = emp.ename, eage = emp.eage, eresult = emp.eresult;
console.log(eid, ename, eage, eresult);
function employeeDetails(employee) {
    console.log(employee.ename + " " + employee.eage);
}
employeeDetails(emp);
function employeeDestructure(_a) {
    var ename = _a.ename, eage = _a.eage;
    console.log(ename + " " + eage);
}
employeeDestructure(emp);

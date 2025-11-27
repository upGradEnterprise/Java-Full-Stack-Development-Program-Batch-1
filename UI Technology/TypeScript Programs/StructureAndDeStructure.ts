// structure the data in array of same type or different type 
let num:number[]=[10,20,30,40,50];      // literal style 
let names:string[]=["Ravi","Raj","Ramesh","Lokesh"];
let num1:Array<number>=[100,200,300,400,500]    // generic style 
let empInfo:any[]=[100,"Ravi",12000,true];
let n1=num[0];
let n2=num[1];
let n3=num[2];
let n4=num[3];
let n5=num[4];

let [n11,n22,n33,n44,n55]=num;  // array de-structure 
console.log(n1+" "+n11)
console.log(n5+" "+n55)
let [id,fname,salary,result]=empInfo;
console.log(id+" "+fname+" "+salary+" "+result)
let [id1,fname1,,result1]=empInfo;
console.log(id1+" "+fname1+" "+result1)
console.log("------------------------------------")
let emp = {eid:100,ename:"Ravi",eage:21,eresult:true}    // structure 
let {eid,ename,eage,eresult}=emp;
console.log(eid,ename,eage,eresult)

function employeeDetails(employee:any){
    console.log(employee.ename+" "+employee.eage)
}
employeeDetails(emp)
console.log("---------------------------")
function employeeDestructure({ename,eage}:any){
    console.log(ename+" "+eage)
}
employeeDestructure(emp)



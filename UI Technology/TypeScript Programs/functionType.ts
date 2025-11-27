// // function without passing any parameter as well as no return type 
// function greeting() {
//     console.log("simple typescript function")
// }
// greeting();

// // function with number of parameter as well their data types as any but number of parameter must be match 
// function add(a:any,b:any){
//     console.log(a+b)
// }
// add(10,20);
// add(10.10,20.20)
// add("A","B")
// // function with specific data types 
// function addNumber(a:number,b:number){
//     console.log(a+b)
// }
// addNumber(100,200)
// addNumber(100.10,200.20);
// //addNumber("A","B")

// // function with no return type ie any type consider. 
// // function dis1() {
// //     //return 100;
// //     //return "Ravi"
// //     return true
// // }  
// // this function can return any value as well as no return it by default consider 
// function dis1() : any {

// }
// // no return type then write void. 
// function dis2() : void {
    
// }
// // function with return type ie string ,number, boolean, etc 
// function sayHello(name:string):string {
//     return "Welcome to TypeScript "+name
// }


// // function with optional parameter 
// function empInfo(id?:number,name?:string,age?:number): void {
//     console.log("id is "+id+" name is "+name+" age is "+age)
// }
// empInfo(100,"Raj",21);
// empInfo(101,"Ramesh")
// empInfo(102)
// empInfo();

// function with default initialization 
// function empInfo(id:number=0,name:string="Unknown",age:number=0.0): void {
//     console.log("id is "+id+" name is "+name+" age is "+age)
// }
// empInfo(100,"Raj",21);
// empInfo(101,"Ramesh")
// empInfo(102)
// empInfo();
// function with array parameter 

// function empInfo(id:number,name:string,age:number,skillSet:string[]):void {
//     console.log("id is "+id+" name is "+name+" Age is "+age+" skillSet "+skillSet)
// }
// empInfo(1,"Ravi",21,[]);
// empInfo(2,"Ramesh",24,["Java","Python"]);
// empInfo(3,"Raju",26,["HTML"])


// function with rest operator 
// function empInfo(id:number,name:string,age:number,...skillSet:string[]):void {
//     console.log("id is "+id+" name is "+name+" Age is "+age)
//     console.log("Number of skillSet "+skillSet.length)
//     for(let skill of skillSet){
//         console.log(skill)
//     }
// }
// let skillInfo:string[]=["HTML","CSS","JavaScript","TypeScript","Angular"];

// empInfo(1,"Ravi",21);   // 0 parameter 
// empInfo(2,"Ramesh",23,"C")  // 1 
// empInfo(3,"Lokesh",24,"Java","Python","React JS")  // many 
// empInfo(4,"Ajay",28,skillInfo[0],skillInfo[1],skillInfo[2],skillInfo[3],skillInfo[4]);
// empInfo(5,"Mahesh",29,...skillInfo);    // using spread we can array value individually 





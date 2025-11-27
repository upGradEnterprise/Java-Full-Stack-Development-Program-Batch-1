// function without passing any parameter as well as no return type 
function greeting() {
    console.log("simple typescript function")
}
greeting();

// function with number of parameter as well their data types as any but number of parameter must be match 
function add(a:any,b:any){
    console.log(a+b)
}
add(10,20);
add(10.10,20.20)
add("A","B")
// function with specific data types 
function addNumber(a:number,b:number){
    console.log(a+b)
}
addNumber(100,200)
addNumber(100.10,200.20);
//addNumber("A","B")

// function with no return type ie any type consider. 
// function dis1() {
//     //return 100;
//     //return "Ravi"
//     return true
// }  
// this function can return any value as well as no return it by default consider 
function dis1() : any {

}
// no return type then write void. 
function dis2() : void {
    
}
// function with return type ie string ,number, boolean, etc 
function sayHello(name:string):string {
    return "Welcome to TypeScript "+name
}




// // // normal function style 
// // // function no passing parameter and no return type 
// // function greet() {
// //     document.write("Hello User!<br>");
// // }
// // greet(); // function call

// // // function with passing parameter and no return type
// // function add(a,b){
// //     var sum = a+b;
// //     document.write("<br/>Sum is: " + sum + "<br>");
// // }
// // add(5,10); // function call with arguments
// // add(100)
// // add()
// // add("A","B")

// // // function with pasing parameter and return type
// // function checkLogin(emailId,password){
// //     return emailId=="admin@gmail.com" && password=="admin123"?"successfully login":false;
// // }
// // document.writeln("<br/>" + checkLogin("admin@gmail.com","admin123"));
// // document.writeln("<br/>" + checkLogin("admin@gamil.com","admin1234"));

// // Normal function 
// display1(); // JavaScript hosting concept
// function display1() {
//     document.write("<br/>Normal Function Called<br/>");
// }
// display1();

// // Expression style function  ES5 
// //display3();// Error: display3 is not a function, it does't support hosting
// var display3 = function() {
//     document.write("<br/>Expression Function Called<br/>");
// }
// display3();

// // arrow function style ES6 

// let display4 = ()=>document.write("<br/>Arrow Function Called<br/>");
// display4();

// // addition of two number using expression style function

// let addNumber1 = function(a,b){
//     var sum =a+b;
//     return sum;
// }
// document.write("<br/>Addition is using expression style: " + addNumber1(20,30) + "<br/>") ;
// let findLargest1 = function(a,b){
//     if(a>b){
//         return "1st number is largest";
//     }else {
//         return "2nd number is largest";
//     }
// }
// document.write("using expression style " + findLargest1(100,50) + "<br/>") ;
// // addition of two number using arrow function style
// let addNumber2 = (a,b)=>a+b;
// document.write("<br/>Addition is using arrow style: " + addNumber2(20,30) + "<br/>") ;
// let findLargest2 = (a,b)=>{
//     if(a>b){
//         return "1st number is largest";
//     }else {
//         return "2nd number is largest";
//     }
// }
// document.write("using arrow style " + findLargest2(100,50) + "<br/>") ;

// callback function example

function greeting(fname,callback){
    return "Welcome "+callback(fname);
}
let maleInfo = function(fname){
    return "Mr. " + fname;
}
let femaleInfo = (fname)=>"Miss. "+ fname;

document.writeln("<br/> "+greeting("Raj", maleInfo));
document.writeln("<br/> "+greeting("Priya", femaleInfo));
document.write("<br/> "+greeting("John", function(fname){
    return "Mr. " + fname;
}));
document.write("<br/> "+greeting("Sara", (fname)=>"Miss. "+ fname));
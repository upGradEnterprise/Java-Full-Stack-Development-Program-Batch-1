// // normal function style 
// // function no passing parameter and no return type 
// function greet() {
//     document.write("Hello User!<br>");
// }
// greet(); // function call

// // function with passing parameter and no return type
// function add(a,b){
//     var sum = a+b;
//     document.write("<br/>Sum is: " + sum + "<br>");
// }
// add(5,10); // function call with arguments
// add(100)
// add()
// add("A","B")

// // function with pasing parameter and return type
// function checkLogin(emailId,password){
//     return emailId=="admin@gmail.com" && password=="admin123"?"successfully login":false;
// }
// document.writeln("<br/>" + checkLogin("admin@gmail.com","admin123"));
// document.writeln("<br/>" + checkLogin("admin@gamil.com","admin1234"));

// Normal function 
display1(); // JavaScript hosting concept
function display1() {
    document.write("<br/>Normal Function Called<br/>");
}
display1();

// Expression style function 
//display3();// Error: display3 is not a function, it does't support hosting
var display3 = function() {
    document.write("<br/>Expression Function Called<br/>");
}
display3();
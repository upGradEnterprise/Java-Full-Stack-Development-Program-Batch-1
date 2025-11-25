var a=10;
    a=20;
var a=30;
document.write("Value of a: "+a+"<br>");
let b=10
    b=20;
//let b=30; // Error: Identifier 'b' has already been declared
document.write("Value of b: "+b+"<br>");
const c=100;
document.write("Value of c: "+c+"<br>");
//c=200; // Error: Assignment to constant variable.

for(var i=0;i<1000;i++){

}
document.write("Value of i using var: "+i+"<br>");
for(let j=0;j<1000;j++){

}
//document.write("Value of j using let: "+j+"<br>"); // Error: j is not defined
function testVar(){
    var d=100;
    document.write("Value of a inside function using var: "+d+"<br>");
}
testVar();
document.write("Value of a outside function using var: "+d+"<br>");
let num1=[];        // Empty array with literal syntax
let num2=new Array(); // Empty array with Array constructor or creating memory using new keyword
let num3=[10,20,30,40,50]; // Array with initial values
let num4 = new Array(10,20,30,50);
document.write("<h3>Array Elements</h3>");
document.write(num1+"<br>");        // empty array 
document.write(num3+"<br>");        // array element in string format separated by comma
document.write(num3.join("-")+"<br>");
document.write(num3[0]+"<br>");
document.write(num3[1]+"<br>");
document.write("Size of array "+num1.length+"<br>");
document.write("Size of array "+num3.length+"<br>");
num1.push(100);  // adding element at the end of the array
num1.push(200);
num1.push(300);
num1.unshift(400); // adding element at the beginning of the array
num1.unshift(500);
document.write("All elements from array "+num1+"<br>");        // array element in string format separated by comma
num1.pop();   // removes last element from the array
num1.shift(); // removes first element from the array
document.write("All elements from array "+num1+"<br>");        // array element in string format separated by comma

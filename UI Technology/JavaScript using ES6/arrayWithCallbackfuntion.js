let num = [1,2,3,4,5,6,7,8,9,10];
document.write("Array callback function example:<br>");
// add element in between as well remove element from array 
// 1st parameter index position
// 2nd parameter number of elements to be removed
// 3rd, 4th, ....to add the elements
// document.write("Original array: " + num + "<br>");
// //num.splice(3,1);        // remove 3 index position element 
// //num.splice(3,4);        // from 4th index position remove 4 elements
// num.splice(3,0,100);    // at 3rd index position add 100 without removing any element
// //num.splice(3,0,100,200,300,400);    // at 3rd index position add 100 without removing any element
// num.splice(3,4,100,200,300,400);    // at 3rd index position add replace with old value as 100,200,300,400
// document.write("<br/>Modified array: " + num + "<br>");
//  document.write("Original array: " + num + "<br>");
//     num1 = num; // copy all values as well as reference
// document.write("Copied array: " + num1 + "<br>");
// num.push(11); // modify original array
// document.write("Original array: " + num + "<br>");
// document.write("Copied array: " + num1 + "<br>");
//     num2 = num.slice(); // copy all values only not reference
// document.write("Copied array using slice(): " + num2 + "<br>");
// num.push(12); // modify original array
// document.write("Original array: " + num + "<br>");
// document.write("Copied array using slice(): " + num2 + "<br>");

document.write("Original array: " + num + "<br>");
let modifiedArray = num.map(v=>v+100);
document.write("Modified array: " + modifiedArray + "<br>");
document.write("Original array: " + num + "<br>");
let evenFilterArray = num.filter(v=>v%2==0);
document.write("Even array : " + evenFilterArray + "<br>");
let oddFilterArray = num.filter(v=>v%2!=0);
document.write("Even array : " + oddFilterArray + "<br>");
let searchElementIndex = num.findIndex(v=>v==7);
if(searchElementIndex!=-1){
    document.write("Element found at index : " + searchElementIndex + "<br>");
}else {
    document.write("Element not found in the array<br>");
}
let searchElement = num.find(v=>v==5);
if(searchElement!=undefined){
    document.write("Element found ");
}else {
    document.write("Element not found in the array<br>");
}
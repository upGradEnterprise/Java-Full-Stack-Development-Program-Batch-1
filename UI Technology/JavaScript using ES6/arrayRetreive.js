let names = ["Raj","Ravi","Ajay","Vikash","mahesh","lokesh"];
document.write("Retrieve array using for loop<br/>")
for(let i=0;i<names.length;i++){
    document.write(names[i]+"<br/>");
}
document.write("Retrieve array using in loop<br/>")
for(let index in names){
    document.write(names[index]+"="+"index value is: "+index+"<br/>");
}

document.write("Retrieve array using of loop<br/>")
for(let value of names){
    document.write(value+"<br/>");
}
document.write("Retrieve array using for each function<br/>")
names.forEach(v=>document.write(v+"<br/>"));

document.write("Retrieve array using for each function with map concept<br/>")
names.map(v=>v.toUpperCase()).forEach(v=>document.write(v+"<br/>"));
document.write("Retrieve array using for each function with filter concept<br/>")
names.filter(v=>v.startsWith("R")).forEach(v=>document.write(v+"<br/>"));

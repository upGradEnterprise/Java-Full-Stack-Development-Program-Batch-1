let emp1 = {id:100,name:"Raj",age:21,result:true,skillSet:["HTML","CSS","JS"],
    address:{city:"Bangalore",state:"Karnataka",pincode:560068},
prodjects:[
    {pId:101,pName:"Banking"},
    {pId:102,pName:"E-commerce"},
    {pId:103,pName:"Insurance"},
],displayEmp:function(){
    alert("Id is : "+this.id+" Name is : "+this.name)
}};
document.write("<h3>Employee 1 details</h3>")
document.write(" id is : "+emp1.id+"<br>")
document.write(" name is : "+emp1.name+"<br>")
document.write(" age is : "+emp1.age+"<br>")
document.write(" result is : "+emp1.result+"<br>")
document.write(" skillSet is : "+emp1.skillSet+"<br>")
document.write(" skillSet is : "+emp1.skillSet[0]+"<br>")
emp1.skillSet.forEach(ss=>document.write(ss+" <br/>"))
document.write(" city is : "+emp1.address.city+"<br>")
document.write(" state is : "+emp1.address.state+"<br>")
document.write(" Pin code is : "+emp1.address.pincode+"<br>")
document.write("PName is : "+emp1.prodjects[0].pName+"<br>")
emp1.prodjects.forEach(pj=>document.write("Pid is "+pj.pId+" PName is : "+pj.pName+"<br>"))
emp1.displayEmp();
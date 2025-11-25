// normal function style 
// function no passing parameter and no return type 
function greet() {
    document.write("Hello User!<br>");
}
greet(); // function call

// function with passing parameter and no return type
function add(a,b){
    var sum = a+b;
    document.write("<br/>Sum is: " + sum + "<br>");
}
add(5,10); // function call with arguments
add(100)
add()
add("A","B")

// function with pasing parameter and return type
function checkLogin(emailId,password){
    return emailId=="admin@gmail.com" && password=="admin123"?"successfully login":false;
}
document.writeln("<br/>" + checkLogin("admin@gmail.com","admin123"));
document.writeln("<br/>" + checkLogin("admin@gamil.com","admin1234"));
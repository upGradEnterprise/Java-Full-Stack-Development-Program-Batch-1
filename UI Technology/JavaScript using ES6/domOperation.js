function domOperation() {
    //alert("DOM Operation Executed");
    // get the value of text field using name attribute 
    // var fname = document.getElementsByName("name")[0].value;
    // var lname = document.getElementsByName("name")[1].value;
    // // console.log("First Name: " + fname);
    // // console.log("Last Name: " + lname);
    // document.getElementsByName("fullname")[0].value = fname + " " + lname;
    // document.getElementsByName("name")[0].value=""
    // document.getElementsByName("name")[1].value=""


    // get the value of text field using id attribute
    var fname = document.getElementById("fname").value;
    var lname = document.getElementById("lname").value;
    // console.log("First Name: " + fname);
    // console.log("Last Name: " + lname);
        document.getElementById("fullname").value= fname + " " + lname;
    document.getElementById("fname").value=""
    document.getElementById("lname").value=""
        document.getElementById("output").innerText = fname + " " + lname;
    // accessing the value of non editable tags like h1, p, div etc 
    var h1TagValue = document.getElementsByTagName("h1")[0].innerText;
    console.log("H1 Tag Value: " + h1TagValue);

}
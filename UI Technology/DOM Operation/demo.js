function addData() {
let buttonRef = document.getElementById("btn")
buttonRef.addEventListener("click",()=> {
    //alert("Button Clicked")
    let name = document.getElementById("name").value
    let age = document.getElementById("age").value
    let pTag = document.createElement("p")  // <p></p>
    // let pPTagContents = document.createTextNode("This is new paragraph added by JS") // Text Node
    let pPTagContents = document.createTextNode("Name is "+name+" Age is "+age) // Text Node
    pTag.appendChild(pPTagContents)  // <p>This is new paragraph added by JS</p>
    if(age>=25){
         pTag.setAttribute("class","abc") // Adding class attribute to p tag
    }else{
         pTag.setAttribute("class","xyz") // Adding class attribute to p tag
    }
   
    document.body.appendChild(pTag)  // Adding p tag to body
    document.getElementById("name").value=""
    document.getElementById("age").value=""

})

}


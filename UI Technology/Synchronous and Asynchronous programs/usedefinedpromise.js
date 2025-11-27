// ES5 style 
var obj = new Promise(function(resolve,rejected){
    //resolve("Work done successfully")
    rejected("rejected with some error ")

})

// to handle the promise data
// if promise resolve then get call automatically to get the data
// if promise rejected catch get called. finally call mandatory may 
// promise resolved or rejected. then, catch and finally takes callback   
obj.then(data=>console.log("then : "+data)).catch(error=>console.log("catch :"+error)).finally(()=>console.log("finally block"))
console.log("Normal Statement1");
console.log("Normal Statement2");
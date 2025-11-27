let obj;
function fun() {
    obj = setInterval(doTask,1000)
}
let i=0;
function doTask() {
    //document.write("Hi")    // it load whole dom 
    let dd = new Date();
    document.getElementById("output").innerHTML=i+" "+dd.getHours()+":"+dd.getMinutes()+":"+dd.getSeconds()

    if(i%2==0){
            document.getElementsByTagName("h2")[0].style.color="red"
            document.body.style.backgroundColor="orange"
    }else {
            document.getElementsByTagName("h2")[0].style.color="green"
            document.body.style.backgroundColor="yellow"
    }
    i++;
}
function stop() {
    clearInterval(obj);
}
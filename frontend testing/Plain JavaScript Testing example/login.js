function signIn(emailid,password){
    if(emailid=="admin@gmail.com" && password=="123"){
        return "success"
    }else {
        return "failure"
    }
}
module.exports={signIn}
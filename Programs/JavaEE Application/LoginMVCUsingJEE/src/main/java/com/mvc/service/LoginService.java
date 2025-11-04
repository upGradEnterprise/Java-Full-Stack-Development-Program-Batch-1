package com.mvc.service;

import com.mvc.bean.Login;
import com.mvc.dao.LoginDao;

public class LoginService {
    LoginDao ld = new LoginDao();

    public String signUp(Login login){
        StringBuffer sb = new StringBuffer(login.getPassword());
        String reversePassword= sb.reverse().toString();
        login.setPassword(reversePassword);

        if(ld.signUp(login)>0){
            return "Account created successfully";
        }else {
            return "Account creation failed";
        }
    }

    public String signIn(Login login){
        StringBuffer sb = new StringBuffer(login.getPassword());
        String reversePassword= sb.reverse().toString();
        login.setPassword(reversePassword);

        if(ld.signIn(login)){
            return "Successfully logged in";
        }else {
            return "Failure try once again!";
        }
    }
}

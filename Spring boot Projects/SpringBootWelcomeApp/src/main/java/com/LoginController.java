package com;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @RequestMapping(value = "checkLoginDetails",method = RequestMethod.POST)
    public String checkLoginDetails(HttpServletRequest request) {  // DI for Request object
        String emailId = request.getParameter("emailId");
        String password = request.getParameter("password");
        if(emailId.equals("admin@gmail.com") && password.equals("admin123")) {
            return "success";
        }else {
            return "failure";
        }

    }
}

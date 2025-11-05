package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public ModelAndView sayHello() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("display1.jsp");
        return mv;
    }

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public ModelAndView sayHi() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("display2.jsp");
        return mv;
    }

    @RequestMapping(value = "signIn",method = RequestMethod.POST)
    public ModelAndView checkLoginDetails(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        String emailId = request.getParameter("emailId");
        String password = request.getParameter("password");
        if(emailId.equals("admin@gmail.com") && password.equals("admin@123")){
            mv.addObject("user","admin");
            mv.setViewName("success.jsp");
        }else {
            mv.setViewName("failure.jsp");
        }
        return mv;
    }
}

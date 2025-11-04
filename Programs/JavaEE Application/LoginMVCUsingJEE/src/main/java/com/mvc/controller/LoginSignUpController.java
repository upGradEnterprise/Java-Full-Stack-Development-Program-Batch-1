package com.mvc.controller;

import com.mvc.bean.Login;
import com.mvc.service.LoginService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/LoginSignUpController")
public class LoginSignUpController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        Login ll =  new Login();
        String emailid = req.getParameter("emailid");
        String password = req.getParameter("password");
        ll.setEmailid(emailid);
        ll.setPassword(password);

        LoginService ls =  new LoginService();
        String result = ls.signUp(ll);

        pw.print(result);
        RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
        resp.setContentType("text/html");
        rd.include(req, resp);
    }
}

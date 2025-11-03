package com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        String emailId = req.getParameter("emailId");
        String password = req.getParameter("password");
        if(emailId.equals("admin@gmail.com") && password.equals("admin@123")){
            pw.println("<html><body><h1>Successfully login by Admin</h1></body></html>");
        }else {
            pw.println("<html><body><h1>Failure try once again</h1></body></html>");
        }
    }
}

package com;

import javax.servlet.RequestDispatcher;
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
        RequestDispatcher rd1 = req.getRequestDispatcher("index.html"); // html page
        RequestDispatcher rd2 = req.getRequestDispatcher("Home");       //servlet page
        String emailId = req.getParameter("emailId");
        String password = req.getParameter("password");
        if(emailId.equals("admin@gmail.com") && password.equals("admin@123")){
            pw.println("<html><body><h1>Successfully login by Admin with Get method</h1></body></html>");
            rd2.forward(req, resp);
        }else {
            pw.println("<html><body><h1>Failure try once again with Get method</h1></body></html>");
            rd1.include(req, resp);
        }
        resp.setContentType("text/html");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        String emailId = req.getParameter("emailId");
        String password = req.getParameter("password");
        RequestDispatcher rd1 = req.getRequestDispatcher("index.html"); // html page
        RequestDispatcher rd2 = req.getRequestDispatcher("Home");       //servlet page

        if(emailId.equals("admin@gmail.com") && password.equals("admin@123")){
            pw.println("<html><body><h1>Successfully login by Admin with Post method</h1></body></html>");
            rd2.forward(req, resp);
        }else {
            pw.println("<html><body><h1>Failure try once again with Post method</h1></body></html>");
            rd1.include(req, resp);
        }
        resp.setContentType("text/html");
    }
}

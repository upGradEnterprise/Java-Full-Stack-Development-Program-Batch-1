package com.mvc.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/Home")
public class Home extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String emailid = req.getParameter("emailid");
        out.println("<h2>Welcome to Home Page "+emailid+"</h2>");
        out.println("<a href='login.jsp'>Logout</a>");
        resp.setContentType("text/html");
    }
}

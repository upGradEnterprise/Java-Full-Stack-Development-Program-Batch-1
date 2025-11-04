<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 03-11-2025
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!String emailId,password;%>
<%
    emailId = request.getParameter("emailId");
    password = request.getParameter("password");
    RequestDispatcher rd1 = request.getRequestDispatcher("Home.jsp");
    RequestDispatcher rd2 = request.getRequestDispatcher("login.jsp");
    if(emailId.equals("admin@gmail.com") && password.equals("admin@123")){
        out.println("Successfully login");
        rd1.forward(request,response);
    }else {
        out.println("Failure try once again");
        rd2.include(request,response);
    }

%>
</body>
</html>

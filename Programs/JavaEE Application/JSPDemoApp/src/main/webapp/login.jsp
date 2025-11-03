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
<h2>Login Page using Get method</h2>
<form action="checkLogin.jsp" method="get">
    <label>EmailId</label>
    <input type="email" name="emailId"/><br/>
    <label>Password</label>
    <input type="password" name="password"/><br/>
    <input type="submit" value="submit"/>
    <input type="reset" value="reset"/>
</form>
<hr/>
<h2>Login Page using Get method</h2>
<form action="checkLogin.jsp" method="post">
    <label>EmailId</label>
    <input type="email" name="emailId"/><br/>
    <label>Password</label>
    <input type="password" name="password"/><br/>
    <input type="submit" value="submit"/>
    <input type="reset" value="reset"/>
</form>
</body>
</html>

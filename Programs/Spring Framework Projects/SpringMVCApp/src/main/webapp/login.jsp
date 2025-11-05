<%--
  Created by IntelliJ IDEA.
  User: akash
  Date: 05-11-2025
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Spring MVC Login App</h2>
<form method="post" action="signIn">
    <label>EmailId</label>
    <input type="email" name="emailId"><br/>
    <label>Password</label>
    <input type="password" name="password"><br/>
    <input type="submit" value="SignIn">
    <input type="reset" value="reset">
</form>
</body>
</html>

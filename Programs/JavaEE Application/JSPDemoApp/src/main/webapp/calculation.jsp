<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 03-11-2025
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!int a,b,sum;%>
<%
    a=10;
    b=20;
    sum = a+b;
    out.print("Sum of two number is "+sum);
%>
<p>Sum of two number is <%=100+200%></p>
<p><font color="red">Sum of two number is <%=a%> and <%=b%> is <%=sum%></font></p>
</body>
</html>

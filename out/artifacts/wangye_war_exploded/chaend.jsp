<%--
  Created by IntelliJ IDEA.
  User: 刘海波
  Date: 2019/9/19
  Time: 19:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户密码</title>
</head>
<body>


    <a>此用户密码：</a>
    <%=request.getAttribute("message")
%>
    <a href="main.jsp">返回主页</a>




</body>
</html>

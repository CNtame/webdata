<%--
  Created by IntelliJ IDEA.
  User: 刘海波
  Date: 2019/9/18
  Time: 16:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户登录</title>
</head>
<body>
<h3>用户登录</h3>
<form action="AddServlet" method="post">
    <p>用户名<input type="text" name="name"></p>
    <p>性 别<input type="text" name="sex"></p>
    <p>年 龄<input type="text" name="age"></p>
    <p>密 码<input type="text" name="score"></p>
    <input type="submit" value="注册">

</form>

</body>
</html>

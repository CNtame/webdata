<%--
  Created by IntelliJ IDEA.
  User: 刘海波
  Date: 2019/9/18
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=GBK"
         pageEncoding="GBK"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>用户登录</title>
</head>
<body>
<h3>用户登录</h3>
<form action="Deng" method="post">
    <p>用户名<input type="text" name="name"></p>
    <p>密 码<input type="text" name="score"></p>
    <input type="submit" value="登录">

</form>
<%--还没<a href="StuRegister.html">注册</a>？--%>
<form action="zhuc.jsp" method="post">

    <%--<input type="hidden" name="Action" id="Action" value="form1" />--%>
    <%--<button type="button">submit</button>--%>
    <input type="submit" value="注册">

</form>
</body>
</html>



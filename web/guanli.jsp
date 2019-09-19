<%--
  Created by IntelliJ IDEA.
  User: 刘海波
  Date: 2019/9/19
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员</title>
</head>
<body>

<form action="Shanchu" method="post">
    <p>用户名<input type="text" name="name"></p>
    <input type="submit" value="删除此用户资料">
</form>

<form action="Chaxun" method="post">
    <%--<input type="hidden" name="Action" id="Action" value="form1" />--%>
    <%--<button type="button">submit</button>--%>
    <input type="submit" value="查询所有用户资料">
</form>

<form action="ChaOne" method="post">
    <p>用户名<input type="text" name="name"></p>
    <input type="submit" value="查询此用户资料">
</form>



</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: ������
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
    <title>�û���¼</title>
</head>
<body>
<h3>�û���¼</h3>
<form action="Deng" method="post">
    <p>�û���<input type="text" name="name"></p>
    <p>�� ��<input type="text" name="score"></p>
    <input type="submit" value="��¼">

</form>
<%--��û<a href="StuRegister.html">ע��</a>��--%>
<form action="zhuc.jsp" method="post">

    <%--<input type="hidden" name="Action" id="Action" value="form1" />--%>
    <%--<button type="button">submit</button>--%>
    <input type="submit" value="ע��">

</form>
</body>
</html>



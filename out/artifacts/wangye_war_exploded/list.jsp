<%@ page import="entity.Table" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 刘海波
  Date: 2019/9/19
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询结果</title>
</head>
<body>





<div align="center">
    <h1 style="color: black;">用户信息列表</h1>
    <a href="main.jsp">返回主页</a>


    <table class="tb">
        <tr>
            <td>name</td>
            <td>sex</td>
            <td>age</td>
            <td>密码</td>
            <td align="center" colspan="2">操作</td>
        </tr>
    <%List<Table> a=(List<Table>)request.getAttribute("list");
        if(a.size()!=0) {
            for (int i = 0; i < a.size(); i++) {
                pageContext.setAttribute("news", a.get(i));


                //保存到页面pageContext里面方便下面进行EL表达式调用
//    for(Table  s :a)
//    {
//        out.print("name:"+s.name+"sex:"+s.sex+"age:"+s.age);
//    }
    %>




    <%--<c:forEach message="${news}" var="ite">--%>
        <tr>

            <td>${news.name}</td>
            <td>${news.sex}</td>
            <td>${news.age}</td>
            <td>${news.score}</td>
        </tr>
        <%
            }
            }
            %>
    <%--</c:forEach>--%>
</table>
</div>



</body>
</html>

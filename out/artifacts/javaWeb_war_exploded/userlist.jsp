<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <title>所有用户页面</title>
</head>

<body>
<h1>${xiaoxi}</h1>
<table  width="600" border="1" cellpadding="0" >
    <tr>
        <th>ID</th>
        <th>姓名</th>
        <th>性别</th>
        <th>密码</th>
        <th>邮箱</th>
        <th>操作</th>
    </tr>
    <c:forEach var="U" items="${userAll}"  >
        <form action="UpdateUser" method="post">
            <tr>
                <td><input type="text" value="${U.id}" name="id" ></td>
                <td><input type="text" value="${U.username}" name="username"></td>
                <td><input type="text" value="${U.sex}" name="sex"></td>
                <td><input type="text" value="${U.password}" name="password"></td>
                <td><input type="text" value="${U.email}" name="email"></td>
                <td><a href="DeleteUser?id=${U.id}">删除</a>  <input type="submit" value="更新"/></td>
            </tr>
        </form>
    </c:forEach>
</table>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: shitou
  Date: 17/2/4
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@page import="com.wayne.core.PropertyUtils"%>

<%
    String basePath = "http://localhost:8080";
%>

<!DOCTYPE html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta name="renderer" content="webkit" />
    <title>餐厅管理系统@易淘</title>
</head>
<body>
<h2 style=" margin-top: -25px;" >餐厅管理系统@易淘</h2>
<form class="m-t" role="form" action="<%=basePath%>/account/login" method="post">
    <div class="form-group">
        <input type="text" class="form-control" placeholder="用户名"  name="username">
    </div>
    <div class="form-group">
        <input type="password" class="form-control" placeholder="密码" name="password">
    </div>
    <button type="submit" class="btn btn-primary block full-width m-b">登
        录</button>
</form>
</body>
</html>

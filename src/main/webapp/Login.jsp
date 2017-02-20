<%--
  Created by IntelliJ IDEA.
  User: shitou
  Date: 17/2/4
  Time: 12:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="com.wayne.core.PropertyUtils"%>

<%
    String basePath = PropertyUtils.getProperty("java.restaurant.url");
%>
<html>
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
    <!-- 	<div class="form-group">
					<input type="text" name="code" class="form-control" style="width: 100px; float: left;" placeholder="验证码" >
					<img src="<%=basePath%>/account/code?x=Math.random();" id="imgCode"
						height="30px" style="float: left;" onclick="changeCodeImg()"/>
				</div>
				<div class="form-group">
					<label> <input type="checkbox" name="rememberMe" id="rememberMe" value="1" class="i-checks">自动登录
					</label>
				</div> -->
    <button type="submit" class="btn btn-primary block full-width m-b">登
        录</button>
</form>
</body>
</html>

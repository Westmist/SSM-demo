<%@page language="java" contentType="text/html; charset=UTF-8" %>
<!--禁用EL表达式-->
<%@page isELIgnored="false"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
    <title>SpringMVC</title>
</head>
<h2>Hello World!</h2>
<p>请先<a href="${pageContext.request.contextPath}/register">注册</a></p>
<p>已注册用户，请<a href="${pageContext.request.contextPath}/login">登录</a></p>
</html>

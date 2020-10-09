<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>主页</title>
</head>
当前用户：${user.name}
<a href="${pageContext.request.contextPath}/logout">退出登录</a>
</html>

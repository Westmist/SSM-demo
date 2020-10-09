<%@ page contentType="text/html;charset=utf-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>登录</title>
</head>
<form action="${pageContext.request.contextPath}/login" method="post">
    用户名：<input type="text" name="name" id="name">
    密码：<input type="password" name="password" id="password">
    <input type="submit" value="登录">
</form>
${msg}
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>Register</title>
</head>
<form action="${pageContext.request.contextPath}/user/register" method="post">
    用户名：<input type="text" name="user">
    密码：<input type="password" name="password">
    <button type="submit">注册</button>
</form>

</html>

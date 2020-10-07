<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Login</title>
</head>

<form action="${pageContext.request.contextPath}/user/login" method="post">
    用户名：<input name="user" type="text">
    密码：<input name="password" type="password">
    <button type="submit">登录</button>
</form>
<%--获取Controller层中UserController类的login方法中设置的model的值--%>
${messageError}

</html>
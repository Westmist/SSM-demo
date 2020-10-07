<%@ page contentType="text/html; charset=utf-8" language="java" %>
<!-- 关闭忽略EL表达式 -->
<%@ page isELIgnored="false" %>
<html>
<h2>Hello World!</h2>
<%--映射到Controller的IndexController类--%>
<p>请<a href="${pageContext.request.contextPath}/index/login">登录</a></p>
<p>请先<a href="${pageContext.request.contextPath}/index/register">注册</a></p>
</html>

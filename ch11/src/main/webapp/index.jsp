<%@ page contentType="text/html;charset=utf-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>JSON数据交换</title>
</head>
<!-- 引入JQuery -->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
<!-- 发送Ajax请求 -->
<script type="text/javascript">
    // $.noConflict();
    function testAjax() {
        var name = jQuery("#name").val();
        var password = jQuery("#password").val();
        var age = jQuery("#age").val();
        console.log(name);
        $.ajax({
                url: "${pageContext.request.contextPath}/test/testJson",
                method: "post",
                data: JSON.stringify({"name":name,"password":password,"age":age}),
                contentType: "application/json;charset=utf-8",
                dataType: "json",
                // 成功响应的结果
                success: function (data) {
                    if (data != null){
                        alert("输入的用户名："+data.name+"\n密码："+data.password+"\n年龄："+data.age);
                    }
                },
                error:function (result) {
                    alert("未知错误",result);
                }
            }
        );
    }
</script>
<form action="${pageContext.request.contextPath}/demo/login">
    用户名：<input type="text" name="name" id="name">
    密码：<input type="password" name="password" id="password">
    年龄：<input type="text" name="age" id="age">
    <input type="button" value="提交" onclick="testAjax()">
</form>

</html>

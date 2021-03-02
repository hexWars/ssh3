<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 13224
  Date: 2021/2/25
  Time: 19:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>登陆</title>
</head>
<body>

<%--下面的login.action中的login,表示struts.xml里的action也叫login--%>
<s:form action="login" method="POST" enctype = "multipart/form-data">
    <%--    下面的name和LoginAction中的字段保持一致--%>
    <s:textfield name="user" label="用户名"/>
    <s:password name="user" label="密码"/>
    <s:submit value="登陆"></s:submit>
<%--    <s:input type="submit" value="登陆"/>--%>
</s:form>

</body>
</html>





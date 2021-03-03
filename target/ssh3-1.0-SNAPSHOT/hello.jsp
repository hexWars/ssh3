<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 13224
  Date: 2021/2/25
  Time: 19:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hello</title>
</head>
<body>
<%--<h1>你好, ${username}</h1>--%>
<h1>你好, <s:property value="user.username"/></h1>
</body>
</html>




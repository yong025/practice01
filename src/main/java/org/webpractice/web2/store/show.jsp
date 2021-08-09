<%@ page import="com.example.service.StroeService" %><%--
  Created by IntelliJ IDEA.
  User: repar
  Date: 2021-08-06
  Time: 오후 3:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String area=request.getParameter("area");
%>
<h1><%=StroeService.StoreService.INSTANCE.getDtoList(area) %></h1>
</body>
</html>

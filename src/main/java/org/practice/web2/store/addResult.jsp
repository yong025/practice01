<%@ page import="com.example.dto.StoreDTO" %>
<%@ page import="com.example.service.StroeService" %><%--
  Created by IntelliJ IDEA.
  User: repar
  Date: 2021-08-06
  Time: 오후 4:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setCharacterEncoding("UTF-8");//read한다. 문자열을 UTF-8로 바꿀 수 있도록
    String name = request.getParameter("name");
    String area = request.getParameter("area");
    String desc = request.getParameter("desc");
    String link = request.getParameter("link");

    StoreDTO dto= StoreDTO.builder()
            .name(name)
            .area(area)
            .desc(desc)
            .link(link)
            .build();

    StroeService.StoreService.INSTANCE.add(dto);//식당 추가

    response.sendRedirect("show.jsp"); //addResult 페이지로 접근하면 show.jsp로 워프 할 수 있도록 한다.
%>
<!--
<html>
<head>
<title>Title</title>
</head>
<body>

<h1><a href="show.jsp"> 목록 </a></h1>

<h2><%= name%></h2>
<h2><%= area%></h2>
<h2><%= desc%></h2>
<h2><%= link%></h2>
</body>
</html>
-->

<%--
  Created by IntelliJ IDEA.
  User: stell
  Date: 2021-08-05
  Time: 오후 5:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    //여기에 자바코드 집어넣음.
    //request - in - read
    //response - out - write
    String heightstr = request.getParameter("height");
    String weightstr = request.getParameter("weight");

%>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1><%= heightstr%></h1>
    <h1><%= weightstr%></h1>

    <a href="bmiinput.jsp">다시 시도</a>

</body>
</html>

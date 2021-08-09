<%--
  Created by IntelliJ IDEA.
  User: stell
  Date: 2021-08-05
  Time: 오후 5:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    int num1 = Integer.parseInt(request.getParameter("num1"));
    int num2 = Integer.parseInt(request.getParameter("num2"));
    String op = request.getParameter("operator");//계산만 실행
    int result = 0;//결과만 보여줌

    if(op.equals("+")){
        result = num1 + num2;
    }else if(op.equals("-")){
        result = num1 - num2;
    }else if(op.equals("*")){
        result = num1 * num2;
    }else if(op.equals("/")){
        result = num1 / num2;
    }

%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>결과</h1>

<h2><%=num1%><%=op%><%=num2%></h2>

<h2>결과: <%= result %></h2>


</body>
</html>

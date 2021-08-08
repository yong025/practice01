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
    <title>ADD</title>
</head>
<body>

<h1>ADD</h1>
<form action="addResult.jsp" method="post">
    <div>
        <input type="text" name="name" value="맛집">
    </div>
    <div>
        <input type="text" name="area" value="종각">
    </div>
    <div>
        <input type="text" name="desc" value="설명">
    </div>
    <div>
        <input type="text" name="link">
    </div>
    <div>
        <button type="reset">Reset</button>
        <button type="submit">Submit</button>
    </div>

</form>
</body>
</html>
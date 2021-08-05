<%--
  Created by IntelliJ IDEA.
  User: stell
  Date: 2021-08-05
  Time: 오후 5:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="calcResult.jsp" method="post">

   숫자1: <input name="num1"> <br>
   숫자2: <input name="num2"> <br>
    <div>연산 입력</div>
    <select name="operator">
        <option value="+"> + </option>
        <option value="-"> - </option>
        <option value="*"> * </option>
        <option value="/"> / </option>
    </select>
    <button>연산 시작</button>

</form>

</body>
</html>

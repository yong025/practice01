<%--
  Created by IntelliJ IDEA.
  User: stell
  Date: 2021-08-05
  Time: 오후 5:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="bmiResult.jsp" method="post"> <!--입력지 개념--> <!--get 조회 / post 처리-->

    <input name="height">
    <input name="weight">
    <button>확인</button>
    <!--form태그안에 있는 버튼은 기본적으로 서블릿 / 기본적으로 전송-->

</form>
</body>
</html>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<!-- %는 자바언어를 웹페이지에서 사용할 수 있도록 해주는 도구  -->
<% String name = "짱짱";  %>
<!-- %로 정의 -->
<h1> Hello <%= name %></h1><!-- %= 으로 정의된 것을 사용 -->
<br/>
<a href="hello_servlet">Hello Servlet</a>
<a href="hello_servlet">Hello1</a>
</body>
</html>
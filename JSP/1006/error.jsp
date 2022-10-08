<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exception Test error.jsp</title>
</head>
<body>

<%@ page isErrorPage="true" %>
<h1> 예외처리 페이지 </h1>
<hr size="5" color="red">

오류 문자열 [exception.toString ()]: <%=exception.toString() %><br>
오류 메시지 [exception.getMessage()]:<%=exception.getMessage() %><br>
<img src="../images/overflow.png">
</body>
</html>
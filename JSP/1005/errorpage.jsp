<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp test errorpage Test</title>
</head>
<body>
<%@ page errorPage="exception.jsp" %>

<%
	String[] str={"감사합니다.","Thank you"};
%>

한국어로 [<%=str[0] %>]는 <br>
영어로 [<%=str[2] %> %>] 입니다.
</body>
</html>
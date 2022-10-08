<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Test Scriptlet Test</title>
</head>
<body>
<% int i = 24; %>

<%
	out.print("하루는 : " + i + "시간이며, <br>");
	out.print("하루는 : " + i *60 + "분 입니다.<br>");
	out.print("하루는 : " + i*60*60 + "초입니다. <br>");
%>
</body>
</html>
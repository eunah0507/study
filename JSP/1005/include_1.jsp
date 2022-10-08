<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP TEST INCLUDE test</title>
</head>
<body>
<%@ include	file="header.jsp" %>
<hr size="5" color="red">
<p>

include 지시자 : &lt;%@ include file="file_name"%&gt; <p>

<hr size="5" color="green">
<p>

<%@ include file="footer.html" %>
</body>
</html>
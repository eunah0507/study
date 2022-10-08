<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp Test IMPORT TEST</title>
</head>
<body>
<h2> page 지시자 import 속성</h2>
<%--import 속성은 java의 import 문장을 대체하는 속성 --%>

<% Date abc = new Date(); %>

현재 시각1 : <%= new Date().toLocaleString() %><br>
현재 시각2 : <%= abc.toString() %><br>
현재 시각3 : <%= new Date() %>
</body>
</html>
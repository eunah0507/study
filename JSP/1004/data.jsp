<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Test Date</title>
</head>
<body>
<% Date today = new Date() ; %>

<% out.print("현재 시간은 [" + today + "] 입니다."); %>
</body>
</html>
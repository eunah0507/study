<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Test Expression Test</title>
</head>
<body>
<% int year = 365; %>

<% out.println("1 년은 약 몇 주 일까요? " ); %>
<% out.println(year /7); %>
<% out.println("주 입니다."); %>
<br>
<hr size="5" color="green">

<%= year/7 %> <br>
<%= "주 입니다." %> 

</body>
</html>
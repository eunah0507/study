<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Test Error Test</title>
</head>
<body>
<% String [] str = {"감사합니다!", "Thank you!"}; %>

한국어로 [<%= str[0] %>]는 <br>
영어로 [<%= str[1] %>]입니다.
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Test member variable</title>
</head>
<body>
<% int i = 0;%>

[지역변수] i = <%= ++i %>

<p>

<%! int member = 0; %>
[멤버 변수] member = <%= ++member %>

</body>
</html>
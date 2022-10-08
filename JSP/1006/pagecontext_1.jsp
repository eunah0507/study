<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>pageContext Test</title>
</head>
<body>

<h2> pageContext Test </h2>

<% pageContext.getOut().println("include_1.html"); %>
<%-- <% out.println("include_1.html");%> --%> 

<hr size="5" color="red">

<% pageContext.include("include_1.html"); %>

</body>
</html>
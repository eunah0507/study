<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Test Declaration Test</title>
</head>
<body>

<%! double radius = 4.8; %>

<%!
	public double getArea(double r)
	{
		return r * r * 3.14;
	}
%>

<%!
	public double getArea2(double r)
	{
		return 2 * r * 3.14;
	}
%>

반지름이 <%= radius %>인 원의 면적은
<%= getArea(radius) %> 입니다.
<br>
반지름이 <%= radius %>인 원의 둘레는
<%= getArea2(radius) %> 입니다.
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 조회 Test</title>
</head>
<body>
<h1> 쿠키 조회 Test</h1>
<hr size="5" color="green">
<%
Cookie[] cookies = request.getCookies();

if(cookies == null)
{
	out.println("쿠키가 없습니다.");
}
else
{
	for(int i=0; i<cookies.length; i++)
	{
		out.println("쿠키 이름 : " + cookies[i].getName() + ",");
		out.println("쿠키 값 : " + cookies[i].getValue()+"<p>");
	}
}
%>

<hr size="5" color="red">
</body>
</html>
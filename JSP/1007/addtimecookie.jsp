<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>addtimecookie.jsp Test</title>
</head>
<body>
<h1> 현재 시간을 Cookie로 저장</h1>

<hr size="5" color="blue">

	String now = new java.util.Date().toString();<br>
	Cookie cookie = new Cookie("lastConnect",now);<br>
	cookie.setMaxAge(10);<br>
	response.addCookie(cookie);<p>
	
<%
	String now = new java.util.Date().toString();
	Cookie cookie = new  Cookie("lastConnect", now);
	cookie.setMaxAge(10);
	response.addCookie(cookie);
%>

<!-- 원인은 tomcat 8.0 부터 상위 버전은 쿠키 방식을 버리고
	 rfc 표준 값을 갖는다. 표준 값은 쿠키에 "," 스페이스 "/" 같은 특수 문자를 안받는다는 것이다. -->

<hr size="5" color="orange">
<a href="getcookie.jsp">get cookie</a>
</body>
</html>
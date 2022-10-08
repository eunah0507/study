<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 만들기</title>
</head>
<body>
<h1>쿠키 만들기 Test</h1>
<hr size="5" color="red">
Cookie cookie = new Cookie("user", "korea");<br>
cookie.setMaxAge(1 * 60); <br>
response.addCookie(cookie);

<%
	Cookie cookie = new Cookie("user", "korea"); // 쿠키 만들기 // 쿠키이름 : user, 쿠키 값 : korea
	cookie.setMaxAge(1*60); //유효기간을 나타내는 숫자(초단위) 60초 유지
	response.addCookie(cookie); //클라이언트 컴퓨터에 파일 형태 저장
%>

<%
	Cookie cookie2 = new Cookie("eunah", "korea"); // 쿠키 만들기 // 쿠키이름 : user, 쿠키 값 : korea
	cookie2.setMaxAge(1*20); //유효기간을 나타내는 숫자(초단위) 60초 유지
	response.addCookie(cookie2); //클라이언트 컴퓨터에 파일 형태 저장

%>

<hr size="5" color="green">
<a href="addtimecookie.jsp">
	cookie time add</a>
</body>
</html>
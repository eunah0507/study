<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page info="page 지시자를 다루는 테스트 정은아" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP TEST info.jsp</title>
</head>
<body>
<h2> Page 지시자</h2>
<%-- info 속성은 JSP 전체에 대한 설명이나 버전 작성자
	 작성일자와 같은 정보를 문자열로 기술 --%>

&lt; %@ page info="page 지시자를 다루는 예제" &gt;<br>
<%= this.getServletInfo() %>
</body>
</html>
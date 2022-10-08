<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP TEST JSP Comments</title>
</head>
<body>
	<h1> HTML 주석과 JSP 주석의 차이</h1>
	
	<!-- 이것은 HTML 주석으로 웹 브라우저의 [소스보기] 에서 보입니다.
		 다음은 자바코드의 스크립트릿입니다. -->
	<%
		String str;
		if(Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 12)
			str = "오후";
		else 
			str = "오전";
	%>
	
	<!-- 지금은 11 <%=str%> 입니다. -->
	지금 시각은 <%= new Date() %> 입니다.
	
	<%-- JSP 주석 소스보기에서 안보입니다. 지금은 22 <%=str%> 입니다. --%>
</body>
</html>
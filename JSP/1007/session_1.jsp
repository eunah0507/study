<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration, java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session Test</title>
</head>
<body>
<h1> Session Test</h1>
<hr size="5" color="red">
<h2> 세션 주요 정보 조회</h2>

세션 ID : <%=session.getId()%><br>
세션 MaxInactiveInterval(기본 세션 유지 시간) :
				<%= session.getMaxInactiveInterval() %><br>
				
<%
	long mseconds = session.getCreationTime();
//getCreationTime() : 1970년 1월 1일 0시를 기준으로 하여 현재 세션이 생성된 시간까지 지난 시간을 밀리 세컨드로 반환

	Date time = new Date(mseconds);
%>

	세션 생성 시간(1970년 1월 1일 0시 이후 지나 밀리세컨드) : <%= mseconds%><br>
	세션 생성 시간2(시각으로 다시 계산) : <%=time.toLocaleString()%><br>
	
<hr size="5" color="green">
</body>
</html>
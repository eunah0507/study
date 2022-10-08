<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration, java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session time out test</title>
</head>
<body>
<h1> 세션 만들기</h1>
<hr size="5" color="red">
<h2>세션 예제</h2>
<%! long beforetime = new Date().getTime(); %> <!-- 이전 페이지 참조 시간을 저장하는 변수 -->

<%
	long nowtime = new Date().getTime();
	if(session.isNew()){
		session.setAttribute("id2", session.getId());
		session.setAttribute("time", new Date(session.getCreationTime()));
		session.setMaxInactiveInterval(5);
	} else {
		session.removeAttribute("id2");
	}
%>
<hr size="5" color="green">

<h2>세션 조회</h2>

세션 ID : <%=session.getAttribute("id2")%><br>
세션 생성 시간 : <%= session.getAttribute("time") %><br>
세션 MaxInactiveInterval : <%=session.getMaxInactiveInterval() %><br>

<%
	long sessiontime = nowtime - beforetime;
%>

세션이 만들어진 이후 지난 시간
<%= sessiontime/1000%>초
	<p><p>
	<font color="red">
	<%
	long inactiveinterval = nowtime - beforetime; 
	%>
	
	서버에 반응을 보이지 않은 시간 : <%=inactiveinterval / 1000 %>초 <br>
	위 시간이 <%=session.getMaxInactiveInterval() %>
	초를 지나면 <br>이전 세션이 무효화 되고 새로운 세션 생성

	</font>
	<br>
	
	<%
		beforetime = nowtime;
	%>
	
	<hr size="5" color="blue">
	</body>
</html>
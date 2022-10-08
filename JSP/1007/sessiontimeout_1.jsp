<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date , java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session timeout test</title>
</head>
<body>
<h1> Session Test</h1>
<hr size="5" color="red">
<h2> 세션 만들기</h2>
<%
	session.setAttribute("id","korea");
	session.setAttribute("pwd","seoul");
%>

<hr size="5" color="orange">
<h2> session조회</h2>
	session ID : <%=session.getId()%><br>
	session CreationTime : <%=new Date(session.getCreationTime()) %><p><p>
	
	<%
		Enumeration ee = session.getAttributeNames();
	
		while(ee.hasMoreElements())
			// hasMoreElements() : Enumeration의 내부에 원소가 있는지 결과를 반환
			// 있으면 true 없으면 false 반환
		
			{
				String name = (String)ee.nextElement();
					//nextElement() = Enumeration의 내부에 원소가 있다면
					//다음 원소를 반환
				String value = (String)session.getAttribute(name);
					
				out.println("세션 name : " + name + ",");
				out.println("세션 value : " + value + "<br>");
			}
	%>
	
	<p>
	
	세션 Invalidate : <% session.invalidate(); %>
	 <!-- 모든 세션 삭제 // session.invalidate()를 주석처리하면 session 아이디가 안바뀐다.--> 
	
	<hr size="5" color="green">
</body>
</html>
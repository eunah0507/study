<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Test requset_1.jsp test</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
%>

<%
	String name = request.getParameter("name");
	String studentNum = request.getParameter("studentNum");
	String address = request.getParameter("addr");
	String sex = request.getParameter("sex");
	String tel = request.getParameter("tel");
	String country = request.getParameter("country");
%>

<h2> 학생 정보 입력 결과</h2>

<hr size="5" color="red">
		성명 : <%= name %><p>
		학번 : <%= studentNum %><p> 
		주소 : <%= address %><p>
		성별 : <%= sex%><p>
		전화번호 : <%= tel %><p>
		국적 : <%= country%><p>
		
<hr size="5" color="green">
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request request_2.jsp Test</title>
</head>
<body>
<%
request.setCharacterEncoding("utf-8");
%>

<%
String studentNum = request.getParameter("studentNum");
String[] majors = request.getParameterValues("major");
String[] hobbys = request.getParameterValues("hobby");
String[] flowers = request.getParameterValues("flower");
%>

<h2> 학생 정보 입력 결과</h2>
<hr size="5" color="red">

학번 : <%= studentNum %><p>

전공 : <% 
		if (majors==null)
		{
			out.println("전공없음!");
		}
		else
		{
			for(int i = 0; i<majors.length; i++)
				out.println(majors[i] + " ");
		}
%>

<p>

취미 : <%
		if (hobbys == null)
		{
			out.println("취미없음");
		}
		else
		{
			for(String eachHobby : hobbys)
			{
				out.println(eachHobby + " ");
			}
		}
%>

좋아하는 꽃 이름 : <%
		if (flowers == null)
		{
			out.println("좋아하는 꽃 없음");
		}
		else
		{
			for(String eachFlower : flowers)
			{
				out.println(eachFlower + " ");
			}
		}
%>
<p>

<hr size="5" color="blue">






</body>
</html>
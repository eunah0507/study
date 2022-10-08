<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Request Test</title>
</head>
<body>
<% request.setCharacterEncoding("UTF-8"); %>

<h1>Request Test</h1>
<table border="1">
	<tr>
		<td>이름 : </td>
		<td><%=request.getParameter("name") %></td>
	</tr>
	
	<tr>
		<td>성별</td>
		<td>
			<%
				if(request.getParameter("gender").equals("male")){
			%>
				남자
				
			<%
				} else {
			%>
			
				여자
			<%
				}
			%>
		</td>
	</tr>
	
	<tr>
		<td>취미</td>
		<td>
			<%
				String[] hobbys = request.getParameterValues("hobby");
				for(int i=0; i< hobbys.length; i++)
				{
			%>
				<%= hobbys[i] %> &nbsp;&nbsp;
			<%
				}
			%>
		</td>
	</tr>
	
	<tr>
		<td>주소 : </td>
		<td><%=request.getParameter("adress") %></td>
	</tr>
</table>
</body>
</html>
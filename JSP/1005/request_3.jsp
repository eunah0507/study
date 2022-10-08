<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request_3.jsp Test</title>
</head>
<body>
<%@ page import="java.util.Enumeration" %>
	<%
		request.setCharacterEncoding("utf-8");
	%>
	
	<h2> 좋아하는 꽃과 가보고픈 나라 이름</h2>
	
	<hr size="5" color="red">
	<%
		Enumeration<String> ee = request.getParameterNames();
	
		while(ee.hasMoreElements())
		{
			String name = ee.nextElement();
			
			String[] data = request.getParameterValues(name);
			
			if(data != null)
			{
				for(String eachData : data)
				{
					out.println(eachData + " ");
				}
			}
			
			out.println("<p>");
		}
	%>
	
	<hr size="5" color="green">
</body>
</html>
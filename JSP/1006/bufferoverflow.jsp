<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bufferoverflow Test</title>
</head>
<body>
<%@ page autoFlush="false" buffer="1kb" errorPage="error.jsp" %>

<%
   for(int i=1; i<75; i++)
   {
	   out.println("남은 출력 버퍼의 크기 : " + out.getRemaining() +"<br>");
   }
%>

</body>
</html>
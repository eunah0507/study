<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Calendar" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calendar Test</title>
</head>
<body>
<%
Calendar cc = Calendar.getInstance();
int hour = cc.get(Calendar.HOUR_OF_DAY);
int minute = cc.get(Calendar.MINUTE);
int second = cc.get(Calendar.SECOND);

if(hour > 12)
{
	hour = hour - 12;
}
%>
<h1> 현재 시간은 <%= hour %>시, <%= minute %>분, <%=second %>초 입니다.<br>
</h1>
</body>
</html>
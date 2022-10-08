<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP TEST exception.jsp</title>
</head>
<body>
<%@ page isErrorPage="true" %> <!-- 이게 있어야한다는데 왜 그럴까? -->
<p>

<h2> 처리중 문제 발생</h2>
	빠른 시일내에 복구하도록 하겠습니다.<p>
	
<img src="../images/img.png"><br>
	exception.getMessage() : <%=exception.getMessage() %><p>
	exception.toString() : <%=exception.toString() %><p>

</body>
</html>
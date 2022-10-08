<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% session.setAttribute("id",request.getParameter("id"));%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session Login</title>
</head>
<body>
<h3>로그인 되었습니다.</h3>
<hr size="5" color="red">
<h3> 로그인 아이디 : <%=session.getAttribute("id") %></h3>
				 <!-- getAttribute("id") : id란 이름에 해당하는 속성 값을
				 	  Object 타입으로 반환 해당하는 이름이 없을 경우 null값 반환-->
<p>
<a href="sessionLogout.jsp">로그아웃</a>
<!-- setAttribute() : id 이름에 넘어온 id값 저장 -->
</body>
</html>
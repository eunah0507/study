<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login_1.jsp Test</title>
</head>
<body>
<h2> 로그인 테스트 </h2>

<%

 request.setCharacterEncoding("utf-8"); 
 String userid = request.getParameter("userid");
 String passwd = request.getParameter("passwd");
%>

<%
  if(userid.equals("")) {
%>

  <jsp:include page="loginhandle.jsp">
        <jsp:param value="guest" name="userid" />
        <jsp:param value="anonymous" name="passwd" />
        <jsp:param value="010-1234-1234" name="tel" />
  </jsp:include>
  <%}else{ %>
  
  <jsp:include page="loginhandle.jsp"/>
  <%
  }
  %>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Test loginhandle.jsp</title>
</head>
<body>
<%
   request.setCharacterEncoding("utf-8");
   
   String userid = request.getParameter("userid");
   String passwd = request.getParameter("passwd");  
   String tel = request.getParameter("tel");  

%>

<%

   if(userid.equals("guest"))
   {
	   out.println("회원이 아니시군요 반갑습니다.<br>");
	   out.println("회원 가입 하기시 바랍니다.<hr size='5' color='red'>");
   }
   else
   {
	   out.println(userid + " 님 반갑습니다. 즐거운 시간 되십시오!!<hr size='5' color='green'>");
   }

%>

<p><p>
아이디 : <%= userid %>,
암호 : <%=passwd %>
전화번호 : <%=tel %>

</body>
</html>
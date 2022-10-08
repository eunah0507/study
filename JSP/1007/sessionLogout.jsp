<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	session.removeAttribute("id");
	//removeAttribute() : id 이름의 속성을 
%>

<h3>로그아웃 되었습니다.</h3>
<hr size="5" color="red">
<p>
<a href="sessionlogin_1.jsp">로그인 페이지로 이동</a>

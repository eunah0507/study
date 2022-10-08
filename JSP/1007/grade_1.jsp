<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java Beans Test grade_1.jsp</title>
</head>
<body>
<h2> JavaBeans를 이용한 학생의 점수에 따른 성적 처리</h2>
<hr size="5" color="red">
<%request.setCharacterEncoding("UTF-8"); %>

<jsp:useBean id="jumsu" class="javabean.GradeBean" scope="page"/>

<h3> 폼에서 전달받은 이름과 성적을 JavaBeans GradeBean에 저장</h3>
<hr size="5" color="green">
<p>

이름 : <%= request.getParameter("name") %>,
성적 : <%= request.getParameter("score") %>,
학번 : <%= request.getParameter("number") %><p>
<%-- <jsp:setProperty property="name" name="jumsu" param="name"/
	 <jsp:setProperty property="score" name="jumsu" param="score"/> --%>
	 
<jsp:setProperty property="*" name="jumsu"/>

<hr size="5" color="blue">
<h3>JavaBeans GradeBean에 저장된 정보를 조회 출력</h3>
이름 : <jsp:getProperty property="name" name="jumsu"/><br>
성적 : <jsp:getProperty property="score" name="jumsu"/><br>
학번 : <jsp:getProperty property="number" name="jumsu"/><br>
등급 : <jsp:getProperty property="grade" name="jumsu"/><br>
</body>
</html>
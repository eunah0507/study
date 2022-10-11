<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제 : score.tag </title>
</head>
<body>
	<h2>JavaBeans를 이용한 학생의 이름과 성적의 저장과 조회 예제</h2>
	<jsp:useBean id="score" class="javabean.ScoreBean" scope="page" />
	
	<hr>
	<h3>이름과 성적을 JavaBean에 저장</h3><p>
	이름 : <%= "황선우" %>,
	전화번호 : <%= "010-1234-5678" %>,
	성적 : <%= "85" %><p>
	<jsp:setProperty name="score" property="name" value="황선우"/>
	<jsp:setProperty name="score" property="tel" value="010-1234-5678" />
	<jsp:setProperty name="score" property="point" value="85" />
	
	<hr>
	<h3>JavaBeans ScoreBean에 저장된 정보를 조회 출력</h3>
	이름 : <jsp:getProperty name="score" property="name" /><br>
	전화번호 : <jsp:getProperty name="score" property="tel" /><br>
	성적 : <jsp:getProperty name="score" property="point" /><br>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>액션 태그 include main_1.jsp Test</title>
</head>
<body>

<h2> include 액션 태그</h2>
<hr size="5" color="red">
main_1.jsp 파일 시작 부분입니다.<br>

include 태그는 페이지 속성 파일 결과를 태그 위치에 삽입 합니다.<br>

<jsp:include page="sub_1.jsp"/>

<hr size="5" color="green">

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>include file includefile_1.jsp</title>
</head>
<body>

<% int i = 12;%>
<% int nn = 365;%>
<% int days = 365;%>

1년은 <%= i %>달 입니다. <p>

<%-- <%@ include file="includesub.jsp"%><p> --%>  <!--이 경우는 소스코드 그대로 삽입!! 동일변수 사용시 충돌(file과 subfile 내에 동일 변수를 사용할 수 없다.) -->

<jsp:include page="includesub.jsp"/><p> <!-- 결과만 삽입! 동일 변수를 사용하더라도 결과만 삽입되므로 충돌 없음 -->

1년은 <%= days %> 일 입니다.<p>
1년은 <%= nn %> 일 입니다. <p>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forward Test forwardMain.jsp</title>
</head>
<body>
<h2> forward 액션 태그 </h2>

forwardMain.jsp 파일 시작 부분입니다.<br>
forward 태그는 페이지 속성에 지정된 파일로 제어를 넘깁니다.<br>
forwardMain.jsp 페이지의 출력 내용은 하나도 출력되지 않습니다.<br>

 <jsp:forward page="forwardSub.jsp"/> <!-- (1) : 주소는 안 바뀌고 sub 내용 나옴 main 내용 안 나와-->

<%-- <% pageContext.forward("forwardSub.jsp"); %> --%> <!-- (2) : 주소 안 바뀌고 sub 내용 나와 main 내용 안 나와 --> 

<!-- (1)과(2)는 동일 -->

<%--  <jsp:include page="forwardSub.jsp"/> --%><!-- main의 내용 안에 sub 내용 삽입 // 요청과 응답이 살아있다..? -->

<%--  <%response.sendRedirect("forwardSub.jsp"); %> --%> <!-- main 에서 실행했지만 주소 내용 모두 sub 로 바뀜 -->

forwardMain.jsp 파일의 끝 부분입니다.

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP TEST JSP COMMENTS</title>
</head>
<body>
<!-- HTML 주석 소스보기에서 보입니다. -->
<%-- JSP 주석 소스보기에서 안보입니다. --%>

<%!

/*
	절대값을 반환하는 메소드 abs()
*/

public int abs(int a)		// 메소드 구현
{							// if 문장을 활용
	if(a < 0) return -a;
	else return a;
}
%>
원주율은 <%= Math.PI %> 이다.<br>
-345의 절대값은 <%= abs(-345) %> 입니다.

</body>
</html>
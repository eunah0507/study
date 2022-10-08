<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>out Test</title>
</head>
<body>
<%
  out.println("이부분은 출력 되지 않습니다.");
  out.clear(); //버퍼의 내용을 제거 이거 있으면 위에 "" 출력되지 않음
%>

<h2> 현재 페이지의 출력 버퍼의 상태 </h2><p>

 초기 출력 버퍼의 크기 : <%=out.getBufferSize() %> byte <p>
 남은 출력 버퍼의 크기 : <%=out.getRemaining() %> byte <p>
 
 autoFlush : <%= out.isAutoFlush() %><p>

</body>
</html>
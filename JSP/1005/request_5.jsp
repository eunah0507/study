<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request Test</title>
</head>
<body>
<h1> URL/ URI 요청방식, Cookie, 정보</h1>

<table border="1">
	<tr>
		<td>쿠키정보</td>
		
	<%
	Cookie[] cookie = request.getCookies();
	
	if(cookie==null)
	{
	%>
	<td> 쿠키가 존재하지 않습니다.</td>
	
	<%
	} else {
		for(int i = 0; i < cookie.length; i++)
		{
	%>
		<td><%=cookie[i].getName() %> (<%=cookie[i].getValue() %>) &nbsp;&nbsp;</td>
	<%
		}
	}
	%>
	</tr>
	
	<tr>
		<td>서버 도메인 명</td>
		<td><%= request.getServerName() %></td>
	</tr>
	
	<tr>
		<td>서버 도메인 명</td>
		<td><%= request.getServerName() %></td>
	</tr>
	<tr>
		<td>서버 포트번호</td>
		<td><%=request.getServerPort() %></td>
	</tr>
	<tr>
		<td>요청 URL</td>
		<td><%=request.getRequestURL() %></td>
	</tr>
	<tr>
		<td>요청 쿼리</td>
		<td><%=request.getQueryString() %></td>
	</tr>
	<tr>
		<td>클라이언트 호스트명</td>
		<td><%=request.getRemoteHost() %></td>
	</tr>
	<tr>
		<td>클라이언트 IP주소</td>
		<td><%= request.getRemoteAddr() %></td>
	</tr>
	<tr>
		<td>프로토콜</td>
		<td><%= request.getProtocol()%></td>
	</tr>
	<tr>
		<td>요청방식</td>
		<td><%=request.getMethod() %></td>
	</tr>
	<tr>
		<td>컨텍스트 경로</td>
		<td><%=request.getContextPath() %></td>
	</tr>
</table>
</body>
</html>

<!-- 
JSESSIONID란?

톰캣 컨테이너에서 세션을 유지하기 위해 발급하는 키
HTTP 프로토콜은 stateless(상태 정보를 유지하지 않는다)하다. 요청시마다 새로운 연결이 생성되고
응답 후 연결은 끊기게 되므로 상태를 유지할 수 없다. 상태를 저장하기 위해서는 
JESSIONID 쿠키를 클라이언트에게 발급해주고 이 값을 세션을 유지할 수 있도록 한다.
 -->
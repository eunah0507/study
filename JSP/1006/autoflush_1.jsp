<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>autoFlush Test</title>
</head>
<body>
<%@ page autoFlush="false" buffer="1kb" %>

<h2> 현재 autoFlush = <%=out.isAutoFlush() %></h2><p>

<%

  for(int i=1; i<25; i++)
  {
	  out.println("남은 출력 버퍼의 크기(getRemaining()) : " + out.getRemaining() + "<br>");
	  
	  //autoFlush가 false이면 사용자가 버퍼를 처리해야 한다.
	  
	  if(out.getRemaining() < 50)
	  {
		  out.println("<br>");
		  out.flush(); //현재 출력 버퍼에 저장되어 있는 내용을 웹 브라우저에 전송하고 비운다.
	  } //이거(if문) 처리 안 하면 buffer overflow 발생
  }

  %>
  
  <hr size="5" color="green">
  
 초기 출력 버퍼의 크기 : <%=out.getBufferSize() %> byte <br>
 남은 출력 버퍼의 크기 : <%=out.getRemaining() %> byte <br>
 

</body>
</html>
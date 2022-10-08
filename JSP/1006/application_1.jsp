<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>application Test</title>
</head>
<body>

<%! int application = 0;
    int count = 0;
%>

<%

   String scount = (String)application.getAttribute("count"); // object가 훨씬 크기 때문에 string으로 강제 형변환 필수!!

   if(scount != null)
   {
	   count = Integer.parseInt(scount);
   }
   else
   {
	   count=0;
   }
   
   application.setAttribute("count",Integer.toString(++count));
   application.log("현재까지의 조회수 : "+count); //console 창에 보여줌
   
   

%>

   서버 컨테이너 정보 : <%=application.getServerInfo() %><p>
   현재 조회수 누적 :<%=count %>
</body>
</html>
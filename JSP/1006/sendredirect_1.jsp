<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sendredirect_1.jsp Test</title>
</head>
<body>

<hr size="5" color="green">

<%
   String URL1 = "http://search.naver.com/search.naver?where=nexeach"; 
   String URL2 = "https://www.google.com/search?q=korea";   
   String URL3 = "https://search.daum.net/search?nil_suggest=btn&w=tot&DA=SBC";   
   String keyword = request.getParameter("word");
   URL1 += "&"+"query="+ keyword; 
   URL2 += "&" + "oq=" +keyword;
   URL3 += "&"+ "q=" +keyword;
   
  if(request.getParameter("search").equals("네이버")){
   response.sendRedirect(URL1);
  }
  else if(request.getParameter("search").equals("구글"))
  {
	  response.sendRedirect(URL2);
  }
  else
  {
	  response.sendRedirect(URL3);
  }

	  
%>
</body>
</html>
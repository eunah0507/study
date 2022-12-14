<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
  pageContext.forward("pagecontext_3.jsp");
  
  /*
     forward() => 현재 페이지의 요청과 응답에 관한
                  제어권을 URL으로 지정된 주소로 영구적으로 넘긴다.
                  forward된 페이지의 요청 처리가 종료되면
                  응답도 종료된다.
                  
                  포워드와 인클루드 같이 사용한 것
                  
                  이건 실행시켜도 주소창 그대로야           
  */
 
  /*

    주소창을 보면 response 객체의 sendRedirect 메소드를
    사용했을 때와 다르게 처음 실행된 pagecontext_2.jsp 주소가 그대로
    유지되어있다. 이렇게 요청과 응답에 대한 제어권을 다른 페이지로
    넘기더라도 브라우저에 표시되는 주소가 유지되는 방식을 포워딩 방식이라고 한다.
    
    포워딩 방식은 현재 페이지의 요펑과 응답의 정보에 대한 제어권만
    다른 페이지로 넘어가므로 요청 정보와 응답 정보가 유지되는 장점이 있다.
    
    브라우저에 표시되는 주소가 바뀌는 방식을 리다이렉트 방식이라고 하며
    리다이렉트 방식은 이동 할 페이지로 요청과 응답 객체를 새로 생성하며
    전송하므로 요청 정보와 응답 정보가 유지되지 않는다.
    
    태그 forward와 include 차이
    
    태그 include 는 page 속성에 지정된 페이지의 처리가 끝나면 다시
    현재의 페이지로 돌아와 처리를 진행해 나가지만 태그 forward 는 page 속성에 지정된 페이지로 
    제어가 넘어가면 현재 페이지로 다시 돌아오지 않고
    이동된 페이지에서 실행을 종료한다.
  
  */
  %>
  
  
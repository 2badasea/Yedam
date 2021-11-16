<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:forward page="home.do"/>   
	<!-- index.jsp가 호출되면 무조건 home.do로 돌려보내는 것. response.sendRedirect와 똑같은 원리.  -->
	
	<!-- 모든 요청을 .do로 보내기 위함. web.xml에서 <welcome>에서 정의된 대로 처음 index.jsp가 
	실행되는데, index.jsp가 실행되자마자 jsp:forward> 액션태그에 의해 home.do로 돌려버린다.. 
	'jsp:forward'는 response.sendRedirect와 같다. 
	home.do로 가게 됐으니깐, web.xml에서 정의된 대로 FrontCotroller로 이동, 
	service()메소드에 의해 /home.do 만 남고, map에서 home.do를 날리니깐 new HomeCommand가 value가 
	되돌아오고, 그 값은 home/home 이 리턴된다. home밑에 home을 생성한다. -->
</body>
</html>
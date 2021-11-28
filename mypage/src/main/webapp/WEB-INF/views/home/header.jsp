<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/menu.css">
<style type="text/css">
#topMenu {
	padding-bottom: 10px;
	padding-left: 400px;
}
</style>
</head>
<body>
 <nav id="topMenu" >
	   <ul>
	           <li><a class="menuLink" href="home.do">홈</a></li>
	           <c:if test="${empty id }">
	           <li><a class="menuLink" href="memberLoginForm.do">로그인</a></li>
	           </c:if>
	           <c:if test="${not empty id }">
	           <li><a class="menuLink" href="logout.do">로그아웃</a></li>
	           </c:if>
	           <li><a class="menuLink" href="noticeList.do">공지사항</a></li>
	           <li><a class="menuLink" href="javaStudyList.do">자바</a></li>
	           <c:if test="${not empty id }">
	           <li><a class="menuLink" href="memberInfo.do">나의정보</a></li>
	           </c:if>
	           <c:if test="${author eq 'ADMIN' }">
	           <li><a class="menuLink" href="memberList.do">회원관리</a></li>
	           </c:if>
	           <c:if test="${empty id }">
	           <li><a class="menuLink" href="memberJoinForm.do">회원가입</a></li>
	           </c:if>
	           
	   </ul>
</nav>

</body>
</html>
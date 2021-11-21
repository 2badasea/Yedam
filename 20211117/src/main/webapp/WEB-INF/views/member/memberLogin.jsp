<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="../home/header.jsp" />
<div align="center">
	<div><h1>${message }</h1></div>  <!-- el표현식. message는 request객체가 가지고 있는 거.memberLogin클래스에 있는 변수 message를 의미하고 있다. --> 
</div>

</body>
</html>
<!-- el표현식  ${key} : request, session, application 등 영역값을 가져올 때 사용. 
	영역이 다른 데 키값이 같은 경우에는 ${scope.key}를 이용하면 해당 영역에 담긴 key의 value값을 가져온다.   -->
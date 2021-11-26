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
	<c:if test="${result eq false}">
		<h3>이미 존재하는 아이디</h3>
	</c:if> 
	<c:if test="${result eq true}">
		<h3>사용가능한 아이디</h3>
	</c:if>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Member List</title>
</head>
<body>
<jsp:include page="../home/header.jsp" />
<div align="center">
	<div><h1>멤 버 목 록</h1></div>
	<c:forEach items="${members }" var="member">  <!-- request객체가 가지고 있는 객체 members의 여러개 레코드중에 한 행(memberVO 타입)을 member라는 이름으로 읽는다~ -->
		${member.id } : ${member.password } : ${member.name }<br>  <!--   vo객체에 있는 변수명과 똑같아야 한다.  -->
	</c:forEach>
	
	<!-- 조금 더 깔끔한 방식으로 -->
	<div>
		<table border="1">
			<tr>
				<th width="200">아 이 디</th>
				<th width="150">이  름</th>
				<th width="200">전화번호</th>
				<th width="400">주  소</th>
				<th width="150">권  한</th>
			</tr>
			<c:forEach items="${members }" var="member">
				<tr>
					<td align="center">${member.id }</td>
					<td align="center">${member.name }</td>
					<td align="center">${member.tel }</td>
					<td>&nbsp;${member.address }</td>
					<td align="center">${member.author }</td>
				</tr>
			</c:forEach>
		</table>
	</div><br>
	<button type="button" onclick="location.href='home.do'">홈 으로</button>
</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function boardRead(str) {
		frm.no.value = str; 
		alert(frm.no.value);
		frm.submit();
	}

</script>
</head>
<body>
<div align="center">
	<div><h1>공지사항 리스트</h1></div>
	<div>
		<table border="1">
			<tr>
				<th width="70">No</th>
				<th width="100">작성자</th>
				<th width="300">제목</th>
				<th width="100">작성일자</th>
			</tr>
			<c:forEach items="${boards }" var="board">
				<tr onmouseover="this.style.background='#ebf7fd';"
					onmouseleave="this.style.background='#FFFFFF';"
					onclick="boardRead('${board.no}')">
					<td align="center">${board.no }</td>
					<td align="center">${board.name }</td>
					<td align="center">${board.title }</td>
					<td align="center">${board.wdate }</td>
				</tr>
			</c:forEach>
		</table>
	</div><br>
	<div>
		<c:if test="${not empty id }">
			<button type="button" onclick="location.href='boardForm.do'">글쓰기</button>
		</c:if>
	</div>
	<div> <!-- hidden form -->
		<form id="frm" action="boardRead.do" method="post">
			<input type="hidden" id="no" name="no">
		</form>
	</div>
	
</div>
</body>
</html>
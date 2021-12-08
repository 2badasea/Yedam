<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function javaRead(str) {
		frm.no.value = str; 
		alert(frm.no.value);
		frm.submit();
	}
	
	function insertTest() {
		frm2.no.value = str; 
		alert(frm.no.value);
		frm.submit();
	}

</script>
<style type="text/css">
#java_list {
	  position: absolute;
	  border:1px solid black;
	  top:200px;
	  left: 400px;
}
#top_tr {
	background-color: rgb(234,242,252);
}
div>div>h1 {
	color: maroon;
}
</style>
</head>
<body>
<div align="center" id="java_list">
	<div><h1>자바 학습 도우미</h1></div>
	<div>
		<table border="1">
			<tr id="top_tr">
				<th width="140">No</th>
				<th width="200">작성자</th>
				<th width="600">제목</th>
				<th width="200">작성일자</th>
			</tr>
			<c:forEach items="${javas }" var="java">
				<tr onmouseover="this.style.background='#ebf7fd';"
					onmouseleave="this.style.background='#FFFFFF';"
					onclick="javaRead('${java.no}')" >
					<td align="center">${java.no }</td>
					<td align="center">${java.name }</td>
					<td align="center">${java.title }</td>
					<td align="center">${java.wdate }</td>
				</tr>
			</c:forEach>
		</table>
	</div><br>
	<div>
		<c:if test="${not empty id }">
			<!--  <button type="button" onclick="location.href='javaForm.do'">글쓰기</button>-->
			<button type="button" onclick="location.href='javaForm.do'">글쓰기</button>
		</c:if>
	</div>
	<div> <!-- hidden form -->
		<form id="frm" action="javaRead.do" method="post">
			<input type="hidden" id="no" name="no">
		</form>
	</div>
	
</div>
</body>
</html>
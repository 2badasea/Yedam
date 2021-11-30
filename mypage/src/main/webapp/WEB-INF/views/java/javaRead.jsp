<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
a {
    color: black;
    text-align: center;
    text-decoration: none;
}

#java_read_list {
	position: absolute;
	border:1px solid black;
	top:200px;
	left: 500px;
}
	
</style>
<script src="js/jquery-3.6.0.min.js"></script>

</head>
<body>

<div align="center" id="java_read_list">
	<div><h1>${java.title }</h1></div>
	<div>
		<table border="1">
			<tr>
				<th width="200">작성자</th>
				<td width="200">${java.name }</td>
				<th width="200">작성일자</th>
				<td width="200">${java.wdate }</td>
			</tr>
			<tr>
				<th>제목</th>
				<td colspan="3">${java.title }</td>
			</tr>
			<tr>
				<th>내용</th>
				<td colspan="3">
					<textarea rows="20" cols="120">${java.subject }</textarea>
				</td>
			</tr>
		</table>
	</div> <br>
	<div> <!-- hidden form tag -->
		<form id="frm" method="post"> <!-- Ajax로 처리함 -->
			<button type="button" onclick="history.back()">목록가기</button>
		</form>
	</div>
</div>
</body>
</html>
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
</style>
<script src="js/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
	function fileDown(){
//		var ofile = $("#fileName").val();   // 읽을 때의 변수. 
//		var pfile = $("#pfileName").val();
		frm.action ="AjaxFiledown";
		frm.submit();
/*	 $.ajax({
			url: "ajaxFileDownLoad.do",
			type: "post",
			data: {fileName:ofile, pfileName:pfile},  // request객체로 넘어갔을 때의 변수. 
			dataType: "text",
			success: function(data){
				if(data == 'OK') {
					alert(ofile + "이 성공적으로 다운로드 되었습니다.");
				}
			},
			error: function(){
				alert("파일 다운로드 실패!!!");
			}
		});    */
	}
</script>

</head>
<body>
<jsp:include page="../home/header.jsp"/>

<div align="center">
	<div><h1>공지사항 상세보기</h1></div>
	<div>
		<table border="1">
			<tr>
				<th width="150">작성자</th>
				<td width="150">${notice.name }</td>
				<th width="150">작성일자</th>
				<td width="150">${notice.wdate }</td>
			</tr>
			<tr>
				<th>제목</th>
				<td colspan="3">${notice.title }</td>
			</tr>
			<tr>
				<th>내용</th>
				<td colspan="3">
					<textarea rows="6" cols="100"  readonly="readonly">
						${notice.subject }
					</textarea>
				</td>
			</tr>
			<tr>
				<th>첨부파일</th>
				<td colspan="3">
				<c:if test="${not empty notice.fileName }">
					<span><img src="img/file.png" width="20" height="20">
					<a href = "javascript:void(0);" onclick="fileDown(); return false;">${notice.fileName }</a></span>
				</c:if>
				</td>
			</tr>
		</table>
	</div> <br>
	<div> <!-- hidden form tag -->
		<form id="frm" method="post"> <!-- Ajax로 처리함 -->
			<input type="hidden" id="fileName" name="fileName" value="${notice.fileName }">  <!-- 원본파일명 -->
			<input type="hidden" id="pfileName" name="pfileName" value="${notice.pfileName }"> <!-- 물리파일명 -->
			<button type="button" onclick="history.back()">목록가기</button>
		</form>
	</div>
</div>
</body>
</html>
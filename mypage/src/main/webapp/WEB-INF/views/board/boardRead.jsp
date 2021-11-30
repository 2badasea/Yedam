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
<script src="http://code.jquery.com/jquery-latest.js"></script> 
<script type="text/javascript">
//	function fileDown(){
//		var ofile = $("#fileName").val();   // 읽을 때의 변수. 
//		var pfile = $("#pfileName").val();
//		frm.action ="AjaxFiledown";
//		frm.submit();
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

<div align="center">
	<div><h1>공지사항 상세보기</h1></div>
	<div>
		<table border="1">
			<tr>
				<th width="150">작성자</th>
				<td width="150">${board.name }</td>
				<th width="150">작성일자</th>
				<td width="150">${board.wdate }</td>
			</tr>
			<tr>
				<th>제목</th>
				<td colspan="3">${board.title }</td>
			</tr>
			<tr>
				<th>내용</th>
				<td colspan="3">
					<textarea rows="10" cols="100"  readonly="readonly">
						${board.subject }
					</textarea>
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
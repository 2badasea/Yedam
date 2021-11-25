<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<div>
			<h1>공지사항 등록</h1>
		</div>
		<div>
			<form id="frm" action="noticeResister.do" method="post">
				
				<!-- 이해하기 -->
				<div>
					<table border="1">
						<tr>
							<th width="150">아이디</th>
							<td width="150">		<!-- id는 javascript에서 쓰고, name은 자바에서 백단에서 사용한다.  -->
								<input type="text" id="id" name="id"> <!-- name변수는 noticeVO가 가지고 있는 변수명과 일치시켜야 함. -->
							</td>
							<th width="150">작성자</th>
							<td width="150">
								<input type="text" id="name" name="name">
							</td>
							<!-- 세션값에서 가져온다. -->
							<th width="150">작성일자</th>
							<td width="150">
								<input type="date" id="wdate" name="wdate">
							</td>
						</tr>
						<tr>
							<th>제 목</th>
							<!-- width값이 필요없다. 맨 위의 행에서 정해졌기 때문에.  -->
							<td colspan="5"><input type="text" id="title" name="title"
								size="95"></td>
						</tr>
						<tr>
							<th>내 용</th>
							<td colspan="5"><textarea rows="6" cols="100" id="subject"
									name="subject"></textarea></td>
						</tr>
						<tr>
							<th>비 고</th>
							<td colspan="5">
								<input type="text" id="bigo" name="bigo">
							</td>
						</tr>
						
					</table>
				</div>
				<br> <input type="submit" value="저 장">&nbsp;&nbsp;&nbsp;
				<input type="reset" value="취 소">
			</form>
		</div>
		<script type="text/javascript">
			document.getElementById('wdate').value = new Date().toISOString()
					.substring(0, 10);
		</script>
	</div>
</body>
</html>
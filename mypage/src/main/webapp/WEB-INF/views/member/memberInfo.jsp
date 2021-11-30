<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.js"></script> 
<script type="text/javascript">

	$(function() {
		$("#btn1").click(function() {
			frm.action = "memberUpdate.do";   // 1. 해당 페이지를 호출하게 되고
			frm.submit();    				// 2. submit()을 통해 value값인 ${member.id}값이 파라미터로 넘어가게 된다.
		});
		
		$("#btn2").click(function(){
			var str = confirm("정말 회원탈퇴를 원하십니까? \n 다시 한번 생각해보세요..")
			if(str)  // str이 boolean값임. 
				frm.action = "memberDelete.do";   // 확인창에서 yes를 누른 경우.
				else 
					return false;
			frm.submit();
	});
	});
</script>
</head>
<body>
	<div align="center">
		<div>
			<h1>나의 정보 보기</h1>
		</div>
		<div>
			<table border="1">
				<tr>
					<th width="150">아이디</th>
					<td width="150">${member.id }</td>
					<th width="150">이름</th>
					<td width="150">${member.name }</td>
				</tr>
				<tr>
					<th>패스워드</th>
					<td>********</td>
					<th>권 한</th>
					<td>${member.author }</td>
				</tr>
				<tr>
					<th>연락처</th>
					<td colspan="3">${member.tel }</td>
				</tr>
				<tr>
					<th>주 소</th>
					<td colspan="3">${member.address }</td>
				</tr>
			</table>
		</div>
		<br>
		<div>
			<!--  원래,  onclick=CallProcess(1), onclick=CallProcess(2)  -->
			<button type="button" id="btn1">수 정</button>
			&nbsp;&nbsp;&nbsp;
			<button type="button" id="btn2">회원탈퇴</button>
		</div>

		<div>
			<form id="frm" method="post">
				<input type="hidden" id="id" name="id" value="${member.id }">
					<!-- get방식이 아니라 post방식으로 처리하기 위해 hidden형식 사용 -->
					<!-- hidden방식을 사용한 건 이전 요청처리에 대한 값을 다음 요청에서도 연속성을 갖기 위함. <script>부분에 보면, 
					btn1과 btn2에 해당하는 각각의 frm.action을 통해 해당 페이지로 value="${member.id}"값이 파라미터로 넘어갈 수 있게 된다.-->
			</form>
		</div>

	</div>

</body>
</html>
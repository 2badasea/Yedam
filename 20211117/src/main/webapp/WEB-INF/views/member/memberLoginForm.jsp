<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function inputCheck(){
		if(frm.id.value == "") {
			alert("아이디를 입력하세요.");
			frm.id.focus();
			return false;
		} else if(frm.password.value == ""){
			alert("패스워드를 입력하세요.");
			frm.password.focus();
			return false;
		}
		frm.submit();  //  " 둘 다 통과되면 frm.submit() 해라"
	}

</script>
</head>
<body>
<jsp:include page="../home/header.jsp" />
<div align="center">
	<div><p><p><p></div>
	<div><h2>로 그 인</h2></div>
	<div>
		<form id="frm" action="memberLogin.do" method="post">
			<div>
				<table border="1">
					<tr>
						<th width="150">아 이 디</th>
						<td width="200">							<!-- name이 없으면 request객체에 안 담긴다. js를 안 쓰면 id도 필요없음.  -->
							<input type="text" id="id" name="id">  <!-- name에 들어가 있는 값은 memberVO 객체에 잇는 필드명이랑 똑같이. 자바에서 씀.-->
						</td>									<!--  id는 자바스크립트에서 쓸 수 있도록 하기 위함.  --> <!-- id와 name은 변수명을 정하는 것. -->
					</tr>
					<tr>
						<th width="150">패스워드</th>
						<td width="200">
							<input type="password" id="password" name="password">
						</td>
					</tr>
				</table>
			</div><br>
			<input type="button" onclick="inputCheck()" value="로그인">&nbsp;&nbsp;&nbsp;
			<input type="reset" value="취 소">&nbsp;&nbsp;&nbsp;
		</form>
	</div><br>
</div>

</body>
</html>
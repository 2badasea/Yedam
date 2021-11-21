<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
<script src="js/jquery-3.6.0.min.js"></script>
<script type="text/javascript">

	function CheckEmail(str) { // email check 정규식,   js 정규표현식 참고하기 
		var reg_email = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
		if (!reg_email.test(str)) {
			return false;
		} else {
			return true;
		}
	}

	function idCheck() { // 아이디 중복체크 
		var id = $('#id').val();  //jquery val()메소드. html폼 요소의 value속성 값을 가져옴 >>> id값이 'id'인 텍스트 필드의 값을 가져옴.
		if (!CheckEmail(id)) { // 입력된 아이디가 이메일 형식인지 체크 
			alert('Email을 입력하세요.');
			$('#id').val("");		 // id속성값의 필드에 공백으로 지워주는 역할. 
			$("#id").focus();  // id속성값의 공간에 커서를 위치시켜준다. 
			return;
		}

		$.ajax({
			url : "ajaxIdCheck.do",  // 접속할 페이지 주소
			type : "post",   // 전송방식. 
			data : {         // 서버로 보낼 데이터 
				chkid : id
			},
			dataType : "text",		// 통신의 결과로 넘어올 데이터의 종류
			success : function(data) {
				if (data == '0') {
					alert(id + "사용할 수 있는 아이디 입니다.");
					$("#idchk").val("Yes");
					$("#idchk").attr("disabled", true); //중복체크 버튼 비활성화.
					$("#password").focus();
				} else {
					alert(id + "이미 존재하는 아이디 입니다.");
					$("#id").val("");
					$("#id").focus();
				}
			}
		});
	}
	
	function formCheck() {
		if($("#idchk").val() != 'Yes'){
			alert("아이디 중복체크를 해주세요.");
			return false;
		}
		
		if($("#password").val() != $("#passwordChk").val()){
			alert("패스워드가 일치하지 않습니다.")
			$("#password").val(""); 
			$("#passwordChk").val("");
			$("#password").focus();
			return false;
		}
		$("#frm").submit();
	}
</script>
</head>
<body>
	<jsp:include page="../home/header.jsp" />
	<div align="center">
		<div>
			<h3>회 원 가 입</h3>
		</div>
		<div>
			<form id="frm" action="memberJoin.do" method="post">
				<div>
					<table border="1">
						<tr>
							<th width="150">* 아 이 디</th>
							<td width="500"><input type="email" id="id" name="id"
								required="required" placeholder="email을 입력하세요..">
								&nbsp;&nbsp;
								<button type="button" id="idchk" onclick="idCheck()" value="No">중복체크</button></td>
						</tr>
						<tr>
							<th>* 비밀번호</th>
							<td><input type="password" id="password" name="password"
								required="required" placeholder="패스워드 입력"></td>
						</tr>
						<tr>
							<th>* 비밀번호 확인</th>
							<td><input type="password" id="passwordChk"
								name="passwordChk" required="required" placeholder="패스워드 입력"></td>
						</tr>
						<tr>
							<th>* 이 름</th>
							<td><input type="text" id="name" name="name"
								required="required" placeholder="이름을 입력..."></td>
						</tr>
						<tr>
							<th>전화번호</th>
							<td><input type="text" id="tel" name="tel"
								placeholder="전화번호 입력..."></td>
						</tr>
						<tr>
							<th>주 소</th>
							<td><input type="text" id="address" name="address" size="68"
								placeholder="주소를 입력..."></td>
						</tr>
					</table>
				</div>
				<br> 
				<input type="button" onclick="formCheck()" value="회원가입">&nbsp;&nbsp;&nbsp;
				<input type="reset" value="취소">
			</form>
		</div>
	</div>
</body>
</html>
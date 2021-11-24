<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Member List</title>
<script src="js/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
	// var STATUS;  // 전역변수. select 의 변경된 값을 저장
	function authorEdit(id, status){
		var id = id;  // form에 있는 변수 id에 담고,  우항의 id는 ${member.id} authorEdit()의 매개값에 해당한다. 
		var author = $("#author"+status).val(); 
		//ajax로 처리 해야 하는 부분. 
		$.ajax({
			url : 'ajaxAuthorUpdate.do',   // 호출명.  만들어줘야 한다. frontcontroller에. 
			type : 'post',				// 전송방식 get,post
			data: {id: id, author: author}, //전달할 데이터. K:V 형식으로, 앞쪽의 K가 변수명, 뒤는 값. 
			dataType: 'text',   // 처리된 결과를 받을 데이터의 타입. (html or json, jsonp, xml 등등 string으로 받을 땐 text)
			success : function(data){   // data에 리턴값이 담겨있다. 
				if(data == 'yes'){   // data에 'yes' 단어가 들어오면~
					alert(id + "님의 권한이 변경되었습니다.");
				} else {
					alert(id + "님의 권한변경이 실패했습니다.");
				}
			} 
			//error : 안 써도 되긴 하다.  
		});
	}
</script>
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
				<th width="150">아 이 디</th>
				<th width="150">이  름</th>
				<th width="150">전화번호</th>
				<th width="400">주  소</th>
				<th width="100">권  한</th>
				<th width="100">권한수정</th>
			</tr>
			<c:forEach items="${members }" var="member" varStatus="status"> <!-- membervo 의 리스트형태인 members, 그 중에 하나의 레코드를 읽는 게 member -->
				<tr onmouseover="this.style.background='#ebf7fd';"
					onmouseleave="this.style.background='#FFFFFF';">
					<td align="center">${member.id }</td>
					<td align="center">${member.name }</td>
					<td align="center">${member.tel }</td>
					<td>&nbsp;${member.address }</td>
					<td align="center">
						<select id="author${status.count }" name="author" >
								<option value="ADMIN" <c:if test="${member.author eq 'ADMIN' }">selected</c:if>>ADMIN</option>
								<option value="USER" <c:if test="${member.author eq 'USER' }">selected</c:if>>USER</option>
						</select>
					</td>
					<td align="center">
						<button type="button" onclick="authorEdit('${member.id}','${status.count }')">변경</button>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div><br>
	<button type="button" onclick="location.href='home.do'">홈 으로</button>
</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Member List</title>
<script src="http://code.jquery.com/jquery-latest.js"></script> 
<script type="text/javascript">
	
	function authorEdit(id, status){
		var id = id;  
		var author = $("#author"+status).val(); 
		//ajax로 처리 해야 하는 부분. 
		$.ajax({
			url : 'ajaxAuthorUpdate.do',   
			type : 'post',				
			data: {id: id, author: author}, 
			dataType: 'text',  
			success : function(data){  
				if(data == 'yes'){  
					alert(id + "님의 권한이 변경되었습니다.");
				} else {
					alert(id + "님의 권한변경이 실패했습니다.");
				}
			} 
			
		});
	}
</script>
</head>
<body>
<div align="center">
	<div><h1>멤 버 목 록</h1></div>
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
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="resources/js/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
	function idCheck(){
		var $id = "bada@gmail.com";
		$.ajax({
			url: "memberList.do",  //idCheck()
			type: "post",
			//data: {id : $id},
			dataType: "json",
			success: function(data){
				console.log(data);
				var tb = $("<table border='1' />");
				var row = $("<tr/>").append(
						$("<th />").text("아이디"),
						$("<th />").text("이름"),
						$("<th />").text("주소"),
						$("<th />").text("연락처"),
						$("<th />").text("권한")
					);
				tb.append(row); // for는 of 배열용
				for(var i in data){   // data라는 오브젝트에 담겨있는, key:value형태의 값을 가지고 있는 개별 데이터를 i라는 변수에 담는다 >>> i 변수에는 key값이 담겨있다. 
					var id = data[i].id;  // data[i].id; >> object형태의 value값이다ㅏ. 그걸 id변수에 담겠다는 것.
					var name = data[i].name;
					var address = data[i].address;
					var tel = data[i].tel;
					var author = data[i].author;
					
					row = $("<tr/>").append(
							$("<td />").text(id),
							$("<td />").text(name),
							$("<td />").text(address),
							$("<td />").text(tel),
							$("<td />").text(author)
						);
					tb.append(row);
				}
				$("#wrap").append(tb);
			}
		});
	}
</script>
</head>
<body>
<div align="center">
	<div><h1>환영합니다.</h1></div>
	<h3><a href="test.do">타일즈 테스트</a></h3>
	<button type="button" onclick="idCheck()">멤버목록</button>
	<div><h1>멤버목록</h1></div>
	<div id="wrap"></div>
</div>
</body> 
</html>
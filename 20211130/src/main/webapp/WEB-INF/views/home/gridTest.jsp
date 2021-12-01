<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<script>
	const ajax = new XMLHttpRequest();  // ja es6,  ajax로 사용하기 위해 생성. ajax 비동기 통신을 실행시킬 수 있는 클래스 >>> xmlhttprequest()메소드. 
	const url = "ajaxMemberList.do";  // 바뀔 수 없는 상수값에 대한 변수처리는 const. 
	
	ajax.onload = function(){   // ajax가 정상동작 될 때와 오류될 때 처리.
		if(ajax.status >= 200 && ajax.status < 300){   // 200번대는 성공을 의미. 
			successCallback(ajax.response);
		} else {
			errorCallback(new Error(ajax.statusText));
		}
	}
	
	ajax.onerror = errorCallback;
	ajax.open('POST', url);
	ajax.setRequestHeader('Accept', 'application/json'); // 결과를 받을 때, 왼쪽의 변수명에 오른쪽의 값을 담는다. 
	ajax.send();	// 실제 수행하는 명령 send()
	
	function successCallback(response){
		let gridData = JSON.parse(response); // Json data type 으로 parsing   JSON.parse() 는 js가 제공하는 메소드. 
		const grid = new tui.Grid({
		    el: document.getElementById('grid'), // 위 body영역의 id="grid"영역에 뿌려준다는 것.
		    data: gridData,
		    columns: [
		      {
		        header: 'ID',  // 칼럼에서 보여주는 이름
		        name: 'id'    // 데이터의 변수 이름.
		      },
		      {
		        header: 'NAME',
		        name: 'name'
		      },
		      {
		        header: 'TEL'',
		        name: 'tel'
		      },
		      {
		        header: 'ADDRESS',
		        name: 'address'
		      },
		      {
		        header: 'AUTHOR',
		        name: 'author'
		      }
		    ]
		  });
		}
	
	function errorCallback(err){
		alert(err.message);
	}

				

</script>

<section class="hero">
<div class="container">
	<div class="row">
			<div class="col-lg-12">
				<div id="grid"></div>
			</div>
	</div>
</div>
</section>


</body>
</html>
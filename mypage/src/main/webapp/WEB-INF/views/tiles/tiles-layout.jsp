<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><tiles:getAsString name="title"/></title>
<link rel="stylesheet" href="css/menu.css">
<style type="text/css">
* {
	margin: 0px;
}
#side {
	background-color: rgb(51,51,51);
	height: 100vh;
}
#header {
	heigth: 5vh;
}
#body {
	height: 80vh;
}
#footer {
	height: 5vh;
}

</style>
</head>
<body>
<!-- tiles-context.xml에서 보면, 레이아웃 구조가 이 jsp를 기반으로 구조를 형성하도록 설정되어 있음. -->
<div class="container">
		<table border="1">
			<tr>
				<td rowspan="4" width="200" id="side"><tiles:insertAttribute name="side" /></td>
			</tr>
			<tr>
				<td width="1700" id="header"><tiles:insertAttribute name="header"/></td>
			</tr>
			<tr>	
				<td height="720" id="body"><tiles:insertAttribute name="body" /></td>
			</tr>
			<tr>
				<td id="footer"><tiles:insertAttribute name="footer"/></td>
			</tr>
		
		</table>
</div>
</body>
</html>
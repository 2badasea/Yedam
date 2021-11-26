<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><tiles:getAsString name="title"/></title>
</head>
<body>
<!-- tiles-context.xml에서 보면, 레이아웃 구조가 이 jsp를 기반으로 구조를 형성하도록 설정되어 있음. -->
<div align="center">  
	<div>
		<table border="1">
			<tr>
				<td colspan="2"><tiles:insertAttribute name="header"/></td>
			</tr>
			<tr>
				<td width="20%" height="400"><tiles:insertAttribute name="side" /></td>
				<td width="80%"><tiles:insertAttribute name="body" /></td>
			</tr>
			<tr>
				<td colspan="2"><tiles:insertAttribute name="footer"/></td>
			</tr>
		</table>
	</div>
</div>
</body>
</html>
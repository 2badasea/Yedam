<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title><tiles:getAsString name="atitle" /></title>

    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Nunito:wght@300;400;600;700;800&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="resources/assets/css/bootstrap.css">

    <link rel="stylesheet" href="resources/assets/vendors/iconly/bold.css">

    <link rel="stylesheet" href="resources/assets/vendors/perfect-scrollbar/perfect-scrollbar.css">
    <link rel="stylesheet" href="resources/assets/vendors/bootstrap-icons/bootstrap-icons.css">
    <link rel="stylesheet" href="resources/assets/css/app.css">
    <link rel="shortcut icon" href="resources/assets/images/favicon.svg" type="image/x-icon">
</head>

<body>
<div id="app">
	<tiles:insertAttribute name="sidemenu" />
	<tiles:insertAttribute name="abody" />
	<tiles:insertAttribute name="afooter" />
</div> 
<script src="resources/assets/vendors/perfect-scrollbar/perfect-scrollbar.min.js"></script>
    <script src="resources/assets/js/bootstrap.bundle.min.js"></script>

    <script src="resources/assets/vendors/apexcharts/apexcharts.js"></script>
    <script src="resources/assets/js/pages/dashboard.js"></script>

    <script src="resources/assets/js/main.js"></script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
시간은
<P>  The time on the server is ${serverTime}. </P>
<a href="sub1">서브1</a><br>

<a href="sub2?irum=tom">서브2 - para</a><br>
<a href="sub2?irum=james">서브2 - para</a><br>
</body>
</html>

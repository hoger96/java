<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	String path = request.getContextPath();
%>
<link href="<%=path %>/css/index.css" rel="stylesheet">
</head>
<body>
	<header>
		<h1>연습</h1>
	</header>
	<nav>
		<ol>
			<li><a href="<%=path %>/list">조회</a></li>
			<li><a href="<%=path %>/reg">등록</a></li>
		</ol>
	</nav>
	<section>
	
	</section>
	<footer>
		hi
	</footer>
</body>
</html>
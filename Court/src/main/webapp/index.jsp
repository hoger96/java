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
<header><h2>코트 예약 관리</h2></header>
<nav>
	<ol>
		<li><a href="<%=path%>/reg">코트예약</a></li>
		<li><a href="<%=path%>/list">코트예약조회</a></li>
		<li><a href="<%=path%>/user">사용자별조회</a></li>
		<li><a href="index.jsp">홈으로</a></li>
	</ol>
</nav>
<section>
</section>
<footer><h3>HRD KOREA</h3></footer>
</body>
</html>
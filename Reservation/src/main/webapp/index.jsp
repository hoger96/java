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
	<h2>백신예약 및 접종 조회 프로그램</h2>
</header>
<nav>
	<ol>
		<li><a href="<%=path%>/reg">백신예약</a></li>
		<li><a href="<%=path%>/list">백신접종조회</a></li>
		<li><a href="<%=path%>/area">백신지역별 접종 횟수 조회</a></li>
		<li><a href="<%=path%>/reg">홈으로</a></li>
	</ol>
</nav>
<section>

</section>
<footer>
	<h3>HRD KOREA</h3>
</footer>
</body>
</html>
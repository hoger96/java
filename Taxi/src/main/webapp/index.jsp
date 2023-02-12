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
	<h2>택시콜 현황 프로그램 ver 1.0</h2>
</header>
<nav>
	<ol>
		<li><a href="<%=path%>/reg">택시예약</a></li>
		<li><a href="<%=path%>/update">택시수정</a></li>
		<li><a href="<%=path%>/list">택시현황</a></li>
		<li><a href="index.jsp">홈으로</a></li>
	</ol>
</nav>
<section>
	<caption>택시예약 프로그램을 작성할 수 있다.</caption>
	<ol>
		<li>택시예약 테이블을 작성할 수 있다</li>
		<li>택시예약을 할 수 있도록 구현한다</li>
		<li>주어진 화면 디자인을 이용하여 화면을 디자인한다</li>
		<li>업무요건에 대해 프로그램을 작성한다</li>
	</ol>
</section>
<footer>
	<h3>HRD KOREA</h3>
</footer>
</body>
</html>
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
<header><h1>HY투표관리 ver1.0</h1></header>
<nav>
	<ol>
		<li><a href="<%=path%>/memberlist">후보자조회</a></li>
		<li><a href="<%=path%>/reg">투표등록</a></li>
		<li><a href="<%=path%>/voterlist">투표자조회</a></li>
		<li><a href="<%=path%>/voterank">득표조회</a></li>
		<li><a href="index.jsp">홈으로</a></li>
	</ol>
</nav>
<section>
	<h3>투표관리 프로그램</h3>
	<caption>투표관리하기 위한 프로그램이다</caption>
	<ol>
		<li>내용작성</li>
		<li>내용작성</li>
		<li>내용작성</li>
	</ol>
</section>
<footer><h3>HRD KOREA</h3></footer>
</body>
</html>
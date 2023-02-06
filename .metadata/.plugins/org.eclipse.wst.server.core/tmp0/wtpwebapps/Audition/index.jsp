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
<header>HY라우드 오디션 VER 1.0</header>
<nav>
	<ol>
		<li><a href="<%=path%>/reg.go">참가자등록</a></li>
		<li><a href="<%=path%>/list.go">참가자목록 조회</a></li>
		<li><a href="<%=path%>/score.go">참가자점수 조회</a></li>
		<li><a href="<%=path%>/rank.go">참가자등수 조회</a></li>
		<li><a href="index.jsp">홈으로</a></li>
	</ol>
</nav>
<section>
	<h2>오디션관리 프로그램</h2>
	<p>오디션을 위한 프로그램이다</p>
	<ol>
		<li>내용작성</li>
		<li>내용작성</li>
		<li>내용작성</li>
	</ol>
</section>
<footer>HRD KOREA</footer>
</body>
</html>
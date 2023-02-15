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
	<h2>학생 성적 관리</h2>
</header>
<nav>
	<ol>
		<li><a href="<%=path%>/studentlist">학생조회</a></li>
		<li><a href="<%=path%>/reg">학생성적등록</a></li>
		<li><a href="<%=path%>/scorelist">학생성적조회</a></li>
		<li><a href="index.jsp">홈으로</a></li>
	</ol>
</nav>
<section>
</section>
<footer>
	<h3>HRD KOREA</h3>
</footer>
</body>
</html>
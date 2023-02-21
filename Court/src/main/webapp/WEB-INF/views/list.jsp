<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.CourtDto" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	String path = request.getContextPath();
	CourtDto dto = (CourtDto)request.getAttribute("dto");
%>
<link href="<%=path %>/css/index.css" rel="stylesheet">
<link href="<%=path %>/css/list.css" rel="stylesheet">
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
<table>
	<caption><%=dto.getCust_no() %>님의 코트예약조회</caption>
	<tr>
		<td class="main">고객번호</td>
		<td class="main">고객이름</td>
		<td class="main">예약날짜</td>
		<td class="main">코트번호</td>
		<td class="main">전화번호</td>
	</tr>
	<tr>
		<td><%=dto.getCust_no() %></td>
		<td><%=dto.getCust_name() %></td>
		<td><%=dto.getResv_date() %></td>
		<td><%=dto.getCourt_no() %></td>
		<td><%=dto.getTel() %></td>
	</tr>
</table>
<div class="btn">
	<input type="button" value="돌아가기" onclick="window.location.href='<%=path%>/list'">
</div>
</section>
<footer><h3>HRD KOREA</h3></footer>
</body>
</html>
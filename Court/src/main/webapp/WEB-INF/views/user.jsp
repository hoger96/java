<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.UserDto" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	String path = request.getContextPath();
	ArrayList<UserDto> list = (ArrayList<UserDto>)request.getAttribute("list");
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
	<caption>사용자별 횟수 조회</caption>
	<tr>
		<td class="main">고객번호</td>
		<td class="main">고객이름</td>
		<td class="main">횟수</td>
	</tr>
	<%for(int i=0; i<list.size(); i++) {%>
	<tr>
		<td><%=list.get(i).getCust_no() %></td>
		<td><%=list.get(i).getCust_name() %></td>
		<td><%=list.get(i).getCount() %></td>
	</tr>
	<%} %>
</table>
</section>
<footer><h3>HRD KOREA</h3></footer>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import="model.VoterListDto" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	String path = request.getContextPath();
	ArrayList<VoterListDto> list = (ArrayList<VoterListDto>)request.getAttribute("list");
%>
<link href="<%=path %>/css/index.css" rel="stylesheet">
<link href="<%=path %>/css/list.css" rel="stylesheet">
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
	<table>
		<caption>투표자 조회</caption>
		<tr>
			<td class="main">투표자이름</td>
			<td class="main">투표자생년월일</td>
			<td class="main">투표자나이</td>
			<td class="main">투표자성별</td>
			<td class="main">투표장</td>
			<td class="main">유권자확인</td>
		</tr>
		<%for(int i=0; i<list.size(); i++) { %>
		<tr>
			<td><%=list.get(i).getV_name() %></td>
			<td><%=list.get(i).getV_jumin()%></td>
			<td><%=list.get(i).getAge() %></td>
			<td><%=list.get(i).getGender() %></td>
			<td><%=list.get(i).getV_area() %></td>
			<td><%=list.get(i).getV_confirm() %></td>
		</tr>
		<% } %>
	</table>
</section>
<footer><h3>HRD KOREA</h3></footer>
</body>
</html>
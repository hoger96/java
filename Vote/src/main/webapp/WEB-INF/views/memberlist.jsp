<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import="model.MemberDto" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	String path = request.getContextPath();
	ArrayList<MemberDto> list = (ArrayList<MemberDto>)request.getAttribute("list");
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
		<caption>후보자 조회</caption>
		<tr>
			<td class="main">후보자번호</td>
			<td class="main">후보이름</td>
			<td class="main">후보자주민번호</td>
			<td class="main">후보자학위</td>
			<td class="main">당번호</td>
			<td class="main">당전화번호</td>
		</tr>
		<%for(int i=0; i<list.size(); i++) { %>
		<tr>
			<td><%=list.get(i).getN_no() %></td>
			<td><%=list.get(i).getN_name()%></td>
			<td><%=list.get(i).getN_jumin() %></td>
			<td><%=list.get(i).getN_degree() %></td>
			<td><%=list.get(i).getP_no()%></td>
			<td><%=list.get(i).getP_tel() %></td>
		</tr>
		<% } %>
	</table>
</section>
<footer><h3>HRD KOREA</h3></footer>
</body>
</html>
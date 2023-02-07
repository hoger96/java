<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import="model.ScoreListDto" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	String path = request.getContextPath();
	ArrayList<ScoreListDto> list = (ArrayList<ScoreListDto>)request.getAttribute("list");
%>
<link href="<%=path %>/css/index.css" rel="stylesheet">
<link href="<%=path %>/css/list.css" rel="stylesheet">
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
	<table>
		<caption>참가자점수 조회</caption>
		<tr>
			<td class="main">채점번호</td>
			<td class="main">참가자ID</td>
			<td class="main">참가자이름</td>
			<td class="main">생년월일</td>
			<td class="main">점수</td>
			<td class="main">등급</td>
			<td class="main">멘토이름</td>
		</tr>
		<%for(int i=0; i<list.size(); i++) {%>
		<tr>
			<td><%=list.get(i).getScore_no() %></td>
			<td><%=list.get(i).getJoin_id() %></td>
			<td><%=list.get(i).getJoin_nm() %></td>
			<td><%=list.get(i).getBirth() %></td>
			<td><%=list.get(i).getScore()%></td>
			<td><%=list.get(i).getGrade()%></td>
			<td><%=list.get(i).getMentor_nm()%></td>
		</tr>
		<%} %>
	</table>
</section>
<footer>HRD KOREA</footer>
</body>
</html>
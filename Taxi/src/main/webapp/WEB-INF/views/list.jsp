<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import="model.ListDto" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	String path = request.getContextPath();
	ArrayList<ListDto> list = (ArrayList<ListDto>)request.getAttribute("list");
%>
<link href="<%=path %>/css/index.css" rel="stylesheet">
<link href="<%=path %>/css/list.css" rel="stylesheet">
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
	<table>
		<caption>택시 호출 현황</caption>
		<tr>
			<td class="main">고객전화번호</td>
			<td class="main">예약번호</td>
			<td class="main">예약시간(시/분)</td>
			<td class="main">예약날짜(년/월/일)</td>
			<td class="main">고객명</td>
			<td class="main">출발지</td>
			<td class="main">목적지</td>
			<td class="main">택시번호</td>
			<td class="main">상태</td>
			<td class="main">비고</td>
		</tr>
		<%for(int i=0; i<list.size(); i++){ %>
		<tr>
			<td><%=list.get(i).getTel() %></td>
			<td><%=list.get(i).getRegno() %></td>
			<td><%=list.get(i).getRegtime() %></td>
			<td><%=list.get(i).getRegdate() %></td>
			<td><%=list.get(i).getName() %></td>
			<td><%=list.get(i).getStartpoint()%></td>
			<td><%=list.get(i).getDestination() %></td>
			<td><%=list.get(i).getTaxino() %></td>
			<td><%=list.get(i).getState() %></td>
			<td>
				<a href="<%=path%>/update?regno=<%=list.get(i).getRegno()%>">수정</a> / 
				<a href="<%=path%>/delete?regno=<%=list.get(i).getRegno()%>">삭제</a>
			</td>
		</tr>
		<%} %>
	</table>
</section>
<footer>
	<h3>HRD KOREA</h3>
</footer>
</body>
</html>
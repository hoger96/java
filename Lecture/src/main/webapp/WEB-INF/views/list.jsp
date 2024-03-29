<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.*" %>
<%@ page import = "java.sql.*" %>
<%@ page import = "model.ListDto" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	String path = request.getContextPath();
	ArrayList<ListDto> list = (ArrayList<ListDto>)request.getAttribute("list");
%>
<link href="<%=path %>/css/list.css" rel="stylesheet">
<link href="<%=path %>/css/index.css" rel="stylesheet">
</head>
<body>
	<header>
		<h1>연습</h1>
	</header>
	<nav>
		<ol>
			<li><a href="<%=path %>/list">조회</a></li>
			<li><a href="<%=path %>/reg">등록</a></li>
		</ol>
	</nav>
	<section>
		<table>
			<caption>
				<h2>참가자 조회</h2>
			</caption>
			<tr>	
				<td class="main">과목코드</td>
				<td class="main">과목명</td>
				<td class="main">학점</td>
				<td class="main">담당강사</td>
				<td class="main">요일</td>
				<td class="main">시작시간</td>
				<td class="main">종료시간</td>
				<td class="main">관리</td>
			</tr>
			<% for(int i=0; i<list.size(); i++) {%>
			<tr>
				<td><%=list.get(i).getS_id()%></td>
				<td><%=list.get(i).getS_name()%></td>
				<td><%=list.get(i).getS_grade()%></td>
				<td><%=list.get(i).getT_name()%></td>
				<td><%=list.get(i).getWeekday()%></td>
				<td><%=list.get(i).getStart_h()%></td>
				<td><%=list.get(i).getEnd_h()%></td>
				<td>
					<a class="btn" href="<%=path %>/modify?s_id=<%=list.get(i).getS_id() %>">수정</a>/
					<a class="btn" href="<%=path %>/delete?s_id=<%=list.get(i).getS_id()%>">삭제</a></td>
			</tr>
			<%} %>
		</table>
	</section>
	<footer>
		hi
	</footer>
</body>
</html>
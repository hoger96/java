<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import="model.StudentDto" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	String path = request.getContextPath();
	ArrayList<StudentDto> list = (ArrayList<StudentDto>)request.getAttribute("list");
%>
<link href="<%=path %>/css/index.css" rel="stylesheet">
<link href="<%=path %>/css/list.css" rel="stylesheet">
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
	<table>
		<caption><h3>학생조회</h3></caption>
		<tr>
			<td class="main">학번</td>
			<td class="main">이름</td>
			<td class="main">학년</td>
			<td class="main">반</td>
			<td class="main">번호</td>
			<td class="main">성별</td>
		</tr>
		<%for(int i=0; i<list.size(); i++) {%>
		<tr>
			<td><%=list.get(i).getId() %></td>
			<td><%=list.get(i).getName()%></td>
			<td><%=list.get(i).getGrade() %></td>
			<td><%=list.get(i).getWclass()%></td>
			<td><%=list.get(i).getNum() %></td>
			<td><%=list.get(i).getGender() %></td>
		</tr>
		<%} %>
	</table>
</section>
<footer>
	<h3>HRD KOREA</h3>
</footer>
</body>
</html>
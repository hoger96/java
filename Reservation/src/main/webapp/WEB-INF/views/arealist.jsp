<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.AreaDto" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	String path = request.getContextPath();
	ArrayList<AreaDto> list = (ArrayList<AreaDto>)request.getAttribute("list");
%>
<link href="<%=path %>/css/index.css" rel="stylesheet">
<link href="<%=path %>/css/list.css" rel="stylesheet">
</head>
<body>
<header>
	<h2>백신예약 및 접종 조회 프로그램</h2>
</header>
<nav>
	<ol>
		<li><a href="<%=path%>/reg">백신예약</a></li>
		<li><a href="<%=path%>/look">백신 접종 조회</a></li>
		<li><a href="<%=path%>/area">백신 지역별 접종 횟수 조회</a></li>
		<li><a href="<%=path%>/list">백신 접종 현황</a></li>
		<li><a href="<%=path%>/reg">홈으로</a></li>
	</ol>
</nav>
<section>
<table>
	<caption>지역별 백신예약 인원수</caption>
	<tr>
		<td class="main">지역</td>
		<td class="main">인원수</td>
	</tr>
	<%for( int i=0; i<list.size(); i++ ) {%>
	<tr>
		<td><%=list.get(i).getRegion()%></td>
		<td><%=list.get(i).getCount()%></td>
	</tr>
	<%} %>
</table>
</section>
<footer>
	<h3>HRD KOREA</h3>
</footer>
</body>
</html>
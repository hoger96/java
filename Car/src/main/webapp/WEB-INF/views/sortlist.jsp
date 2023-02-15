<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import="model.SortDto" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	String path = request.getContextPath();	
	ArrayList<SortDto> list = (ArrayList<SortDto>)request.getAttribute("list");
%>
<link href="<%=path %>/css/index.css" rel="stylesheet">
<link href="<%=path %>/css/list2.css" rel="stylesheet">

</head>
<body>
<header><h1>중고차 판매 ver1.0</h1></header>
<nav>
	<ol>
		<li><a href="<%=path%>/newreg">중고차 신규 등록</a></li>
		<li><a href="<%=path%>/sellreg">차량 판매 등록</a></li>
		<li><a href="<%=path%>/update">차량 체크사항 등록</a></li>
		<li><a href="<%=path%>/saleon">차량 체크사항 현황</a></li>
		<li><a href="<%=path%>/saleoff">중고차 판매 현황</a></li>
		<li><a href="<%=path%>/sortsale">차량종류별 판매 현황</a></li>
		<li><a href="index.jsp">홈으로</a></li>
	</ol>
</nav>
<section>
	<table>
		<caption>차량종류별 판매현황</caption>
		<tr>
			<td class="main">차량종류</td>
			<td class="main">판매금액</td>
		</tr>
		<%for(int i=0; i<list.size(); i++) { %>
			<tr>
				<td><%=list.get(i).getC_class()%></td>
				<td><%=list.get(i).getB_cost() %></td>
			</tr>
		<%} %>
	</table>
</section>
<footer><h3>HRD KOREA</h3></footer>
</body>
</html>
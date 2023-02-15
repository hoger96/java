<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import="model.SoldoutDto" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	String path = request.getContextPath();	
	ArrayList<SoldoutDto> list = (ArrayList<SoldoutDto>)request.getAttribute("list");
%>
<link href="<%=path %>/css/index.css" rel="stylesheet">
<link href="<%=path %>/css/list.css" rel="stylesheet">

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
		<caption>중고차 판매 현황</caption>
		<tr>
			<td class="main">구매자아이디</td>
			<td class="main">구매자이름</td>
			<td class="main">구매차량코드</td>
			<td class="main">구매가격</td>
			<td class="main">할부개월</td>
			<td class="main">월 할부금</td>
		</tr>
		<%for(int i=0; i<list.size(); i++) { %>
			<tr>
				<td><%=list.get(i).getB_id()%></td>
				<td><%=list.get(i).getB_name() %></td>
				<td><%=list.get(i).getB_code() %></td>
				<td><%=list.get(i).getB_cost() %></td>
				<td><%=list.get(i).getB_month() %></td>
				<td><%=list.get(i).getB_money() %></td>
			</tr>
		<%} %>
	</table>
</section>
<footer><h3>HRD KOREA</h3></footer>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="model.SaleDto" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	String path = request.getContextPath();
	SaleDto dto = (SaleDto)request.getAttribute("dto");
%>
<link href="<%=path %>/css/index.css" rel="stylesheet">
<link href="<%=path %>/css/list.css" rel="stylesheet">
</head>
<body>
<header>
	<h2>매장별 커피 판매관리 ver 1.0</h2>
</header>
<nav>
	<ol>
		<li><a href="<%=path%>/reg">판매등록</a></li>
		<li><a href="<%=path%>/salelist">판매현황</a></li>
		<li><a href="<%=path%>/storelist">매장별판매액</a></li>
		<li><a href="<%=path%>/productlist">상품별판매액</a></li>
		<li><a href="<%=path%>/info">판매정보조회</a></li>
		<li><a href="index.jsp">홈으로</a></li>
	</ol>
</nav>
<section>
	<table>
		<caption>판매현황</caption>
		<tr>
			<td class="main">비번호</td>
			<td class="main">상품코드</td>
			<td class="main">판매날짜</td>
			<td class="main">매장코드</td>
			<td class="main">상품명</td>
			<td class="main">판매수량</td>
			<td class="main">총판매액</td>
		</tr>
		<tr>	
			<td><%=dto.getSaleno() %></td>
			<td><%=dto.getPcode() %></td>
			<td><%=dto.getSaledate() %></td>
			<td><%=dto.getScode() %></td>
			<td><%=dto.getName() %></td>
			<td><%=dto.getAmount() %></td>
			<td><%=dto.getCost() %></td>
		</tr>
	</table>
</section>
<footer>
	<h3>Copyright @ 2023 All right reserved Acorn</h3>
</footer>
</body>
</html>
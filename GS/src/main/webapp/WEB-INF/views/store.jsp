<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="model.StoreDto" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	String path = request.getContextPath();
	ArrayList<StoreDto> list = (ArrayList<StoreDto>)request.getAttribute("list");
%>
<link href="<%=path %>/css/index.css" rel="stylesheet">
<link href="<%=path %>/css/list.css" rel="stylesheet">
</head>
<body>
<header><h2>한양 GS 매출관리 ver 1.0</h2></header>
<nav>
	<ol>
		<li><a href="<%=path%>/reg">매출등록</a></li>
		<li><a href="<%=path%>/productlist">상품관리</a></li>
		<li><a href="<%=path%>/storelist">매출현황</a></li>
		<li><a href="index.jsp">홈으로</a></li>
	</ol>
</nav>
<section>
<table>
	<caption>상품목록</caption>
	<tr>
		<td class="main">점포명</td>
		<td class="main">현금매출</td>
		<td class="main">카드매출</td>
		<td class="main">총매출</td>
	</tr>
	<% for(int i=0; i<list.size(); i++) { %>
	<tr>
		<td><a href="<%=path%>/sale?store_nm=<%=list.get(i).getStore_nm() %>"><%=list.get(i).getStore_nm() %></a></td>
		<td><%=list.get(i).getCash() %></td>
		<td><%=list.get(i).getCard()%></td>
		<td><%=list.get(i).getTotal() %></td>
	</tr>
	<% } %>
</table>
</section>
<footer><h3>HRD KOREA</h3></footer>
</body>
</html>
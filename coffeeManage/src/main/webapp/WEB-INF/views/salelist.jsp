<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import="model.SaleDto" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	String path = request.getContextPath();
	ArrayList<SaleDto> list = (ArrayList<SaleDto>)request.getAttribute("list");
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
		<li><a href="<%=path%>/objectlist">상품별판매액</a></li>
		<li><a href="<%=path%>/infolist">판매정보조회</a></li>
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
		<td class="main">비고</td>
	</tr>
	<%for(int i=0; i<list.size(); i++) { %>
		<tr>
			<td><%=list.get(i).getSaleno()%></td>
			<td><%=list.get(i).getPcode()%></td>
			<td><%=list.get(i).getSaledate()%></td>
			<td><%=list.get(i).getScode()%></td>
			<td><%=list.get(i).getName()%></td>
			<td><%=list.get(i).getAmount()%></td>
			<td><%=list.get(i).getTotal()%></td>
			<td>
				<a href="<%=path %>/update?saleno=<%=list.get(i).getSaleno()%>">수정</a>/
				<a href="<%=path %>/delete?saleno=<%=list.get(i).getSaleno()%>">삭제</a>
			</td>
		</tr>
	<%} %>
</table>
</section>
<footer>
<h3>Copyright @ 2023 All right reserved Acorn</h3>
</footer>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import="model.SaleonDto" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	String path = request.getContextPath();	
	ArrayList<SaleonDto> list = (ArrayList<SaleonDto>)request.getAttribute("list");
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
		<caption>중고차 보유 현황</caption>
		<tr>
			<td class="main">차량코드</td>
			<td class="main">타이어체크</td>
			<td class="main">인테리어체크</td>
			<td class="main">엔진룸체크</td>
			<td class="main">시동체크</td>
			<td class="main">외관체크</td>
			<td class="main">비고</td>
		</tr>
		<%for(int i=0; i<list.size(); i++) { %>
			<tr>
				<td><%=list.get(i).getL_code() %></td>
				<td><%=list.get(i).getL_tire() %></td>
				<td><%=list.get(i).getL_int() %></td>
				<td><%=list.get(i).getL_egr() %></td>
				<td><%=list.get(i).getL_run() %></td>
				<td><%=list.get(i).getL_sc() %></td>
				<td><a href="<%=path %>/update?l_code=<%=list.get(i).getL_code()%>">수정</a></td>
			</tr>
		<%} %>
	</table>
</section>
<footer><h3>HRD KOREA</h3></footer>
</body>
</html>
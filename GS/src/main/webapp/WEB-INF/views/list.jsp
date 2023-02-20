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
	ArrayList<SaleDto> list = (ArrayList<SaleDto>)request.getAttribute("list");
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
		<td class="main">판매구분</td>
		<td class="main">판매번호</td>
		<td class="main">판매일자</td>
		<td class="main">상품명</td>
		<td class="main">판매수량</td>
		<td class="main">판매금액</td>
		<td class="main">수취구분</td>
	</tr>
	<%for(int i=0; i<list.size(); i++){ %>
	<tr>
		<td><%=list.get(i).getSale_fg() %></td>
		<td><%=list.get(i).getSale_no() %></td>
		<td><%=list.get(i).getIn_date() %></td>
		<td><%=list.get(i).getGoods_nm() %></td>
		<td><%=list.get(i).getSale_cnt() %></td>
		<td><%=list.get(i).getPrice() %></td>
		<td><%=list.get(i).getPay_type() %></td>
	</tr>
	<%} %>
</table>
</section>
<footer><h3>HRD KOREA</h3></footer>
</body>
</html>
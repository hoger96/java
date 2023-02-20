<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="model.GoodsDto" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	String path = request.getContextPath();
	ArrayList<GoodsDto> list = (ArrayList<GoodsDto>)request.getAttribute("list");
%>
<link href="<%=path %>/css/index.css" rel="stylesheet">
<link href="<%=path %>/css/list.css" rel="stylesheet">
<script>
function reg(){
	window.location.href="<%=path%>/reg"
}
</script>
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
		<td class="main">상품코드</td>
		<td class="main">상품명</td>
		<td class="main">판매단가</td>
		<td class="main">(상품)원가</td>
		<td class="main">입고일자</td>
	</tr>
	<%for(int i=0; i<list.size(); i++){ %>
	<tr>
		<td><a href="<%=path%>/update?goods_cd=<%=list.get(i).getGoods_cd() %>"><%=list.get(i).getGoods_cd() %></a></td>
		<td><%=list.get(i).getGoods_nm()%></td>
		<td><%=list.get(i).getPrice() %></td>
		<td><%=list.get(i).getCose() %></td>
		<td><%=list.get(i).getIn_date() %></td>
	</tr>
	<%} %>
	<tr>
		<td class="main" colspan="5">
			<input type="button" value="등록" onclick="reg()">
		</td>
	</tr>
</table>
</section>
<footer><h3>HRD KOREA</h3></footer>
</body>
</html>
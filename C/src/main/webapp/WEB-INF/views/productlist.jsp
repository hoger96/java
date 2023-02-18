<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="model.ProductDto" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	String path = request.getContextPath();
	ArrayList<ProductDto> list = (ArrayList<ProductDto>)request.getAttribute("list");
%>
<link href="<%=path %>/css/index.css" rel="stylesheet">
<link href="<%=path %>/css/list2.css" rel="stylesheet">
<script>
	function save(){
		let frm = document.frm;
		if(frm.pcode.value == ""){
			alert("상품코드를 입력하세요");
			frm.pcode.focus();
		}else if(frm.scode.value == ""){
			alert("매장코드를 입력하세요");
			frm.scode.focus();
		}else if(frm.amount.value == ""){
			alert("판매수량을 입력하세요");
			frm.amount.focus();
		}else{
			alert("성공");
			frm.submit();
		}
	}
</script>
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
		<caption>상품별판매액</caption>
		<tr>
			<td class="main">상품코드</td>
			<td class="main">상품명</td>
			<td class="main">상품별 판매액</td>
		</tr>
		<%for(int i=0; i<list.size(); i++) {%>
		<tr>
			<td><%=list.get(i).getPcode() %></td>
			<td><%=list.get(i).getPname() %></td>
			<td><%=list.get(i).getCost() %></td>
		</tr>
		<%} %>
	</table>
</section>
<footer>
	<h3>Copyright @ 2023 All right reserved Acorn</h3>
</footer>
</body>
</html>
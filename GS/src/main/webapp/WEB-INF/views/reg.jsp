<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.SeqDto" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	String path = request.getContextPath();
	SeqDto dto = (SeqDto)request.getAttribute("dto");
%>
<link href="<%=path %>/css/index.css" rel="stylesheet">
<link href="<%=path %>/css/reg.css" rel="stylesheet">
<script>
function save(){
	frm.submit();
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
<form name="frm" method="post" action="<%=path %>/reg">
<table>
	<caption>상품 정보 등록</caption>
	<tr>
		<td class="main">상품코드(자동순번)</td>
		<td><input type="text" name="goods_cd" value="<%=dto.getSeq()%>"></td>
	</tr>
	<tr>
		<td class="main">상품명</td>
		<td><input type="text" name="goods_nm"></td>
	</tr>
	<tr>
		<td class="main">단가</td>
		<td><input type="text" name="price"></td>
	</tr>
	<tr>
		<td class="main">원가</td>
		<td><input type="text" name="cose"></td>
	</tr>
	<tr>
		<td class="main">입고일자(자동세팅)</td>
		<td><input type="text" name="in_date"></td>
	</tr>
	<tr>
		<td class="main" colspan="2">
			<input type="button" value="저장" onclick="save()">
			<input type="button" value="상품목록" onclick="window.location.href='<%=path %>/productlist'">
 		</td>
	</tr>
</table>
</form>
</section>
<footer><h3>HRD KOREA</h3></footer>
</body>
<script>
let today = new Date();
let year = today.getFullYear();
let month = ("0" + (today.getMonth()+1)).slice(-2);
let date = ("0" + today.getDate()).slice(-2);
let day = year + month + date;
document.frm.in_date.value = day;
</script>
</html>
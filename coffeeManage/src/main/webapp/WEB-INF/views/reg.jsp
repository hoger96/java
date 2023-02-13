<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.SequenceDto" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	String path = request.getContextPath();
	SequenceDto dto = (SequenceDto)request.getAttribute("dto");
%>
<link href="<%=path %>/css/index.css" rel="stylesheet">
<link href="<%=path %>/css/reg.css" rel="stylesheet">
<script>
function save(){
	let frm = document.frm;
	
	if(frm.pcode.value == ""){
		alert("입력하세요");
		frm.pcode.focus();
	}else{
		frm.submit();
		alert("성공");
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
		<li><a href="<%=path%>/objectlist">상품별판매액</a></li>
		<li><a href="<%=path%>/infolist">판매정보조회</a></li>
		<li><a href="index.jsp">홈으로</a></li>
	</ol>
</nav>
<section>
<form name="frm" method="post" action="<%=path%>/reg">
<table>
	<caption>판매등록</caption>
	<tr>
		<td class="main">비번호</td>
		<td><input type="text" name="saleno" value="<%=dto.getSequence() %>"></td>
	</tr>
	<tr>
		<td class="main">상품코드</td>
		<td><input type="text" name="pcode"></td>
	</tr>
	<tr>
		<td class="main">판매날짜</td>
		<td><input type="text" name="saledate"></td>
	</tr>
	<tr>
		<td class="main">매장코드</td>
		<td><input type="text" name="scode"></td>
	</tr>
	<tr>
		<td class="main">판매수량</td>
		<td><input type="text" name="amount"></td>
	</tr>
	<tr>
		<td class="main" colspan="2">
			<input type="button" value="등록" onclick="save()">
			<input type="reset" value="다시쓰기">
		</td>
	</tr>
</table>
</form>
</section>
<footer>
<h3>Copyright @ 2023 All right reserved Acorn</h3>
</footer>
</body>
<script>
let today = new Date();
let year = today.getFullYear();
let month = ("0" + (today.getMonth()+1)).slice(-2);
let date = ("0" + (today.getDate())).slice(-2);
let day = year + month + date;
document.frm.saledate.value = day;
</script>
</html>
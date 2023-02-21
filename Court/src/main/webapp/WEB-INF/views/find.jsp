<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	String path = request.getContextPath();
%>
<script>
function find(){
	let frm = document.frm;
	if(frm.cust_no.value == ""){
		alert("고객번호를 입력하세요");
		frm.cust_no.focus();
	}else{
		alert("조회");
		frm.submit();
	}
}
</script>
<link href="<%=path %>/css/index.css" rel="stylesheet">
<link href="<%=path %>/css/reg.css" rel="stylesheet">
</head>
<body>
<header><h2>코트 예약 관리</h2></header>
<nav>
	<ol>
		<li><a href="<%=path%>/reg">코트예약</a></li>
		<li><a href="<%=path%>/list">코트예약조회</a></li>
		<li><a href="<%=path%>/user">사용자별조회</a></li>
		<li><a href="index.jsp">홈으로</a></li>
	</ol>
</nav>
<section>
<form name="frm" method="post" action="<%=path %>/list">
<table>
	<caption>코트예약조회</caption>
	<tr>
		<td class="main">고객번호를 입력하시오</td>
		<td><input type="text" name="cust_no"></td>
	</tr>
	<tr>
		<td class="main" colspan="2">
			<input type="button" value="조회" onclick="find()">
		</td>
	</tr>
</table>
</form>
</section>
<footer><h3>HRD KOREA</h3></footer>
</body>
</html>
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
<link href="<%=path %>/css/index.css" rel="stylesheet">
<link href="<%=path %>/css/reg.css" rel="stylesheet">
<script>
function save(){
	let frm = document.frm;
	if(frm.resv_no.value == ""){
		alert("예약번호를 입력하세요");
		frm.resv_no.focus();
	}else if(frm.cust_no.value == ""){
		alert("고객번호를 입력하세요");
		frm.cust_no.focus();
	}else if(frm.resv_date.value == ""){
		alert("예약날짜를 입력하세요");
		frm.resv_date.focus();
	}else if(frm.court_no.value == ""){
		alert("코트번호를 입력하세요");
		frm.court_no.focus();
	}else{
		alert("등록을 성공하였습니다.");
		frm.submit();
	}
}

function re(){
	let frm = document.frm;
	alert("내용을 지우겠습니다");
	frm.reset();
}
</script>
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
<form name="frm" method="post" action="<%=path %>/reg">
<table>
	<caption>코트예약</caption>
	<tr>
		<td class="main">예약번호</td>
		<td><input type="text" name="resv_no"></td>
		<td><p>예)20230001</p></td>
	</tr>
	<tr>
		<td class="main">고객번호</td>
		<td><input type="text" name="cust_no"></td>
		<td><p>예)1001</p></td>
	</tr>
	<tr>
		<td class="main">예약날짜</td>
		<td><input type="text" name="resv_date"></td>
		<td><p>예)20230221</p></td>
	</tr>
	<tr>
		<td class="main">코트번호</td>
		<td><input type="text" name="court_no"></td>
		<td><p>예)C001~C009</p></td>
	</tr>
	<tr>
		<td class="main" colspan="3">
			<input type="button" value="등록" onclick="save()">
			<input type="button" value="다시쓰기" onclick="re()">
		</td>
	</tr>
</table>
</form>
</section>
<footer><h3>HRD KOREA</h3></footer>
</body>
</html>
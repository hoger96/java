<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.RegDto" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	String path = request.getContextPath();
	RegDto dto = (RegDto)request.getAttribute("dto");
%>
<link href="<%=path %>/css/index.css" rel="stylesheet">
<link href="<%=path %>/css/reg.css" rel="stylesheet">
<script>
function save(){

	if(document.frm.pcode.value == ""){
		alert("상품코드를 입력하세요");
		document.frm.pcode.focus();
	}else if(document.frm.scode.value == ""){
		alert("상점코드를 입력하세요");
		document.frm.scode.focus();
	}else{
		alert("등록성공");
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
		<li><a href="<%=path%>/objectlist">상품별판매액</a></li>
		<li><a href="<%=path%>/infolist">판매정보조회</a></li>
		<li><a href="index.jsp">홈으로</a></li>
	</ol>
</nav>
<section>
<form name="frm" method="post" action="<%=path%>/update">
<table>
	<caption>판매수정</caption>
	<tr>
		<td class="main">비번호</td>
		<td><input type="text" name="saleno" value="<%=dto.getSaleno()%>"></td>
	</tr>
	<tr>
		<td class="main">상품코드</td>
		<td><input type="text" name="pcode" value="<%=dto.getPcode()%>"></td>
	</tr>
	<tr>
		<td class="main">판매날짜</td>
		<td><input type="text" name="saledate" value="<%=dto.getSaledate()%>"></td>
	</tr>
	<tr>
		<td class="main">매장코드</td>
		<td><input type="text" name="scode" value="<%=dto.getScode()%>"></td>
	</tr>
	<tr>
		<td class="main">판매수량</td>
		<td><input type="text" name="amount" value="<%=dto.getAmount()%>"></td>
	</tr>
	<tr>
		<td class="main" colspan="2">
			<input type="button" onclick="save()" value="수정">
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
</html>
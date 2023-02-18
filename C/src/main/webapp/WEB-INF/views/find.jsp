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
%>
<link href="<%=path %>/css/index.css" rel="stylesheet">
<link href="<%=path %>/css/reg.css" rel="stylesheet">
<script>
	function find(){
		let frm = document.frm;
		if(frm.saleno.value == ""){
			alert("비번호를 입력하세요");
			frm.saleno.focus();
		}else{
			alert("조회");
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
<form name="frm" method="post" action="<%=path %>/info">
	<table>
		<caption>판매정보조회</caption>
		<tr>
			<td class="main">비번호</td>
			<td><input type="text" name="saleno"></td>
		</tr>
		<tr>
			<td class="main" colspan="2">
				<input type="button" onclick="find()" value="조회">
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
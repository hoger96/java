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
<link href="<%=path %>/css/find.css" rel="stylesheet">
<script>
function find(){
	let frm = document.frm;
	
}
</script>
</head>
<body>
<header>
	<h2>백신예약 및 접종 조회 프로그램</h2>
</header>
<nav>
	<ol>
		<li><a href="<%=path%>/reg">백신예약</a></li>
		<li><a href="<%=path%>/look">백신 접종 조회</a></li>
		<li><a href="<%=path%>/area">백신 지역별 접종 횟수 조회</a></li>
		<li><a href="<%=path%>/list">백신 접종 현황</a></li>
		<li><a href="<%=path%>/reg">홈으로</a></li>
	</ol>
</nav>
<section>
<form name="frm" method="post" action="<%=path %>/look">
	<table>
		<tr>
			<td>예약번호를 입력하세요</td>
		</tr>
		<tr>
			<td><input type="text" name="rev_id"></td>
		</tr>
		<tr>
			<td class="main">
				<input type="button" onclick="find()" value="확인">
				<input type="reset" value="취소">
			</td>
		</tr>
	</table>
</form>
</section>
<footer>
	<h3>HRD KOREA</h3>
</footer>
</body>
</html>
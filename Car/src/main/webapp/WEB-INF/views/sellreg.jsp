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
		frm.submit();
	}
</script>
</head>
<body>
<header><h1>중고차 판매 ver1.0</h1></header>
<nav>
	<ol>
		<li><a href="<%=path%>/newreg">중고차 신규 등록</a></li>
		<li><a href="<%=path%>/sellreg">차량 판매 등록</a></li>
		<li><a href="<%=path%>/update">차량 체크사항 등록</a></li>
		<li><a href="<%=path%>/saleon">차량 체크사항 현황</a></li>
		<li><a href="<%=path%>/saleoff">중고차 판매 현황</a></li>
		<li><a href="<%=path%>/sortsale">차량종류별 판매 현황</a></li>
		<li><a href="index.jsp">홈으로</a></li>
	</ol>
</nav>
<section>
	<form name="frm" method="post" action="sellreg">
	<table>
		<caption>중고차 판매 등록</caption>
		<tr>
			<td>구매자아이디</td>
			<td><input type="text" name="b_id"></td>
		</tr>
		<tr>
			<td>구매자이름</td>
			<td><input type="text" name="b_name"></td>
		</tr>
		<tr>
			<td>차량코드</td>
			<td>
				<select name="b_code">
					<option value="20220001">20220001</option>
					<option value="20220002">20220002</option>
					<option value="20220003">20220003</option>
					<option value="20220004">20220004</option>
					<option value="20220005">20220005</option>
					<option value="20220006">20220006</option>
					<option value="20220007">20220007</option>
					<option value="20220008">20220008</option>
					<option value="20220009">20220009</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>구매가격</td>
			<td><input type="text" name="b_cost"></td>
		</tr>
		<tr>
			<td>할부</td>
			<td><input type="text" name="b_month"></td>
		</tr>
		<tr>
			<td colspan="2" class="btn">
				<button onclick="save()">등록</button>
				<button onclick="window.location.href='index.jsp'">취소</button>
			</td>
		</tr>
	</table>
	</form>
</section>
<footer><h3>HRD KOREA</h3></footer>
</body>
</html>
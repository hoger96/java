<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.CheckDto" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	String path = request.getContextPath();
	CheckDto dto = (CheckDto)request.getAttribute("dto");
%>
<link href="<%=path %>/css/index.css" rel="stylesheet">
<link href="<%=path %>/css/reg2.css" rel="stylesheet">
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
	<form name="frm" method="post" action="update">
	<table>
		<tr>
			<td class="main">차량코드</td>
			<td>
				<input type="text" name="l_code" value="<%=dto.getL_code() %>">
			</td>
		</tr>
		<tr>
			<td class="main">타이어체크</td>
			<td>
				<select name="l_tire" value="<%=dto.getL_tire() %>">
					<option value="1">이상무</option>
					<option value="2">교체필요</option>
				</select>
			</td>
		</tr>
		<tr>
			<td class="main">인테리어체크</td>
			<td>
				<select name="l_int">
					<option value="1">이상무</option>
					<option value="2">교체필요</option>
				</select>
			</td>
		</tr>
		<tr>
			<td class="main">엔진룸체크</td>
			<td>
				<select name="l_egr">
					<option value="1">이상무</option>
					<option value="2">교체필요</option>
				</select>
			</td>
		</tr>
		<tr>
			<td class="main">시동체크</td>
			<td>
				<select name="l_run">
					<option value="1">이상무</option>
					<option value="2">교체필요</option>
				</select>
			</td>
		</tr>
		<tr>
			<td class="main">외관체크</td>
			<td>
				<select name="l_sc">
					<option value="1">이상무</option>
					<option value="2">교체필요</option>
				</select>
			</td>
		</tr>
		<tr>
			<td colspan="2" class="main">
				<button onclick="save()">확인</button>
				<button onclick="window.location.href='index.jsp'">취소</button>
			</td>
		</tr>
	</table>
	</form>
</section>
<footer><h3>HRD KOREA</h3></footer>
</body>
</html>
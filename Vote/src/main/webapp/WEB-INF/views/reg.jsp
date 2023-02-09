<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
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
		let frm = document.frm();
		frm.submit();
	}
</script>
</head>
<body>
<header><h1>HY투표관리 ver1.0</h1></header>
<nav>
	<ol>
		<li><a href="<%=path%>/memberlist">후보자조회</a></li>
		<li><a href="<%=path%>/reg">투표등록</a></li>
		<li><a href="<%=path%>/voterlist">투표자조회</a></li>
		<li><a href="<%=path%>/voterank">득표조회</a></li>
		<li><a href="index.jsp">홈으로</a></li>
	</ol>
</nav>
<section>
	<form name="frm" method="post" action="reg">
	<table>
		<caption>투표자 등록</caption>
		<tr>
			<td class="main">투표자주민번호</td>
			<td><input type="text" name="v_jumin"></td>
		</tr>
		<tr>
			<td class="main">투표자이름</td>
			<td><input type="text" name="v_name"></td>
		</tr>
		<tr>
			<td class="main">후보자이름</td>
			<td>
				<select name="n_no">
					<option value="">선택</option>
					<option value="1001">김후보</option>
					<option value="1002">이후보</option>
					<option value="1003">최후보</option>
					<option value="1004">박후보</option>
					<option value="1005">우후보</option>
					<option value="1006">정후보</option>
				</select>
			</td>
		</tr>
		<tr>
			<td class="main">투표장</td>
			<td><input type="text" name="v_area"></td>
		</tr>
		<tr>
			<td class="main">투표시간</td>
			<td><input type="text" name="v_time"></td>
		</tr>
		<tr>
			<td class="main">유권자확인</td>
			<td>
				<input type="radio" name="v_confirm" value="y">확인
				<input type="radio" name="v_confirm" value="n">미확인
			</td>
		</tr>
		<tr>
			<td class="main" colspan="2">
				<button onclick="save()">저장</button>
				<button onclick="window.location href='index.jsp'">취소</button>
			</td>
		</tr>
	</table>
	</form>
</section>
<footer><h3>HRD KOREA</h3></footer>
</body>
</html>
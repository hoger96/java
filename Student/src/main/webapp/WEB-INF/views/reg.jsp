<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import="model.StudentDto" %>
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
	let id = frm.id.value;
	let korean = frm.id.value;
	let english = frm.english.value;
	let math = frm.math.value;
	let history = frm.history.value;
	
	if(id == ""){
		alert("학번을 입력하세요");
		frm.id.focus();
	}else if(korean == ""){
		alert("국어를 입력하세요");
		frm.korean.focus();
	}else if(english == ""){
		alert("영어를 입력하세요");
		frm.english.focus();
	}else if(math == ""){
		alert("수학을 입력하세요");
		frm.math.focus();
	}else if(history == ""){
		alert("역사를 입력하세요");
		frm.history.focus();
	}else {
		alert("등록성공");
		frm.submit();
	}
}
</script>
</head>
<body>
<header>
	<h2>학생 성적 관리</h2>
</header>
<nav>
	<ol>
		<li><a href="<%=path%>/studentlist">학생조회</a></li>
		<li><a href="<%=path%>/reg">학생성적등록</a></li>
		<li><a href="<%=path%>/scorelist">학생성적조회</a></li>
		<li><a href="index.jsp">홈으로</a></li>
	</ol>
</nav>
<section>
	<form name="frm" method="post" action="<%=path %>/reg">
	<table>
		<caption><h3>학생등록</h3></caption>
		<tr>
			<td class="main">학번</td>
			<td><input type="text" name="id"></td>
		</tr>
		<tr>
			<td class="main">국어</td>
			<td><input type="text" name="korean"></td>
		</tr>
		<tr>
			<td class="main">영어</td>
			<td><input type="text" name="english"></td>
		</tr>
		<tr>
			<td class="main">수학</td>
			<td><input type="text" name="math"></td>
		</tr>
		<tr>
			<td class="main">역사</td>
			<td><input type="text" name="history"></td>
		</tr>
		<tr>
			<td class="main" colspan="2">
				<input type="button" onclick="save()" value="저장">
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
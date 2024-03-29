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
	let s_id = frm.s_id;
	let s_name = frm.s_name;
	let t_id = frm.t_id;
	let s_grade = frm.s_grade;
	let weekday = frm.weekday;
	let start_h = frm.start_h;
	let end_h = frm.end_h;
	
	if(s_id == ""){
		alert("과목 입력하세요");
		s_id.focus();
	}else{
		frm.submit();
		alert("등록완료");
	}
	
	
}
</script>
</head>
<body>
	<header>
		<h1>연습</h1>
	</header>
	<nav>
		<ol>
			<li><a href="<%=path %>/list">조회</a></li>
			<li><a href="<%=path %>/reg">등록</a></li>
		</ol>
	</nav>
	<section>
	<form name="frm" method="post" action="reg">
		<table>
			<caption>수강과목 등록</caption>
			<tr>
				<td class="main">교과목 코드</td>
				<td><input type="text" name="s_id"></td>
			</tr>
			<tr>
				<td class="main">교과명</td>
				<td><input type="text" name="s_name"></td>
			</tr>
			<tr>
				<td class="main">담당강사</td>
				<td>
					<select name="t_id">
						<option value="">선택</option>
						<option value="1">정국교수</option>
						<option value="2">뷔교수</option>
						<option value="3">지민교수</option>
						<option value="4">제이홉교수</option>
						<option value="5">슈가교수</option>
						<option value="6">진교수</option>
						<option value="7">RM교수</option>
					</select>
				</td>
			</tr>
			<tr>
				<td class="main">학점</td>
				<td><input type="text" name="s_grade"></td>
			</tr>
			<tr>
				<td class="main">요일</td>
				<td>
					<input type="radio" name="weekday" value="M">월
					<input type="radio" name="weekday" value="TU">화
					<input type="radio" name="weekday" value="W">수
					<input type="radio" name="weekday" value="TH">목
					<input type="radio" name="weekday" value="F">금
					<input type="radio" name="weekday" value="S">토
				</td>
			</tr>
			<tr>
				<td class="main">수업시작시간</td>
				<td><input type="text" name="start_h"></td>
			</tr>
			<tr>
				<td class="main">수업종료시간</td>
				<td><input type="text" name="end_h"></td>
			</tr>
			<tr>
				<td class="main" colspan="2">
					<input type="button" value="목록" onclick="window.location='<%=path%>/list'">
					<input type="button" value="저장" onclick="save()">
				</td>
			</tr>
		</table>
	</form>
	</section>
	<footer>
		hi
	</footer>
</body>
</html>
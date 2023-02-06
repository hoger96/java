<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.LectureDto" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	String path = request.getContextPath();
	LectureDto dto = (LectureDto)request.getAttribute("dto");
%>
<link href="<%=path %>/css/index.css" rel="stylesheet">
<link href="<%=path %>/css/reg.css" rel="stylesheet">
<script>

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
	<form name="frm" method="post" action="modify">
		<table>
			<caption>수강과목 등록</caption>
			<tr>
				<td class="main">교과목 코드</td>
				<td><input type="text" name="s_id" value="<%=dto.getS_id()%>"></td>
			</tr>
			<tr>
				<td class="main">교과명</td>
				<td><input type="text" name="s_name" value="<%=dto.getS_name()%>"></td>
			</tr>
			<tr>
				<td class="main">담당강사</td>
				<td>
					<select name="t_id" value="<%=dto.getT_id()%>">
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
				<td><input type="text" name="s_grade" value="<%=dto.getS_grade()%>"></td>
			</tr>
			<tr>
				<td class="main">요일</td>
				<td>
					<input type="radio" name="weekday" value="<%=dto.getWeekday()%>">월
					<input type="radio" name="weekday" value="<%=dto.getWeekday()%>">화
					<input type="radio" name="weekday" value="<%=dto.getWeekday()%>">수
					<input type="radio" name="weekday" value="<%=dto.getWeekday()%>">목
					<input type="radio" name="weekday" value="<%=dto.getWeekday()%>">금
					<input type="radio" name="weekday" value="<%=dto.getWeekday()%>">토
				</td>
			</tr>
			<tr>
				<td class="main">수업시작시간</td>
				<td><input type="text" name="start_h" value="<%=dto.getStart_h()%>"></td>
			</tr>
			<tr>
				<td class="main">수업종료시간</td>
				<td><input type="text" name="end_h" value="<%=dto.getEnd_h()%>"></td>
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
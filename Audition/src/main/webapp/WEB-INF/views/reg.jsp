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
</head>
<body>
<header>HY라우드 오디션 VER 1.0</header>
<nav>
	<ol>
		<li><a href="<%=path%>/reg.go">참가자등록</a></li>
		<li><a href="<%=path%>/list.go">참가자목록 조회</a></li>
		<li><a href="<%=path%>/score.go">참가자점수 조회</a></li>
		<li><a href="<%=path%>/rank.go">참가자등수 조회</a></li>
		<li><a href="index.jsp">홈으로</a></li>
	</ol>
</nav>
<section>
<form name="frm" action="/reg" method="post">
	<table>
		<caption>참가자 등록</caption>
		<tr>
			<td class="main">참가자ID</td>
			<td><input type="text" name="join_id"></td>
		</tr>
		<tr>
			<td class="main">참가자이름</td>
			<td><input type="text" name="join_nm"></td>
		</tr>
		<tr>
			<td class="main">생년월일</td>
			<td>
				<input type="text" class="bb" name="birth_y">년
				<input type="text" class="bb" name="birth_m">월
				<input type="text" class="bb" name="birth_d">일
			</td>
		</tr>
		<tr>
			<td class="main">성별</td>
			<td>
				<input type="radio" name="gender" value="M">남
				<input type="radio" name="gender" value="F">여
			</td>
		</tr>
		<tr>
			<td class="main">실력무대</td>
			<td>
				<select name="specialty">
					<option value="">선택</option>
					<option value="V">보컬</option>
					<option value="D">댄스</option>
					<option value="R">랩</option>
				</select>
			</td>
		</tr>
		<tr>
			<td class="main">매력무대</td>
			<td><input type="text" name="charm"></td>
		</tr>
		<tr>
			<td colspan="2" class="main">
				<button>저장</button>
				<button>취소</button>
			</td>
		</tr>
	</table>
</form>
</section>
<footer>HRD KOREA</footer>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
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
	alert("수정완료");
	frm.submit();
}
</script>
</head>
<body>
<header>
	<h2>택시콜 현황 프로그램 ver 1.0</h2>
</header>
<nav>
	<ol>
		<li><a href="<%=path%>/reg">택시예약</a></li>
		<li><a href="<%=path%>/update">택시수정</a></li>
		<li><a href="<%=path%>/list">택시현황</a></li>
		<li><a href="index.jsp">홈으로</a></li>
	</ol>
</nav>
<section>
<form name="frm" method="post" action="<%=path %>/update">
	<table>
		<caption>택시 예약 등록</caption>
		<tr>
			<td class="main">예약번호</td>
			<td><input type="text" name="regno" readonly="readonly" value="<%=dto.getRegno()%>"></td>
		</tr>
		<tr>
			<td class="main">예약시간</td>
			<td><input type="text" name="regtime" value="<%=dto.getRegtime()%>"></td>
		</tr>
		<tr>
			<td class="main">예약날짜</td>
			<td><input type="text" name="regdate" value="<%=dto.getRegdate()%>"></td>
		</tr>
		<tr>
			<td class="main">고객아이디</td>
			<td><input type="text" name="cusno" value="<%=dto.getCusno()%>"></td>
		</tr>
		<tr>
			<td class="main">출발지</td>
			<td><input type="text" name="startpoint" value="<%=dto.getStartpoint()%>"></td>
		</tr>
		<tr>
			<td class="main">목적지</td>
			<td><input type="text" name="destination" value="<%=dto.getDestination()%>"></td>
		</tr>
		<tr>
			<td class="main">택시번호</td>
			<td><input type="text" name="taxino" value="<%=dto.getTaxino()%>"></td>
		</tr>
		<tr>
			<td class="main">배차상태<%=dto.getState()%></td>
			<td>
					<select name="state">
						<option value="">선택하기</option>
						<option value="P">배차완료</option>
						<option value="R">배차준비</option>
						<option value="X">배차미정</option>
					</select>
			</td>
		</tr>
		<tr>
			<td class="main" colspan="2">
				<input type="button" onclick="save()" value="수정">
				<input type="reset" value="다시입력">
			</td>
		</tr>
	</table>
</form>
</section>
<footer>
	<h3>HRD KOREA</h3>
</footer>
</body>
<script>
document.frm.state.value="<%=dto.getState()%>";
</script>
</html>
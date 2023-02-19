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
	if(frm.rev_id.value == ""){
		alert("예약번호를 입력하세요");
		frm.rev_id.focus();
	}else if(frm.join_no.value == ""){
		alert("접수자번호를 입력하세요");
		frm.join_no.focus();
	}else if(frm.kind.value == ""){
		alert("접종백신종류를 선택하세요");
		frm.kind.focus();
	}else if(frm.rev_dt.value == ""){
		alert("접종예약일자를 입력하세요");
		frm.rev_dt.focus();
	}else if(frm.certification.value == ""){
		alert("본인인증방법을 선택하세요");
		frm.certification.focus();
	}else if(frm.ck.value == ""){
		alert("접종완료여부를 선택하세요");
		frm.ck.focus();
	}else{
		alert("등록완료");
		frm.submit();
	}
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
		<li><a href="<%=path%>/list">백신접종조회</a></li>
		<li><a href="<%=path%>/area">백신지역별 접종 횟수 조회</a></li>
		<li><a href="<%=path%>/reg">홈으로</a></li>
	</ol>
</nav>
<section>
<form name="frm" method="post" action="<%=path %>/reg">
<table>
	<caption>백신접종 예약</caption>
	<tr>
		<td class="main">접종예약번호</td>
		<td><input type="text" name="rev_id"></td>
	</tr>
	<tr>
		<td class="main">접수자번호</td>
		<td><input type="text" name="join_no"></td>
	</tr>
	<tr>
		<td class="main">접종백신종류</td>
		<td>
			<select name="kind">
				<option value="">선택</option>
				<option value="H">화이자</option>
				<option value="M">모더나</option>
				<option value="Y">얀센</option>
			</select>
		</td>
	</tr>
	<tr>
		<td class="main">
			접종예약일자<br>
			(예시:2021-04-01)
		</td>
		<td><input type="text" name="rev_dt"></td>
	</tr>
	<tr>
		<td class="main">본인인증 방법</td>
		<td>
			<select name="certification">
				<option value="">선택</option>
				<option value="C">휴대폰</option>
				<option value="I">아이핀</option>
				<option value="P">공인인증</option>
			</select>
		</td>
	</tr>
	<tr>
		<td class="main">접종완료여부</td>
		<td>
			<input type="radio" name="ck" value="Y">Y
			<input type="radio" name="ck" value="N">N
		</td>
	</tr>
	<tr>
		<td class="main" colspan="2">
			<input type="button" value="저장" onclick="save()">
			<input type="button" value="취소" onclick="window.location.href='index.jsp'">
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
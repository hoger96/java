<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.NowDto" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	String path = request.getContextPath();
	ArrayList<NowDto> list = (ArrayList<NowDto>)request.getAttribute("list");
%>
<link href="<%=path %>/css/index.css" rel="stylesheet">
<link href="<%=path %>/css/list.css" rel="stylesheet">
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
		<li><a href="index.jsp">홈으로</a></li>
	</ol>
</nav>
<section>
<table>
	<caption>지역별 백신예약 인원수</caption>
	<tr>
		<td class="main">예약번호</td>
		<td class="main">이름</td>
		<td class="main">전화번호</td>
		<td class="main">백신종류</td>
		<td class="main">예약일자</td>
		<td class="main">본인인증</td>
		<td class="main">접종상태</td>
	</tr>
	<%for( int i=0; i<list.size(); i++ ) {%>
	<tr>
		<td><%=list.get(i).getRev_id()%></td>
		<td><%=list.get(i).getName()%></td>
		<td><%=list.get(i).getTel()%></td>
		<td><%=list.get(i).getKind()%></td>
		<td><%=list.get(i).getRev_dt()%></td>
		<td><%=list.get(i).getCertification()%></td>
		<td><%=list.get(i).getCk()%></td>
	</tr>
	<%} %>
</table>
</section>
<footer>
	<h3>HRD KOREA</h3>
</footer>
</body>
</html>
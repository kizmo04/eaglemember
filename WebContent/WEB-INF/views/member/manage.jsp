<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<style>
.strong {
	color: red;
	text-decoration: none; /* 언더라인 없애는거 */
	font-size: 1.2em; /* 1.2배 */
}
</style>
</head>
<body>
	<h5>
		<a href="">□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□
			□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□
			□□□■□□□□■□□□□■□□□□■□□□□■□□□■■■■□□□□□□□■■■■□□□■□□□□■□□□□□□■■■■□□□■□□□□■□□□□□■□□□□□■□□□□□□□□□□□□□
			□□□■□□□□■□□□□■□□□□■■□□□■□□■□□□□■□□□□□■□□□□■□□■□□□□■□□□□□■□□□□■□□■■□□□■□□□□□■□□□□□□□□□□□□□□□□□□□
			□□□■□□□□■□□□■□■□□□■■□□□■□□■□□□□□□□□□□■□□□□□□□■□□□□■□□□□□■□□□□■□□■■□□□■□□□□□■□□□□□□□□□□□□□□□□□□□
			□□□■□□□□■□□□■□■□□□■□■□□■□□■□□□□□□□□□□■□□□□□□□■□□□□■□□□□□■□□□□■□□■□■□□■□□□□□■□□□□□■□■□■■□□□■■■□□
			□□□■□□□□■□□■□□□■□□■□■□□■□□■□□■■■□□□□□■□□■■■□□■□□□□■□□□□□■□□□□■□□■□■□□■□□□□□■□□□□□■□■■□□■□■□□□■□
			□□□■□□□□■□□■□□□■□□■□□■□■□□■□□□□■□□□□□■□□□□■□□■□□□□■□□□□□■□□□□■□□■□□■□■□□■■□■□□□□□■□■□□□■□■■■■■□
			■□□■□■□□■□□■■■■■□□■□□□■■□□■□□□□■□□□□□■□□□□■□□■□□□□■□□□□□■□□□□■□□■□□□■■□□□□□■□□□□□■□■□□□■□■□□□□□
			■□□■□■□□■□■□□□□□■□■□□□■■□□■□□□■■□□□□□■□□□■■□□■□□□□■□□□□□■□□□□■□□■□□□■■□□□□□■□□□□□■□■□□□■□■□□□■□
			□■■□□□■■□□■□□□□□■□■□□□□■□□□■■■□■□□□□□□■■■□■□□□■■■■□□□□□□□■■■■□□□■□□□□■□□□□□■■■■■□■□■□□□■□□■■■□□
			□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□
			□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□</a>
	</h5>
	<ul>
		<li><a href="../index">Home</a></li>
		<li><a href="notice">공지사항</a></li>
	</ul>


	<form action="notice" method="get">
		<filedset> <select name="t">
			<option value="none">분류선택</option>

			<c:if test="${param.t=='title' }">
				<option value="title" selected="selected">제목</option>
			</c:if>
			<c:if test="${param.t!='title' }">
				<option value="title">제목</option>
			</c:if>

			<c:if test="${param.t=='content' }">
				<option value="content" selected="selected">내용</option>
			</c:if>
			<c:if test="${param.t!='content' }">
				<option value="content">내용</option>
			</c:if>

			<c:if test="${param.t=='writer' }">
				<option value="writer" selected="selected">작성자</option>
			</c:if>
			<c:if test="${param.t!='writer' }">
				<option value="writer">작성자</option>
			</c:if>



		</select> <label>검색어</label> <input name="q" value="${param.q}" /> <!-- header와   request에있는 애들 뽑아올수있음.    request.getParamter("q") -->
		<input type="submit" value="검색" /> </filedset>
	</form>


	<table border="1">
		<thead>
			<tr>
				<td>번호</td>
				<td>제목</td>
				<td>작성자</td>
				<td>작성일</td>
				<td>조회수</td>

			</tr>
		</thead>

		<tbody>
			<c:forEach var="n" items="${list}">
				<tr>
					<td>${n.code}</td>
					<td><a href="notice-detail?code=${n.code}">${n.title}</a></td>
					<td>${n.writer}</td>
					<td><fmt:formatDate pattern="yyyy-MM-dd" value="${n.regDate}" />
					</td>
					<td>${n.hit}</td>

				</tr>
			</c:forEach>

		</tbody>
	</table>
	<c:if test="${empty param.p}">
		<c:set var="page" value="1"></c:set>
	</c:if>
	<c:if test="${not empty param.p}">
		<c:set var="page" value="${param.p}"></c:set>
	</c:if>

	<c:set var="start" value="${page-(page-1)%5}"></c:set>
	<!-- 페이지가 넘어가도록  -->
	<c:set var="end"
		value="${fn:substringBefore((count%10==0?count/10:count/10+1),'.')}"></c:set>
	<div>
		${page} / ${end} pages
	</div>
	
	<div>
		<a href="notice-reg">글쓰기</a>
	</div>
	<div>
		
		<div>
			<a href="notice?p=${(page==1)?1:start}&t=${param.t}&q=${param.q}">이전 목록</a>
		</div>
		<ul>
			<c:forEach var="i" begin="0" end="4">
				
							<c:if test="${page==start+i}">
					<!-- empty는 null과 빈문자열을 한꺼번에 조건비교해줌 -->
					<li><a href="notice?p=${start+i}&t=${param.t}&q=${param.q}" Class="strong">${start+i}</a></li>
				</c:if>
				<c:if test="${page!=start+i}">
					<li><a href="notice?p=${start+i}&t=${param.t}&q=${param.q}">${start+i}</a></li>
				</c:if>
				
			</c:forEach>


		</ul>
		<div>
			<a href="notice?p=${start+5}&t=${param.t}&q=${param.q}">다음 목록</a>
		</div>
	</div>

</body>
</html>
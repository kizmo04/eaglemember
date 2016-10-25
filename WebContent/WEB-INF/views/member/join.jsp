<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원 가입</title>
</head>
<body>
<h1>회원가입 페이지</h1>
<form action="join" method="post">
<fieldset>
			<legend>회원가입 입력 필드</legend>
			<table border="1">
				<tbody>
					<tr>
						<td>이메일 주소</td>
						<td colspan="3"><input name="id" type="text" value="${m.id}" /></td>
					</tr>
					<tr>
						<td>비밀번호</td>
						<td colspan="3"><input name="pwd" type="password" value="${m.pwd}" /></td>
					</tr>
					<tr>
						<td>닉네임</td>
						<td colspan="3"><input name="nickName" type="text" value="${m.nickName}" /></td>
					</tr>
				</tbody>
			</table>
			<div>
			<input type="hidden" name="isAdmin" value="${n.isAdmin}"/>
			<input type="hidden" name="regDate" value="${n.regDate}"/>
				<input type="submit" value="회원가입"/>
				<%-- <a href="notice-detail?code=${n.code}">취소</a> --%>
			</div>
		</fieldset>
</form>
</body>
</html>
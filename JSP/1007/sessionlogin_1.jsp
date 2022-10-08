<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session Login</title>
</head>
<body>
<form action="sessionlogin_2.jsp" method="post">
	<table width="400">
	
		<tr bgcolor="#cccc66">
			<td align="right"><font size="2"> 아이디 : </font></td>
			<td> <input type="text" name="id" size="10"></td>
		</tr>
		<tr bgcolor="#cccc66">
			<td align="right"><font size="2"> 비밀번호 :</font></td>
			<td> <input type="password" name="passwd" size="10"></td>
		</tr>
		<tr bgcolor="#cccc66">
		
			<td colspan="2" align="center">
				<input type="submit" value="로그인">&nbsp; &nbsp;
				<input type="reset" value="취소">
			</td>
		</tr>
	</table>

</form>
</body>
</html>
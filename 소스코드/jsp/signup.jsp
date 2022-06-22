<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel = "stylesheet" href = "https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<meta charset="utf-8">

<title>Sign Up</title>
</head>
<body>
	<div class="container" align="center">
		<h3>회원 가입</h3>
		<div class="col-md-4 col-md-offset-4">
			<h3 class="form-signin-heading">Please sign up</h3>
			
			<form action="/success" method="get">
				<p> 아이디 : <input type="text" name="id">
				<p> 비밀번호 : <input type="password" name="pwd" >
				<p>
				<label>비밀번호 확인:
					<input type="password" name="confirmPassword" id="confirmPassword">
				</label>
				</p>
				<p> 이름 : <input type="text" name="name" id="name" value="${registerRequest.name}">
				<p> 연락처 : <select name="phone1">
					<option value="010">010</option>
					<option value="011">011</option>
					<option value="016">016</option>
					<option value="017">017</option>
					<option value="019">019</option>
				</select> - <input type="text" maxlength="4" size="4" name="phone2"> -
				<input type="text" maxlength="4" size="4" name="phone3">
				<p> 성별 : <input type="radio" name="sex" value="남성" checked>남성
						  <input type="radio" name="sex" value="여성">여성 <br></p><br>
				<p> <label>이메일:<br>
					<input type="text" name="email" id="email" value="${registerRequest.email}">
				</label> </p>
		
				<input type="submit" value="가입하기">
				<input type="reset" value="다시쓰기">
			</form>
		</div>
	</div>
	
</body>
</html>
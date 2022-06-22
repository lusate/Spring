<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel = "stylesheet" href = "https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<meta charset="utf-8">

<title>Login</title>
</head>
<body>
	<%
	String errMsg = (String)request.getAttribute("errMsg");
	if(errMsg == null){
		errMsg="아이디와 비밀번호를 입력해주세요!!";
	}
	%>
	<jsp:include page="menu.jsp"/>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">관리자 로그인</h1>
		</div>
	</div>
	<div class="container" align="center">
		<div class="col-md-4 col-md-offset-4">
			<h3 class="form-signin-heading">Please sign in</h3>
			
			<form action="/repository" method="get">
				<input type = "text" name="id" />
				<input type = "password" name="pwd" /> <br>
				<div id="error"><%= errMsg %></div>
				<input type = "submit" value="Login" />
			</form>
		</div>
	</div>
</body>
</html>
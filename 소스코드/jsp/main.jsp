<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<link rel = "stylesheet" href = "https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<meta charset="utf-8">

<title> POS </title>
</head>
<body>
	<jsp:include page="menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">POS</h1>
		</div>
	</div>

	<div class="container">
		<%
		out.println("<h4>1. 회원가입 </h4>");
		%>
		<button type="button" onclick="location.href='signup'">회원가입</button>
		<%
		out.println("<h4>2. 로그인 </h4>");
		%>
		<button type="button" onclick="location.href='login'">로그인</button>
		<%
		out.println("<h4>3. 상품 구매 </h4>");
		%>
		<button type="button" onclick="location.href='purchase'">상품 구매</button>
		<%
		out.println("<h4>4. 상품 목록 </h4>");
		%>
		<button type="button" onclick="location.href='managerLogin'">상품 목록</button>
		
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>
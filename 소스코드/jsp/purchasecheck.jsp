<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.springmvc.pos.Product" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel = "stylesheet" href = "https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

<title>구매 내역</title>
</head>
<body>
	<jsp:include page = "menu.jsp"/>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">구매 내역</h1>
		</div>
	</div>
	<div class="container">

		<div style="padding-top: 50px">
			<table class="table table-hover">
				<tr>
					<th>상품</th>
					<th>가격</th>
					<th>수량</th>
					<th>소계</th>
					<th>비고</th>
				</tr>
				<%
				String Name = (String)request.getAttribute("Name");
				int Cost = Integer.parseInt(request.getParameter("Cost"));
				int Count = Integer.parseInt(request.getParameter("Count"));
				
				%>

				<tr>
					<td><% out.println(Name); %></td>
					<td><% out.println(Cost); %></td>
					<td><% out.println(Count); %></td>
					<td><%= Cost * Count %></td>
					<td><button type="button" onclick="location.href='main'" class="btn btn-warning">삭제</button></td>
				</tr>
				
			</table>
			<button type="button" onclick="location.href='purchase'" class="btn btn-warning">추가 구매</button>
			<button type="button" onclick="location.href='main'" class="btn btn-warning">메인 화면</button>
		</div>
		<hr>
	</div>
	<jsp:include page="footer.jsp"/>
</body>
</html>


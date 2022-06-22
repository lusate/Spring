<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<link rel = "stylesheet" href = "https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<meta charset="utf-8">
<title>Welcome</title>
</head>
<body>
	<%@ include file="menu.jsp" %>
	<%! String greeting = "저희 판매 관리 시스템에 오신 것을 환영합니다." ;
	String tagline = "Welcome to POS!";
	%>
	<div class = "jumbotron">
		<div class = "container">
			<h1 class = "display-3">
				<%= greeting %>
			</h1>
		</div>
	</div>
	<div class = "container">
		<div class = "text-center">
			<h3>
				<%= tagline %>
			</h3>
			<%
				response.setIntHeader("Refresh", 5);
				Date day = new java.util.Date();
				String am_pm;
				int hour = day.getHours();
				int minute = day.getMinutes();
				int second = day.getSeconds();
				if(hour / 12 == 0){
					am_pm = "AM";
				}
				else{
					am_pm = "PM";
					hour = hour - 12;
				}
				String CT = hour + ":" + minute + ":" + second + " " + am_pm;
				out.println("현재 접속 시각: " + CT + "\n");
			%>
			<br><br>
			<button type="button" onclick="location.href='main'">메인 화면으로</button>
		</div>
	</div>
	<%@ include file="footer.jsp" %>
</body>
</html>
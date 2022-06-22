<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Login Check</h1>
	
	<%
			String id = (String)request.getAttribute("id");
			if (id != null){
				out.println("<p> 환영합니다 " + id + "님</p>");
				out.println("<p> 오늘도 좋은 하루 되세요!!</p>");
			}
			else{
				request.setAttribute("errMsg", "잘못된 아이디 또는 비밀번호를 입력하였습니다.");
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.forward(request, response);
			}
		%>
	<br><br>
	<button type="button" onclick="location.href='main'">메인 화면으로</button>
</body>
</html>
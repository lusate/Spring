<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head> <meta charset="utf-8"> </head>
<link rel = "stylesheet" href = "https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>멤버 정보</title>
<body>

	<jsp:include page="menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">멤버 정보</h1>
		</div>
	</div>
	
	<div class="container">
		<h1> Member List </h1> 

	<br><br>

			<ul>
				<c:forEach var="member" items="${members}" varStatus="status">
					<li> ${status.index+1} : ${member.name}, ${member.email}, 
					${member.registerDateTime} </li>
				</c:forEach>
			</ul>

			<button type="button" onclick="location.href='main'">메인 화면으로</button>
	</div>

</body>
</html>

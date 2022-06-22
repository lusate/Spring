<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head> <meta charset="utf-8"> </head>
<link rel = "stylesheet" href = "https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>상품 목록</title>
<body>

	<jsp:include page="menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품 목록</h1>
		</div>
	</div>
	
	<div class="container">
		<h1> Product List </h1> 
		<%
			String id = (String)request.getAttribute("id");
			if (id != null){
				out.println("<p> 환영합니다 " + id + "관리자님</p>");
				out.println("<p> 오늘도 좋은 하루 되세요!!</p>");
			}
			else{
				request.setAttribute("errMsg", "잘못된 아이디 또는 비밀번호를 입력하였습니다.");
				RequestDispatcher rd = request.getRequestDispatcher("managerLogin.jsp");
				rd.forward(request, response);
			}
		%>
	<br><br>
			
			<ul>
				<c:forEach var="product" items="${products}" varStatus="status">
					<li> ${status.index+1} : ${product.name}, ${product.cost}, ${product.count} 
					${product.registerDate} </li>
				</c:forEach>
			</ul>
			<button type="button" onclick="location.href='list'">멤버 정보 확인</button>
			<button type="button" onclick="location.href='main'">메인 화면으로</button>
	</div>
	
</body>
</html>

<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>

<html>

<head>
<link rel = "stylesheet" href = "https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>상품 등록</title>
<meta charset="utf-8">

<script type="text/javascript">
	function addToCart(){ //상품 주문
		if(confirm("상품을 구매하시겠습니까?")){
			document.addForm.submit();
		}
		else{
			document.addForm.reset();
		}
	}
</script>

</head>

<body>
	<form action="purchasecheck">
		<jsp:include page="menu.jsp"/>
		<div class = "jumbotron">
			<div class = "container">
				<h1 class = "display-3">상품 구매</h1>
			</div>
		</div>
		
		<div class = "container">

			<div class="form-group row">
				<label class="col-sm-2">상품명</label>
				<div class="col-sm-3">
					<input type="text" name="Name" class="form-control">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">가격</label>
				<div class="col-sm-3">
					<input type="text" id="Cost" name="Cost" class="form-control">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">개수</label>
				<div class="col-sm-2">
					<input type="text" id="Count" name="Count" class="form-control">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">상품 구매</label>
				<div class="col-sm-3">
					<button type="button" onclick="addToCart()"> 상품 주문</button>
				</div>
			</div>
			<input type="submit" value="구매 내역">
		</div>
	</form>
</body>
</html>
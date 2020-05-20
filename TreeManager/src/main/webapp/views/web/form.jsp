<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Form</title>

<!-- Bootstrap core CSS -->
<link
	href="<c:url value='/template/web/bootstrap/css/bootstrap.min.css'/>"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="<c:url value='/template/web/css/simple-sidebar.css'/>"
	rel="stylesheet">

</head>

<body>


	<div class="container">
		<h2>Form điền thông tin cây</h2>
		<form>
			<div class="form-group">
				<label for="nameTree">Tên cây:</label> <input type="text"
					class="form-control" placeholder="Nhập tên cây" id="text">
			</div>
			<div class="form-group">
				<label for="nameTree">Chiều cao:</label> <input type="text"
					class="form-control" placeholder="Nhập Chiều cao" id="text">
			</div>
			<div class="form-group">
				<label for="nameTree">Giống cây:</label> <input type="text"
					class="form-control" placeholder="Nhập Giống cây" id="text">
			</div>
			<div class="form-group">
				<label for="nameTree">Tuổi cây:</label> <input type="text"
					class="form-control" placeholder="Nhập Tuổi cây" id="text">
			</div>
			<button type="submit" class="btn btn-success">Submit</button>
		</form>

	</div>
	<!-- /#page-content-wrapper -->

	</div>
	<!-- /#wrapper -->

	<!-- Bootstrap core JavaScript -->
	<script type="text/javascript"
		src="<c:url value='/template/web/jquery/jquery.min.js' />">
		
	</script>
	<script type="text/javascript"
		src="<c:url value='/template/web/bootstrap/js/bootstrap.bundle.min.js'/>"></script>


</body>

</html>

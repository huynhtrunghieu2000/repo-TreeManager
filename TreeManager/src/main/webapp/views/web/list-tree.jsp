<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<script type="text/javascript"
	src="<c:url value='/template/pagination/jquery.twbsPagination.js' />"></script>
<title>Danh sách cây</title>
</head>

<body>
	<form action="<c:url value ='/list-tree' />" id = "formSubmit">
		<div class="container">
			<h2>Danh sách cây</h2>
			<table class="table table-hover">
				<thead>
					<tr>
						<th>ID</th>
						<th>Giống cây</th>
						<th>Loại</th>
						<th>Địa chỉ</th>
						<th>Chiều cao</th>
						<th>Tuổi</th>
						<th>Tọa độ</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="item" items="${model.listResult}">
						<tr>
							<td>${item.id}</td>
							<td>${item.specieTree}</td>
							<td>${item.typeTree}</td>
							<td>${item.addressTree}</td>
							<td>${item.height}</td>
							<td>${item.ageTree}</td>
							<td>${item.latitude},${item.longitude}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

			<ul id="pagination" class="pagination">
			</ul>
		</div>
	</form>
	<!-- /#page-content-wrapper -->

	<script type="text/javascript">
		$(function() {
			window.pagObj = $('#pagination').twbsPagination({
				totalPages : 35,
				visiblePages : 10,
				onPageClick : function(event, page) {
					console.info(page + ' (from options)');
				}
			}).on('page', function(event, page) {
				console.info(page + ' (from event listening)');
			});
		});
	</script>

	<script type="text/javascript">
		document.getElementById("listTreeTab").className = "list-group-item avtive list-group-item-action active";
	</script>
</body>
</html>

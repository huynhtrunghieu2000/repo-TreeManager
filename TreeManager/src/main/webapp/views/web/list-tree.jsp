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
<script
      type="text/javascript"
      src="<c:url value='/template/pagination/jquery.twbsPagination.js' />"
    ></script>
<title>Danh sách cây</title>
</head>

<body>
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
						<td>${item.idTree}</td>
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
		<li></li>
		</ul>
	</div>
	<!-- /#page-content-wrapper -->

	<script>
		$(function() {
			window.pagObj = $('#pagination').twbsPagination({
				totalPages : totalPages,
				visiblePages : 10,
				startPage : currentPage,
				/*onPageClick : function(event, page) {
					if (currentPage != page) {
						//$('#maxPageItem').val(limit);
						$('#page').val(page);
						//$('#sortName').val('title');
						//$('#sortBy').val('desc');
						//$('#type').val('list');
						//$('#formSubmit').submit();
					}
				}*/
			});
		});
	</script>

	<script type="text/javascript">
		document.getElementById("listTreeTab").className = "list-group-item avtive list-group-item-action active";
	</script>
</body>
</html>

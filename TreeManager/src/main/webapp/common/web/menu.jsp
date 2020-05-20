<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<!-- Sidebar -->
<div class="bg-light border-right" id="sidebar-wrapper">
	<div class="sidebar-heading">Quản Lý Cây Xanh</div>
	<div class="list-group list-group-flush">
		<a href="<c:url value='/home'/>"
			class="list-group-item list-group-item-action bg-light">Bản đồ</a> <a
			href="<c:url value='/form'/>" class="list-group-item list-group-item-action bg-light">Form</a>
		<a href="#" class="list-group-item list-group-item-action bg-light">Overview</a>
		<a href="#" class="list-group-item list-group-item-action bg-light">Events</a>
		<a href="#" class="list-group-item list-group-item-action bg-light">Profile</a>
		<a href="#" class="list-group-item list-group-item-action bg-light">Status</a>
	</div>
</div>
<!-- /#sidebar-wrapper -->
<!-- Menu Toggle Script -->
<script>
	$("#menu-toggle").click(function(e) {
		e.preventDefault();
		$("#wrapper").toggleClass("toggled");
	});
</script>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<h1>Danh sách lớp học</h1>

	<a href="/1_NguyenVanDat_18047651_CLIENT/add">Thêm
		lớp học</a>
	<table>
		<tr>
			<th>ID</th>
			<th>Tên lớp</th>
			<th>Tòa nhà</th>
			<th>Buổi học</th>
			<th>Choose</th>
		</tr>
		<c:forEach items="${list}"  var="lp">

			<tr>
				<td>${lp.id}</td>
				<td>${lp.tenLop}</td>
				<td>${lp.toaNha}</td>
				<td>${lp.buoiHoc}</td>
				
				<td>
					<a href="/1_NguyenVanDat_18047651_CLIENT/update/${lp.id}">Update</a>
					<a href="/1_NguyenVanDat_18047651_CLIENT/delete/${lp.id}">Delete</a>
				</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>
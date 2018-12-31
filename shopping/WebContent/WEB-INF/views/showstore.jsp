<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Showing Store</title>
	</head>

	<body>
			<table>
				
				<tr>
					<td> Store ID : </td>
					<td> ${param.StoreID}</td>
				</tr>
				
				<tr>
					<td> Store Name : </td>
					<td> ${param.StoreName} </td>
				</tr>
				
				<tr>
					<td> Store City : </td>
					<td> ${param.StoreCity} </td>
				</tr>
				
				<tr>
					<td> Store Pincode : </td>
					<td> ${param.StorePIN} </td>
				</tr>
				
				<tr>
					<td> Store Departments : </td>
					<td> ${param.StoreDepartments} </td>
				</tr>
				
				<tr>
					<td> Store Levels : </td>
					<td> ${param.StoreLevels} </td>
				</tr>
			</table>
		</body>
</html>
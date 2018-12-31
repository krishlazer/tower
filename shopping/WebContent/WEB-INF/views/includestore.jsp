<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>
	
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>BrickMortar</title>
	</head>


	<body>
			<form:form  action = "/shopping/showstore" modelAttribute = "St" method = "POST">
				<table>
					<tr>
						<td> Store ID: </td>
						<td> <form:input path="StoreID"/></td>
					</tr>
					
					<tr>
						<td> Store Name : </td>
						<td> <form:input path="StoreName"/></td>
					</tr>
					
					<tr>
						<td> Store City: </td>
						<td> <form:input path="StoreCity"/> </td>
					</tr>
					
					<tr>
						<td> Store URL : </td>
						<td> <form:input path="StoreURL"/></td>
					</tr>
					
					<tr>
						<td> Store Pincode : </td>
						<td> <form:input path="StorePIN"/></td>
					</tr>
					
					<tr>
						<td> Store Departments: </td>
						<td> <form:input path="StoreDepartments"/></td>
					</tr>
					
					<tr>
						<td> Store Levels : </td>
						<td> <form:input path="StoreLevels"/></td>
					</tr>
					
					<tr>
						<td colspan = "2">
							<input type = "submit" value = "Add Store"/>
						</td>
					</tr>
				</table>
			</form:form>
	</body>
</html>
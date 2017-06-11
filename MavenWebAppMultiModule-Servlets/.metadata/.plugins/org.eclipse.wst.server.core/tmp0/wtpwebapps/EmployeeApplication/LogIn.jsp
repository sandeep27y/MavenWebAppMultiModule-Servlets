<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function validateForm(){
	var name = document.getElementById('validname').value;
	var salary = document.getElementById('validsalary').value;
	var valid = true;
	if(name.length<9){
		alert("Name should be 8 characters");
		valid = false;
		return valid;
	}
	if(salary<1000){
		alert("Salary should be grater than 1000");
		valid = false;
		return valid;
	}
	console.log("czxvzx");
	return valid;
}

</script>

</head>
<body>
<form action="/EmployeeApplication/userlogin.do" method="post">
<table>
	<tr>
		<td>UserName: </td><td><input type="text" name="username"></td>
	</tr>
	<tr>
		<td>Password: </td><td><input type="password" name="password"></td>
	</tr>
	<tr>
		<td></td><td><input type="Submit" value="Submit"></td>
	</tr>
</table>
</form>
<br><br>
<div align="left">
<form action="/EmployeeApplication/EmployeeInfromation.do" method="post">
<h3>Employee Details</h3>
EmployeeID: &nbsp;<input type="text" name="employeeId" value="10001">
<input type="Submit" value="Submit1"><br>
</form>
</div>
<div align="right" style="margin-top: -85px; margin-right: 230px">
<form action="/EmployeeApplication/add" method="post" onsubmit="return validateForm()">
<h3 style="margin-right: 108px">Add Employee</h3>
<table>
	<tr>
		<td>EmployeeId: </td>
		<td><input type="text" name="employeeId" value="10"></td>
	</tr>
	<tr>
		<td>EmployeeBirthDate: </td>
		<td><input type="text" name="birthdate" value="04/03/2017"></td>
	</tr>
	<tr>
		<td>EmployeeFirstName: </td>
		<td><input type="text" name="firstName" value="sandeep" id="validname"></td>
	</tr>
	<tr>
		<td>EmployeeLastName: </td>
		<td><input type="text" name="lastName" value="kumar"></td>
	</tr>
	<tr>
		<td>EmployeeGender: </td>
		<td><input type="text" name="gender" value="M"></td>
	</tr>
	<tr>
		<td>EmployeeHireDate: </td>
		<td><input type="text" name="hiredate" value="09/10/2013"></td>
	</tr>
	<tr>
		<td>EmployeeSalary: </td>
		<td><input type="text" name="salary" value="10000" id="validsalary"></td>
	</tr>
	<tr>
		<td>FromDate: </td>
		<td><input type="text" name="fromdate" value="09/10/2013"></td>
	</tr>
	<tr>
		<td>ToDate: </td>
		<td><input type="text" name="todate" value="09/10/2013"></td>
	</tr>
	<tr>
		<td>DepartmentNumber: </td>
		<td><input type="text" name="deptnumber" value="a001"></td>
	</tr>
	<tr>
		<td>DepartmentName: </td>
		<td><input type="text" name="deptname" value="aaaa"></td>
	</tr>
	<tr>
		<td><td><input type="submit" value="Add" align="right"></td>
	</tr>
	<tr>
		<td colspan="2"><c:out value="${requestScope.display}"></c:out></td>
	</tr>
</table>
</div>
</form>
</body>
</html>
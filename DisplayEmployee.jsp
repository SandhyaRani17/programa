<%@page isELIgnored="false" %>
<html>
<body>
	<form action="empCRUD">
	<table align="center" width=50%>
	<tr>
	<th>Employee Id</th>
	<td><input type=text name=empid value=${emp.empid }></td>
	</tr>
	<tr>
	<th>Employee Name</th>
	<td><input type=text name=ename value=${emp.ename }></td>
	</tr>
	<tr>
	<th>Employee Salary</th>
	<td><input type=text name=salary value=${emp.salary }></td>
	</tr>
	<tr>
	<td><input type=submit value="Add_Employee" name="sub"></td>
	<td><input type=submit value="Del_Employee" name="sub"></td>
	<td><input type=submit value="Mod_Employee" name="sub"></td>
	<td><input type=submit value="Get_Employee" name="sub"></td>
	</table>
	</form>
</body>
</html>
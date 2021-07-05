<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee</title>
</head>
<body>
<form action="addEmp">
<h2>Add Employee</h2>
<div id="center">
ID:<input type="text" name="empid"><br>
Name:<input type="text" name="empname" ><br>
Designation:<input type="text" name="designation" ><br>
Salary:<input type="text" name="salary"><br>
<input type="submit"><br>
</div>
</form>

<form action="searchEmp">
<h2>Search Employee </h2>
<div id="center">

Empid:<input type="text" name="empid"><br>
<input type="submit"><br>
</div>
</form>
<form action="deleteEmp">
<h2>Delete Employee </h2>
<div id="center">
Empid:<input type="text" name="empid"><br>
<input type="submit"><br>
</div>
</form>
<form action="updateEmp">
<h2>Update Employee </h2>
<div id="center">

Empid:<input type="text" name="empid"><br>
<input type="submit"><br>
</div>
</form>
</body>
</html>
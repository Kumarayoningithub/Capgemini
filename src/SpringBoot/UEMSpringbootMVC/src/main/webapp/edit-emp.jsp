<%@ page import="com.capgemini.training.entity.Employee" %>

<%
    Employee emp = (Employee) request.getAttribute("emp");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Employee</title>

<style>

/* SAME THEME */
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: 'Orbitron', 'Segoe UI', sans-serif;
}

body {
    background: radial-gradient(circle at center, #020617, #000000);
    color: #00ffff;
    min-height: 100vh;
}

.container {
    width: 400px;
    margin: 60px auto;
    padding: 25px;
    background: rgba(0,0,0,0.6);
    border: 1px solid #00ffff;
    border-radius: 15px;
    box-shadow: 0 0 20px #00ffff;
}

h2 {
    text-align: center;
    margin-bottom: 20px;
}

input {
    width: 100%;
    padding: 10px;
    margin-bottom: 12px;
    border-radius: 8px;
    border: 1px solid #00ffff;
    background: transparent;
    color: #00ffff;
}

.btn {
    width: 100%;
    padding: 10px;
    border: 2px solid #00ffff;
    background: transparent;
    color: #00ffff;
    cursor: pointer;
    border-radius: 8px;
}

.btn:hover {
    background: #00ffff;
    color: black;
}

</style>

</head>

<body>

<div class="container">

<h2>Update Employee</h2>

<form action="updateemp" method="post">

<input type="hidden" name="id" value="<%= emp.getId() %>">

<input type="text" name="empId" value="<%= emp.getEmpId() %>" placeholder="Emp ID">
<input type="text" name="empName" value="<%= emp.getEmpName() %>" placeholder="Name">
<input type="text" name="empEmail" value="<%= emp.getEmpEmail() %>" placeholder="Email">
<input type="text" name="empContactNo" value="<%= emp.getEmpContactNo() %>" placeholder="Contact">
<input type="text" name="empCity" value="<%= emp.getEmpCity() %>" placeholder="City">

<button type="submit" class="btn">Update Employee</button>

</form>

</div>

</body>
</html>
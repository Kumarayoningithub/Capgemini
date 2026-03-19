<%@ page import="com.capgemini.training.entity.Employee" %>

<%
    Employee emp = (Employee) request.getAttribute("emp");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Details</title>

<style>

/* ===== COPY SAME STYLE FROM HOME PAGE ===== */
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

body::before {
    content: "";
    position: fixed;
    width: 100%;
    height: 100%;
    background-image:
        linear-gradient(rgba(0,255,255,0.05) 1px, transparent 1px),
        linear-gradient(90deg, rgba(0,255,255,0.05) 1px, transparent 1px);
    background-size: 40px 40px;
    z-index: 0;
}

.container {
    position: relative;
    z-index: 1;
    width: 90%;
    max-width: 700px;
    margin: 60px auto;
    padding: 25px;
    background: rgba(0, 0, 0, 0.6);
    border: 1px solid #00ffff;
    border-radius: 15px;
    box-shadow: 0 0 20px #00ffff;
}

h2 {
    text-align: center;
    margin-bottom: 25px;
    text-shadow: 0 0 10px #00ffff;
}

table {
    width: 100%;
    border-collapse: collapse;
}

td {
    padding: 12px;
    border-bottom: 1px solid rgba(0,255,255,0.2);
}

/* BUTTON STYLE SAME AS HOME */
.btn {
    display: inline-block;
    margin: 10px 5px;
    padding: 10px 20px;
    color: #00ffff;
    border: 2px solid #00ffff;
    text-decoration: none;
    border-radius: 8px;
    transition: 0.3s;
    box-shadow: 0 0 10px #00ffff;
}

.btn:hover {
    background: #00ffff;
    color: black;
    box-shadow: 0 0 20px #00ffff;
}

.actions {
    text-align: center;
    margin-top: 20px;
}

</style>

<script>
// ✅ DELETE CONFIRMATION
function confirmDelete(id) {
    if(confirm("Are you sure you want to delete this employee?")) {
        window.location.href = "deleteemp?id=" + id;
    }
}
</script>

</head>

<body>

<div class="container">

<h2>Employee Details</h2>

<table>
<tr><td>ID</td><td><%= emp.getId() %></td></tr>
<tr><td>EMP CODE</td><td><%= emp.getEmpId() %></td></tr>
<tr><td>NAME</td><td><%= emp.getEmpName() %></td></tr>
<tr><td>EMAIL</td><td><%= emp.getEmpEmail() %></td></tr>
<tr><td>CONTACT</td><td><%= emp.getEmpContactNo() %></td></tr>
<tr><td>CITY</td><td><%= emp.getEmpCity() %></td></tr>
</table>

<div class="actions">
    <a href="editemp?id=<%= emp.getId() %>" class="btn">Update</a>

    <!-- DELETE WITH POPUP -->
    <a href="#" onclick="confirmDelete(<%= emp.getId() %>)" class="btn">Delete</a>

    <a href="allemp" class="btn">Back</a>
</div>

</div>

</body>
</html>
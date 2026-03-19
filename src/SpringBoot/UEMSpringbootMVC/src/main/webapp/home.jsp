<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.List" %>
<%@ page import="com.capgemini.training.entity.Employee" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Employee Console</title>

<style>

    /* ===== GLOBAL ===== */
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

    /* ===== GRID BACKGROUND ===== */
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
    .btn {
    display: inline-block;
    margin-bottom: 20px;
    padding: 10px 20px;
    color: #00ffff;
    border: 2px solid #00ffff;
    text-decoration: none;
    border-radius: 8px;
    font-weight: bold;
    letter-spacing: 1px;
    transition: 0.3s;
    box-shadow: 0 0 10px #00ffff;
}

.btn:hover {
    background: #00ffff;
    color: #000;
    box-shadow: 0 0 20px #00ffff, 0 0 40px #00ffff;
    transform: scale(1.05);
}

    h2 {
        text-align: center;
        margin: 30px 0;
        font-size: 34px;
        color: #00ffff;
        text-shadow: 0 0 10px #00ffff, 0 0 20px #00ffff;
        letter-spacing: 2px;
    }

    .container {
        position: relative;
        z-index: 1;
        width: 90%;
        max-width: 1100px;
        margin: 40px auto;
        padding: 25px;
        background: rgba(0, 0, 0, 0.6);
        border: 1px solid #00ffff;
        border-radius: 15px;
        box-shadow: 0 0 20px #00ffff;
        animation: fadeIn 1s ease-in-out;
    }

    table {
        width: 100%;
        border-collapse: collapse;
        border-radius: 10px;
        overflow: hidden;
    }

    th {
        background: rgba(0,255,255,0.2);
        color: #00ffff;
        padding: 14px;
        text-transform: uppercase;
        letter-spacing: 1px;
        border-bottom: 1px solid #00ffff;
    }

    td {
        padding: 12px;
        text-align: center;
        border-bottom: 1px solid rgba(0,255,255,0.2);
        color: #e0f7ff;
    }

    tr {
        transition: 0.3s;
    }

    tr:hover {
        background: rgba(0,255,255,0.1);
        box-shadow: 0 0 10px #00ffff inset;
        transform: scale(1.01);
    }

    tr:nth-child(even) {
        background: rgba(0,255,255,0.03);
    }

    .message {
        text-align: center;
        margin-bottom: 15px;
        color: #00ff88;
        font-weight: bold;
        font-size: 18px;
        text-shadow: 0 0 10px #00ff88;
    }

    .no-data {
        color: #ff4d4d;
        font-weight: bold;
        padding: 20px;
        text-shadow: 0 0 10px #ff4d4d;
    }

    @keyframes fadeIn {
        from {
            opacity: 0;
            transform: translateY(20px);
        }
        to {
            opacity: 1;
            transform: translateY(0);
        }
      
        
    }
    
    

</style>

</head>
<body>

<div class="container">

    <%-- Message Section --%>
    <%
        String message = (String) request.getAttribute("message");
        if (message != null) {
    %>
        <p class="message"><%= message %></p>
    <%
        }
    %>
	<a href="addemp" class="btn">Add New Employee</a>
    <h2>View Employee Console</h2>

    <%
        List<Employee> listOfEmp = (List<Employee>) request.getAttribute("emplist");
    %>
    
    
    <form action="searchemp" method="get" style="text-align:center; margin-bottom:20px;">

    <input type="text" name="keyword" placeholder="Search by ID, Name or Email"
           style="padding:10px; width:300px; border-radius:8px; border:1px solid #ccc;">

<button type="submit"
    style="
        padding: 10px 18px;
        border: 2px solid #00ffff;
        border-radius: 8px;
        background: transparent;
        color: #00ffff;
        font-size: 14px;
        cursor: pointer;
        box-shadow: 0 0 10px #00ffff;
        transition: all 0.3s ease;
    "
    onmouseover="this.style.background='#00ffff'; this.style.color='#000'; this.style.boxShadow='0 0 20px #00ffff'"
    onmouseout="this.style.background='transparent'; this.style.color='#00ffff'; this.style.boxShadow='0 0 10px #00ffff'"
>
    Search
</button>

</form>
    
    
    

    <table>
        <tr>
            <th>ID</th>
            <th>EMP CODE</th>
            <th>NAME</th>
            <th>EMAIL</th>
            <th>CONTACT</th>
            <th>CITY</th>
            <th>ACTIONS</th>
        </tr>

        <%
            if (listOfEmp != null && !listOfEmp.isEmpty()) {
                for (Employee emp : listOfEmp) {
        %>
                    <tr>
                        <td><%= emp.getId() %></td>
                        <td><%= emp.getEmpId() %></td>
                        <td><%= emp.getEmpName() %></td>
                        <td><%= emp.getEmpEmail() %></td>
                        <td><%= emp.getEmpContactNo() %></td>
                        <td><%= emp.getEmpCity() %></td>
                        <td><a href="viewemp?id=<%= emp.getId() %>" class="btn">View</a></td>
                    </tr>
        <%
                }
            } else {
        %>
                <tr>
                    <td colspan="6" class="no-data">
                        🚫 NO SIGNAL... NO EMPLOYEES FOUND
                    </td>
                </tr>
        <%
            }
        %>

    </table>

</div>

</body>
</html>
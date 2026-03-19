<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Employee</title>

<style>

    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
        font-family: "Poppins", sans-serif;
    }

    body {
        background: linear-gradient(135deg, #0f2027, #203a43, #2c5364);
        min-height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .card {
        width: 420px;
        padding: 30px;
        border-radius: 18px;
        background: rgba(255, 255, 255, 0.05);
        backdrop-filter: blur(15px);
        box-shadow: 
            0 10px 40px rgba(0,0,0,0.6),
            0 0 0 1px rgba(255,255,255,0.08);
        animation: fadeIn 0.8s ease;
    }

    h2 {
        text-align: center;
        margin-bottom: 25px;
        color: #ffffff;
        font-weight: 600;
        letter-spacing: 1px;
    }

    .input-group {
        margin-bottom: 18px;
    }

    label {
        font-size: 13px;
        color: #cbd5e1;
        display: block;
        margin-bottom: 6px;
    }

    input {
        width: 100%;
        padding: 12px;
        border-radius: 10px;
        border: 1px solid rgba(255,255,255,0.1);
        background: rgba(255,255,255,0.08);
        color: white;
        outline: none;
        transition: all 0.3s ease;
    }

    input::placeholder {
        color: #94a3b8;
    }

    input:focus {
        border-color: #60a5fa;
        background: rgba(255,255,255,0.12);
        box-shadow: 0 0 12px rgba(96,165,250,0.5);
    }

    .btn {
        width: 100%;
        padding: 12px;
        border-radius: 10px;
        border: none;
        background: linear-gradient(135deg, #3b82f6, #6366f1);
        color: white;
        font-size: 15px;
        font-weight: 500;
        cursor: pointer;
        transition: all 0.3s ease;
    }

    .btn:hover {
        transform: translateY(-2px);
        box-shadow: 0 8px 25px rgba(59,130,246,0.5);
    }

    .footer {
        text-align: center;
        margin-top: 15px;
        font-size: 13px;
        color: #94a3b8;
    }

    .footer a {
        color: #60a5fa;
        text-decoration: none;
    }

    .footer a:hover {
        text-decoration: underline;
    }

    @keyframes fadeIn {
        from {
            opacity: 0;
            transform: translateY(25px);
        }
        to {
            opacity: 1;
            transform: translateY(0);
        }
    }

</style>

</head>
<body>

<div class="card">

    <h2>Add Employee</h2>

    <form action="addemp" method="post">

        <div class="input-group">
            <label>Employee ID</label>
            <input type="text" name="empId" placeholder="Enter employee ID" required>
        </div>

        <div class="input-group">
            <label>Name</label>
            <input type="text" name="empName" placeholder="Enter full name" required>
        </div>

        <div class="input-group">
            <label>Email</label>
            <input type="email" name="empEmail" placeholder="Enter email" required>
        </div>

        <div class="input-group">
            <label>Contact Number</label>
            <input type="number" name="empContactNo" placeholder="Enter contact number" required>
        </div>

        <div class="input-group">
            <label>City</label>
            <input type="text" name="empCity" placeholder="Enter city" required>
        </div>

        <button type="submit" class="btn">Add Employee</button>

    </form>

    <div class="footer">
        ← <a href="allemp">Back to Dashboard</a>
    </div>

</div>

</body>
</html>
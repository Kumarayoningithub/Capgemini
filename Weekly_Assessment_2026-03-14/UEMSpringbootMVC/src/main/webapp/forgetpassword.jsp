<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Forgot Password</title>

<style>

*{
    box-sizing: border-box;
}

body{
    margin:0;
    font-family: Arial, Helvetica, sans-serif;
    background: linear-gradient(135deg,#89CFF0,#6DD5FA);
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
}

.container{
    background:white;
    padding:30px;
    border-radius:12px;
    box-shadow:0 10px 25px rgba(0,0,0,0.2);
    width:350px;
}

h2{
    text-align:center;
    margin-bottom:20px;
}

table{
    width:100%;
}

td{
    padding:10px;
}

input[type=email],
input[type=password]{
    width:100%;
    padding:10px;
    border-radius:6px;
    border:1px solid #ccc;
}

.buttons{
    text-align:center;
}

input[type=submit],
input[type=reset]{
    padding:10px 18px;
    border:none;
    border-radius:6px;
    cursor:pointer;
    margin:5px;
    font-weight:bold;
}

input[type=submit]{
    background:#007BFF;
    color:white;
}

input[type=reset]{
    background:#e63946;
    color:white;
}

.links{
    text-align:center;
    margin-top:15px;
}

.btn{
    display:inline-block;
    padding:10px 18px;
    border-radius:6px;
    text-decoration:none;
    background:#28a745;
    color:white;
}

</style>
</head>

<body>

<div class="container">

<h2>Forgot Password</h2>

<form action="forgetpassword" method="post">

<table border="1">

<tr>
<td>Email</td>
<td><input type="email" name="email" required></td>
</tr>

<tr>
<td>New Password</td>
<td><input type="password" name="newPassword" required></td>
</tr>

<tr>
<td>Confirm Password</td>
<td><input type="password" name="confirmPassword" required></td>
</tr>

<tr>
<td colspan="2" class="buttons">
<input type="submit" value="Reset Password">
<input type="reset" value="Clear">
</td>
</tr>

</table>

</form>

<div class="links">
<a href="/" class="btn">Back to Login</a>
</div>

</div>

</body>
</html>
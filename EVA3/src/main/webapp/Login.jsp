<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h2>Login</h2>
    <form action="login" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="usuario" required>
        <br>
        <label for="password">Password:</label>
        <input type="password" id="password" name="contraseña" required>
        <br>
        <input type="submit" value="Login">
    </form>
        <p style="color:red;">${param.error}</p>
 </body>
</html>

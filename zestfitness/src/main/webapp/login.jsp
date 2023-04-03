
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello World</title>
    </head>
    <body>
        <div class="main-body">
          <form action="user?page=login" class="form-body" method="post">
            <h1>Login</h1>
            <div class="text-box"> username</div>
            <input type="text" name="username">
            <div class="text-box">password</div>
            <input type="text" name="password"><br>
            <input type="submit">
            <a href="register.jsp">Create new account?</a>

        </div>
        </form>
    </body>
</html>
<a href="register.jsp"></a>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign Up</title>
</head>

<%String ussername = request.getParameter("username") ;%>
<body>
    <h1>Sign Up</h1>
    <form action="signup" method="post">
        <label for="username">Username:</label><br>
        <input type="text" id="username" name="username" required><br><br>


        <button type="submit">Sign Up</button>
    </form>
</body>
</html>
</html>
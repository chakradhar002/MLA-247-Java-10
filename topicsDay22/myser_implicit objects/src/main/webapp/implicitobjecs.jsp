<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>JSP Implicit Objects</title>
</head>
<body>
    <h1>Using JSP Implicit Objects</h1>

    <%-- Using request object --%>
    <p>Client IP Address: <%= request.getRemoteAddr() %></p>

    <%-- Using session object --%>
    <% 
        session.setAttribute("username", "JohnDoe"); 
        String username = (String) session.getAttribute("username");
    %>
    <p>Session Username: <%= username %></p>

    <%-- Using application object --%>
    <% 
        application.setAttribute("appName", "My JSP Application"); 
        String appName = (String) application.getAttribute("appName");
    %>
    <p>Application Name: <%= appName %></p>
</body>
</html>

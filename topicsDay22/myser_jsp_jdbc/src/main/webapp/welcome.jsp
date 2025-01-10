<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<%
    // Database credentials
    String dbURL = "jdbc:mysql://localhost:3306/jsp_demo";
    String dbUser = "root";
    String dbPassword = "password";

    // Initialize connection
    Connection conn = null;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver"); // Load MySQL driver
        conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
    } catch (Exception e) {
        out.println("<p style='color:red;'>Error connecting to database: " + e.getMessage() + "</p>");
    }
%>

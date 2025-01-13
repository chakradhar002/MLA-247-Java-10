<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSTL Demo</title>
</head>
<body>
    <h1>JSTL Tag Demo</h1>

    <!-- 1. Display a Variable -->
    <c:set var="username" value="John Doe" />
    <p>Hello, <c:out value="${username}" />!</p>

    <!-- 2. Conditional Tag -->
    <c:if test="${username == 'John Doe'}">
        <p>Welcome, Admin!</p>
    </c:if>

    <!-- 3. Loop Example -->
    <c:set var="numbers" value="${[1, 2, 3, 4, 5]}" />
    <ul>
        <c:forEach var="num" items="${numbers}">
            <li>Number: ${num}</li>
        </c:forEach>
    </ul>

    <!-- 4. Choose Tag -->
    <c:choose>
        <c:when test="${username == 'John Doe'}">
            <p>You are the admin!</p>
        </c:when>
        <c:otherwise>
            <p>You are a guest.</p>
        </c:otherwise>
    </c:choose>
</body>
</html>

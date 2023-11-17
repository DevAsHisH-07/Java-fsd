<!-- dashboard.jsp -->
<%@ page import="com.admin.pojo.User" %>
<%@ page import="java.io.IOException" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dashboard</title>
</head>
<body>
    <h2>Dashboard</h2>
    <%
         session = request.getSession(false);
        if (session != null && session.getAttribute("user") != null) {
            User user = (User) session.getAttribute("user");
    %>
            <p>Name: <%= user.getName() %></p>
            <p>Email: <%= user.getEmail() %></p>
            <p>Date of Birth: <%= user.getDob() %></p>
            <a href="logout.jsp">Logout</a>
    <%
        } else {
            response.sendRedirect("login.jsp");
        }
    %>
</body>
</html>

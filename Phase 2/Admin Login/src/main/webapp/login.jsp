<%@ page import="com.admin.pojo.User" %>
<%@ page import="com.admin.dao.UserDao" %>
<%@ page import="com.admin.dbutil.DbUtil" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
    if (request.getMethod().equalsIgnoreCase("post")) {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        UserDao userDao = new UserDao();
        User user = userDao.getUserByEmail(email);

        if (user != null && user.getPassword().equals(password)) {
            session = request.getSession();
            session.setAttribute("user", user);
            response.sendRedirect("dashboard.jsp");
        } else {
%>
            <p>Invalid email or password. <a href="register.jsp">Register</a></p>
<%
        }
    } else {
%>
        <form action="login.jsp" method="post">
            Email: <input type="email" name="email" required><br>
            Password: <input type="password" name="password" required><br>
            <input type="submit" value="Login">
        </form>
        <a href="register.jsp">Register</a>
<%
    }
%>
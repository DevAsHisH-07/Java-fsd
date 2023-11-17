<%@page import="java.util.Date"%>
<%@ page import="com.admin.pojo.User" %>
<%@ page import="com.admin.dao.UserDao" %>
<%@ page import="com.admin.dbutil.DbUtil" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.text.SimpleDateFormat" %>

<%
    if (request.getMethod().equalsIgnoreCase("post")) {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String dobString = request.getParameter("dob");

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date dob = null;
        try {
            dob = format.parse(dobString);
        } catch (Exception e) {
            e.printStackTrace();
        }

        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        user.setDob(dob);

        UserDao userDao = new UserDao();
        userDao.saveUser(user);

%>
        <p>Registration Successful!</p>
        <a href="login.jsp">Login</a>
<%
    } else {
%>
        <form action="register.jsp" method="post">
            Name: <input type="text" name="name" required><br>
            Email: <input type="email" name="email" required><br>
            Password: <input type="password" name="password" required><br>
            Date of Birth: <input type="date" name="dob" required><br>
            <input type="submit" value="Register">
        </form>
<%
    }
%>

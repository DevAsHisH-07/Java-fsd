<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.example.demo.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details</title>
</head>
<body>
<h2>Student Details</h2>

<table border="1" cellpadding="5" cellspacing="0" width="40%">
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                
            </tr>
        </thead>
        <tbody>
            <tr>
                <td><%= request.getAttribute("id") %></td>
                <td><%= request.getAttribute("name") %></td>
                <td><%= request.getAttribute("email") %></td>

            </tr>
        </tbody>
    </table>

</body>
</html>
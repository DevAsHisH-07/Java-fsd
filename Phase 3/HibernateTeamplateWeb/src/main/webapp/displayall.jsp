<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.example.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%List<Student> list=(List<Student>)request.getAttribute("list"); %>
<table border="1">
<tr><th>Student Id</th><th>Student Name</th><th>Student Email</th></tr>
<%for(Student ss:list){ %>
<tr><td><%=ss.getId() %></td><td><%=ss.getSname() %></td><td><%=ss.getSemail() %></td></tr>
<%} %>
</table>
</body>
</html>


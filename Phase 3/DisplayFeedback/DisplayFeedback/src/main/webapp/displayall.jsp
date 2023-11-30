<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.example.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Feedback</title>
</head>
<body>
	<%
	List<Feedback> list = (List<Feedback>) request.getAttribute("list");
	%>
	<table border="1" cellspacing="2" cellpadding="3" width="30%">
		<tr>
			<th>User Id</th>
			<th>UserName</th>
			<th>Feedback</th>
		</tr>
		<%
		for (Feedback ss : list) {
		%>
		<tr>
			<td><%=ss.getId()%></td>
			<td><%=ss.getUsername()%></td>
			<td><%=ss.getFeedbacktext()%></td>
		</tr>
		<%} %>
	</table>
</body>
</html>

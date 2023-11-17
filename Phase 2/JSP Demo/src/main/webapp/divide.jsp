<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int no1=Integer.parseInt(request.getParameter("num1"));
int no2=Integer.parseInt(request.getParameter("num2"));
int res=no1/no2;
out.print("the output is "+res);
%>
</body>
</html>

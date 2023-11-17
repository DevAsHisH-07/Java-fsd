<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
if(request.getParameter("uname").equals(request.getParameter("pwd"))){
	session.setAttribute("uname", request.getParameter("uname"));
	response.sendRedirect("success.jsp");
}
else{
	out.println("Invalid user");
}
%> 

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>URL Management </h1>
<p>-----------------------------------------</p>
<c:set var="id" value="${param.id}"></c:set>
<c:set var="name" value="${param.name}"></c:set>
<c:out value="${id}"></c:out>
<c:out value="${name}"></c:out>

<h2>url with params </h2>
<c:url var="url" value="index.jsp">
<c:param name="id" value="${id}"></c:param>
<c:param name="name" value="${name}"></c:param>
</c:url>

<c:out value="${url}"></c:out>

<h2>redirect </h2>
<c:redirect url="https://www.google.com/"></c:redirect>

</body>
</html>

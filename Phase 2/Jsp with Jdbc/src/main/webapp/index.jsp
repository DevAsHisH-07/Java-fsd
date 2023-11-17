<%@page import="com.mphasis.dao.ProductDAO_Impl"%>
<%@page import="com.mphasis.dao.ProductDAO"%>
<%@page import="com.mphasis.pojo.Product"%>
<%@page import="java.util.*"%>
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
<form action="addproduct.jsp">
<input type="submit" value="addproduct"> 
</form>
<h1><i>List of Products </i></h1>
<table border="1">
<tr><th>Product Id</th><th>Product Name</th><th>Product Cost</th><th>Edit </th><th>Delete</th></tr>
<%
ProductDAO_Impl dao=new ProductDAO_Impl();
List<Product> list=dao.selectProducts();
request.setAttribute("product",list);
%>

<c:forEach items="${product}" var="p">
<tr>
<td><c:out value="${p.pid}"/> </td>
<td> <c:out value="${p.pname}"/></td>
<td><c:out value="${p.cost}"/></td>
<td><a href="edit.jsp?id=<c:out value="${p.pid}"/>">Edit</a></td>
<td><a href="delete.jsp?id=<c:out value="${p.pid}"/>">Delete</a></td>
</tr>
</c:forEach>

</table>
</body>
</html>

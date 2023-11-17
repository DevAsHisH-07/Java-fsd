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
<h1>core declarations </h1>
<p>-----------------------------------------</p>
<h2>declare and print </h2>
<c:set var="a" value="${'karthik'}"/>
<c:out value="${a}"></c:out>
<p>-----------------------------------------</p>
<h2>remove and print  </h2>
<p>before remove value of b</p>
<c:set var="b" value="${10}"/>
<c:out value="${b+100}"></c:out>
<p>after remove value of b</p>
<c:remove var="b"/>
<c:out value="${b+100}"></c:out>

<p>-----------------------------------------</p>
<h1>conditional  </h1>
<h2>--if condition--</h2>
<c:set var="a1" value="${10}"/>
<c:set var="b1" value="${100}"/>
<c:if test="${b1>a1}">
<c:out value="${'b1 is greater than a1'}"></c:out>
</c:if>

<p>-----------------------------------------</p>

<h2>--choose when otherwise </h2>
<c:set var="a2" value="${-10}"/>
<c:choose>
<c:when test="${a2>=100}">
<c:out value="${'a2 is value greater than 100' }"/>
</c:when>
<c:when test="${a2>=0 &&a<100}">
<c:out value="${'a2 is value existing between 0 to 99' }"/>
</c:when>
<c:otherwise>
<c:out value="${'a2 is negative'}"></c:out>
</c:otherwise>
</c:choose>
<p>-----------------------------------------</p>
<h2>--for each---- </h2>
<c:set var="a3" value="${0}"/>
<c:forEach var="i" begin="1" end="7">
<c:out value="${a3+i}"></c:out>
</c:forEach>

</body>
</html>

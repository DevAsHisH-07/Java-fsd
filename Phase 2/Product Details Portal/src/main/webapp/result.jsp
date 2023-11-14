<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Details</title>
</head>
<body>
    <h2>Entered Product Details</h2>
    <p>Product Name: <%= request.getAttribute("productName") %></p>
    <p>Price: <%= request.getAttribute("price") %></p>
   <a href="product.jsp">Enter Another Product Detail</a>
</body>
</html>

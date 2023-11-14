<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Details Form</title>
</head>
<body>
    <h2>Product Details Form</h2>
    <form action="ProductServlet" method="post">
        Product Name: <input type="text" name="productName"><br>
        Price: <input type="text" name="price"><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
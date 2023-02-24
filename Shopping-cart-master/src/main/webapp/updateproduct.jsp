<%@page import="dto.Product"%>
<%@page import="dao.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UPDATE PRODUCT</title>
</head>
<body>
<%int id=Integer.parseInt(request.getParameter("id")); 
ProductDao dao=new ProductDao();
Product product=dao.fetchproduct(id);
%>
<h1 style="color: red">Edit Product</h1><br>
<form action="updateproduct">
Id: <input type="text" name="id" value="<%=product.getId()%>" readonly="readonly"><br><br>
Name: <input type="text" name="name" value="<%=product.getName()%>"><br><br>
Category: <input type="text" name="category" value="<%=product.getCategory()%>" readonly="readonly"><br><br>
Price: <input type="text" name="price" value="<%=product.getPrice()%>"><br><br>
<br>
<button>Update</button> <button type="reset">Cancel</button>
</form>
<br>
<a href="viewProduct"><button>Back</button></a>
</body>
</html>
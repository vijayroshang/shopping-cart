<%@page import="dto.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ORDER</title>
</head>
<body>
<h2 style="color: grey">PLACE YOUR ORDER</h2>
<%List<Product> list=(List<Product>)session.getAttribute("productlist");%>
<form action="placeorder">
<table border="1">
<tr>
<th>Name</th>
<th>Category</th>
<th>Price</th>
<th>Select</th>
</tr>
<%char ch='a';%>
<%for(Product p:list){%>
<tr>
<th><%=p.getName()%></th>
<th><%=p.getCategory()%></th>
<th><%=p.getPrice()%></th>
<th><input type="checkbox" value="<%=p.getId()%>" name="<%=ch++%>"></th>
</tr>
<%}%>
</table>
<br>
<button>Place Order</button>
</form>
<br>
<a href="customer.html"><button>Back</button></a>
</body>
</html>
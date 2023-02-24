<%@page import="dto.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BILL</title>
</head>
<body>
<h2 style="color: green">YOUR BILL</h2><br>
<%List<Product> products=(List<Product>)session.getAttribute("products");%>
<%double sum=0;%>
<table style="text-align: left;" border="1" >
<tr>
<th>Your Order</th>
<th>Amount</th>
</tr>
<%for(Product product:products){%>
<tr>
<th><%=product.getName()%></th>
<th><%=product.getPrice()%></th>
</tr>
<%sum+=product.getPrice();%>
<%}%>
<tr>
<th>Your Total Bill Amount is: </th>
<th><%=sum%></th>
</tr>
</table>
<br>
<button onclick="window.print()">Print Bill</button><br>
<br>
<a href="customer.html"><button>Back</button></a>
</body>
</html>
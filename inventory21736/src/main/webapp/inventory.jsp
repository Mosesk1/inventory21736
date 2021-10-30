<%@page import="com.moses.Dao.StockDao"%>
<%@page import="com.moses.Model.Stock"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of inventory</title>
</head>
<body>
<a href="/inventory21736/stock-record.jsp">Add New</a>
<h1>LIST OF ALL STOCS</h1>
<%
List<Stock> stockList=StockDao.getAllStocks();
%>
<table>
<thead>
<tr>
<th>S/N</th>
<th>Name</th>
<th>Price</th>
<th>Quantity</th>
<th>manufac Date</th>
<th>Expiry Date</th>
<!-- <th>Validity</th> -->

</tr>
</thead>
<tbody>
<%
for (Stock stock:stockList){ %>
<tr>
<td><%=stock.getSn() %></td>
<td><%=stock.getName() %></td>
<td><%=stock.getPrice() %></td>
<td><%=stock.getQuantity() %></td>
<td><%=stock.getManufactureDate() %></td>
<td><%=stock.getExpiryDate() %></td>

 </tr>
<% } %>
</tbody>



</table>
</body>
</html>
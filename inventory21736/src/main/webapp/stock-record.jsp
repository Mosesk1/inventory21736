<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inventory system</title>
</head>
<body>
<!-- <body style="background-color:black ; color:white ;font-size:20px"> -->
<a href="/inventory21736/inventory.jsp">Stock List</a>
<h2>Inventory Monitoring Information System </h2>

<form action="Record" method="post">
 <label>SN </label>
 <input type="text" name="sn"  placeholder="Enter Serial number">
 <br>
 <br>
 <label>Name</label>
 <input type="text" name="name"  placeholder="Enter the name of the product">
 <br>
 <br>
 <label>Price</label>
 <input type="text" name="price"  placeholder="Enter The Brand">
 <br>
 <br>
 <label>Quantity</label>
 <input type="text" name="quantity"  placeholder="Enter the quantity">
 <br>
 <br>
 
  <label>Expiration Date</label>
 <input type="date" name="expiryDate"   placeholder="Enter your sellingPrice">
 <br>
 <br>
 <input type="submit" value="SAVE">

</form>

</body>
</html>
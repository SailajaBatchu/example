<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    	<%@ include file = "header.jsp" %>
     <%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cart</title>
<link href="css/body.css" rel="stylesheet">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="css/footer.css" rel="stylesheet">
</head>

<body >
<table border="1px" align="center">
<tr>
<td>Code</td>
<td>Product Name</td>
<td>Price</td>
<td>link</td>
</tr>

<a:forEach items="${prod}" var="prodInfo">

              <tr>
              <td>${prodInfo.p_id}</td>
               <td>${prodInfo.p_name}</td>
                <td>${prodInfo.p_price} </td>
               <td> <a href="/carting/${prodInfo.p_id}">Add to cart</a></td>              
      </tr>
   </a:forEach>
     
   </table>
 
</body><br><br><br>
<br><br><br>
<br><br><br>
<br><br><br>
<footer class="footer">
	<center>
		<p style="font-size: 15px;">Copyright ©2018. All rights reserved.</p>
	</center>
	</footer>
</html>
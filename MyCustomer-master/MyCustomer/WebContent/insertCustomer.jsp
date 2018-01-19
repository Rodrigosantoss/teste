<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Customer</title>
</head>
<body>
	<h1>New Customer</h1>
	<hr>
	<form action="/MyCustomer/InsertCustomerServlet" method="post">
		Name:<input type="text" id="name" name="name" value="">
		Email:<input type="text" id="email" name="email" value="">
		Phone:<input type="text" id="phone" name="phone" value="">
		<input type="submit" value="Save">
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
 <%@ include file="menu.jsp" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>save</title>
</head>
<body>
<h2>Create a lead...</h2>
	<form action="billInvoice" method="post">
	<pre>
	FirstName<input type="text" name="firstName" value="${record.firstName}"/>
	LastName<input type="text" name="lastName" value="${record.lastName}"/>
	Email<input type="text" name="email" value="${record.email}"/>
	Mobile<input type="text" name="mobile" value="${record.mobile}"/>
	Product<input type="text" name="product" />
	Amount<input type="text" name="amount" />
	<input type="submit" value="save" />
	</pre>
	</form>
</body>
</html>
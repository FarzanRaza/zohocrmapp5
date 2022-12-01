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
	<form action="saveLead" method="post">
	<pre>
	FirstName<input type="text" name="firstName"/>
	LastName<input type="text" name="lastName"/>
	Email<input type="text" name="email"/>
	Mobile<input type="text" name="mobile"/>
	Source:
	<select name="source">
	<option value="trade">trade</option>
	<option value="website">website</option>
	<option value="radio">radio</option>
	<option value="news">news</option>
	</select>
	<input type="submit" value="save"/>
	</pre>
	</form>
</body>
</html>
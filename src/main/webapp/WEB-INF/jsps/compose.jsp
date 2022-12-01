<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>mail sent</title>
</head>
<body>
<div>
	${msg}<br/>
</div>
<form action="emailer" method="post">
	To<input type="text" name="to" value="${email}"/>
	Subject<input type="text" name="subject"/>
	<textarea name="message" rows="5" cols="150"></textarea>
	<input type="submit" value="send"/>
	</form>
	
</body>
</html>
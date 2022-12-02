<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login page</title>
</head>
<body>
<h2>Login Here</h2>
<form action="login" method="post">
Email-id:<input type="text" name="email"/>
Password:<input type="password" name="password"/>
<input type="submit" value="login"/>
</form>
<% 
if(request.getAttribute("msg")!=null )
{
	out.println(request.getAttribute("msg"));
}
	%>
</body>
</html>
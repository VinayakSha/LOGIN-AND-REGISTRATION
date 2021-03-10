<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WELCOME PAGE</title>
</head>
<body>

<%
response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");//this will not come back to welcome page after logout

if(session.getAttribute("user")==null){
	response.sendRedirect("Login.jsp");
}

%>



<h2>Welcome to ${ user }</h2>
<br>
<div class="container">
<a href="welcome.jsp">Home</a>
<a href="aboutus.jsp">About us</a>
<a href="admin.jsp">Admin</a>

</div>
<form action="Logout">
<input type="submit" value="Logout">
</form>


</body>
</html>
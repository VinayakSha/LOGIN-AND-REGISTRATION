<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
  
<!DOCTYPE html>
<html>

<body>


<%
if(session.getAttribute("user")==null){
	response.sendRedirect("Login.jsp");
}

%>
<h3>This is Admin module</h3>

<c:forEach var="userlist" items="${array}">
<c:out value="${array}"></c:out>
</c:forEach>
</body>
</html>
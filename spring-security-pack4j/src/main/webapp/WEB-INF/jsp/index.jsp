<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<%@page import="org.pac4j.springframework.security.authentication.*"%>
<%@page import="org.springframework.security.core.*"%>
<%@page import="org.springframework.security.core.context.SecurityContextHolder"%>
<%@page import="org.pac4j.core.profile.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Authentication with Google sign in</title>
</head>
<body>

 <form action="googlelogin/index.jsp"> 
  <input type="image" style="height: 3.5em;" src="images/googlebutton.png" alt="Submit" >
</form> 


<br /><br />

<br /><br />
<a href="logout">logout</a>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World mit Tomcat und Gradle</title>
</head>
<body>
    <h1>Hallo im Projekt "testgradle2" Build/Deploy mit Gradle</h1>
   
<form action="HelloServlet" method="post">
    Bitte Namen eingeben : <input type="text" name="yourName" size="20">
    <input type="submit" value="Call Servlet" />
</form>
<br>
<a href="/testgradle2/">Startseite</a>
</body>
</html>
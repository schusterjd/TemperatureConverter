<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Celsius to Fahrenheit</title>
</head>
<body>
	<h1>Celsius to Fahrenheit</h1>
	<form action="getFarenheitServlet" method="post">
	Enter the temperature in Celsius:
	<input type="text" name="cToF" size="5">
	<input type="submit" value="Convert" />
	</form>
</body>
</html>
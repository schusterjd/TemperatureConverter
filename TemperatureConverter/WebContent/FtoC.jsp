<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fahrenheit to Celsius</title>
</head>
<body>
	<h1>Fahrenheit to Celsius</h1>
	<form action="getCelsiusServlet" method="post">
	Enter the temperature in Fahrenheit:
	<input type="text" name="fToC" size="5">
	<input type="submit" value="Convert" />
</form>
</body>
</html>
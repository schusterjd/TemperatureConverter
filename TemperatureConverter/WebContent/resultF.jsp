<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Farenheit</title>
</head>
<body>
<h1>Farenheit Result</h1>
<p>
${userTempConvertToF.getTemp()} degrees Celsius is 
${userTempConvertToF.convertToF()} degrees Farenheit.
</p>
<a href="FtoC.jsp">Convert a Farenheit temperature to Celsius</a><br>
<a href="index.jsp">Back to main page</a>
</body>
</html>
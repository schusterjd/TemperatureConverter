<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Celsius</title>
</head>
<body>
<h1>Celsius Result</h1>
<p>
${userTempConvertToC.getTemp()} degrees Farenheit is 
${userTempConvertToC.convertToC()} degrees Celsius.
</p>
<a href="CtoF.jsp">Convert a Celsius temperature to Farenheit</a><br>
<a href="index.jsp">Back to main page</a>
</body>
</html>
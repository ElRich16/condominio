<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action ="log.do" method ="post">

<input type = "hidden" name = "do" value ="login">
<input type = "text" name = "username" placeholder = "inserire username" required>
<br>
<inpt type = "password" name = "password" placeholder = "inserire password" required>

<button id = "pulsante"> login </button>




</form>


</body>
</html>
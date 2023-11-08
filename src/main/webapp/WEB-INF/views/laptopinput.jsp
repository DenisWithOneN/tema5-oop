<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="laptopsinput" method="post">
	<input type="text" name="brandName">
	<input type="submit" name="Submit">
</form>
	Numele brandului este: ${laptopBrand}
	<br>
	Si are ${brandlength} caractere
	<br>
	Paritate: ${parity}
</body>
</html>
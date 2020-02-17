<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {background-color: #ff5050;}
h1 {text-align:center;}
p {text-align:center; font-family: verdana;}
</style>
<meta charset="ISO-8859-1">
<title>Blog</title>
</head>
<body>

	<p>
	<h1>Enter your Blog</h1>

	<p>
	<form action="addBlog">
		<p>
		<input type="text" name="title" placeholder="Enter Title">
		<p>
		<textarea name ="text" placeholder="Start your blog here" rows="40" cols="120" required="required"></textarea><br>
		<input type="submit" value="Save">
	</form>

</body>
</html>
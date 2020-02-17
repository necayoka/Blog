<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {background-color: lightgreen;}
h1 {text-align:center;}
p {text-align:center; font-family: verdana;}
</style>
<meta charset="ISO-8859-1">
<title>Feedback</title>
</head>
<body>

	<form action="addFeedback">
	
		<h1>Feedback Us</h1>
		<p>
		<input type="text" name="name" placeholder="enter name" required="required"><br><br>
		<input type="text" name="email" placeholder="enter email" required="required"><br><br>
		<textarea name ="message" placeholder="enter message" rows="5" required="required"></textarea><br>

		<div class="row">
		<p>
			<input type="radio" id="rating-1" name="rating" value="1"/><label for="rating-1"></label>
			<input type="radio" id="rating-2" name="rating" value="2"/><label for="rating-2"></label>
			<input type="radio" id="rating-3" name="rating" value="3"/><label for="rating-3"></label>
			<input type="radio" id="rating-4" name="rating" value="4"/><label for="rating-4"></label>
			<input type="radio" id="rating-5" name="rating" value="5"/><label for="rating-5"></label>
		</div>
		<p>
		<input type="reset" value="reset">
		<input type="submit" value="send">
		
	</form>

</body>
</html>
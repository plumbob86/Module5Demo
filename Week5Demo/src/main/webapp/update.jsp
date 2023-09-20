<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Tree</title>
</head>
<body>


	<form action="updateTree" method="post">
		New Common Name: <input type="text" name="commonName" size="25" />
		New Latin Name: <input type="text" name="latinName" size="25" /> 
		New Average Height: <input type="text" name="avgHeight" size="25" />
		Enter the current tree name: <input type="text" name="oldName"
			size="25"> <input type="submit" value="Update" />
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a Tree</title>
</head>
<body>
<form action="addTree" method="post">
		Common Name: <input
			type="text" name="commonName" size="25"/> 
		
		Latin Name: <input
			type="text" name="latinName" size="25"/> 
		
		Average Height: <input
			type="text" name="avgHeight" size="25"> 
		<input type="submit"value="Submit" />
	</form>
</body>
</html>
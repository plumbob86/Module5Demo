<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Trees</title>
</head>
<body>
	List of all trees:
	<table>
		<c:forEach items="${requestScope.allTrees}" var="currentree">
			<tr>
				<td>${currentree.commonName}|</td>
				<td>${currentree.latinName}|</td>
				<td>${currentree.avgHeight}</td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="index.jsp">Home</a>

</body>
</html>
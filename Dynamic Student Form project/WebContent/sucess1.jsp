<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.tech.Model.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>data page</title>
</head>
<body>
	<table border="3" style="margin:right:auto;margin:left;auto;background-colour:pink">
		<tr>
		<td></td>
			<td>sId</td>
			<td>firstName</td>
			<td>MiddleName</td>
			<td>LastName</td>
			<td>StudentNumber</td>
			<td>YearLevel</td>
			<td>DegreePrograme</td>
			<td>Email</td>
			<td>pass</td>
		</tr>
		
		
<c:forEach items="${data}" var="T"  >
<tr>
<td><input type="radio" name="rd" value="${T.sId}"></td>
<td><c:out value="${T.sId}"></c:out></td>
<td><c:out value="${T.firstName}"></c:out></td>
<td><c:out value="${T.middleName}"></c:out></td>                                                                 
<td><c:out value="${T.lastName}"></c:out></td>
<td><c:out value="${T.studentNumber}"></c:out></td>
<td><c:out value="${T.yearLevel}"></c:out></td>
<td><c:out value="${T.degreePrograme}"></c:out></td>
<td><c:out value="${T.email}"></c:out></td>
<td><c:out value="${T.pass}"></c:out></td>
	</tr>
</c:forEach>
		


	</table>
</body>
</html>
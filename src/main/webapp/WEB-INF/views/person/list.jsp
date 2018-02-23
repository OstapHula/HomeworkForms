<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/style.css">
<title>Опитування</title>
</head>
<body>
	
	<h1>List Persons</h1>
	<div class="list">
 	<table>
		<tr>
			<th>Id</th>
			<th>fullName</th>
			<th>age</th>
			<th>country</th>
			<th>sex</th>
			<th>email</th>
			<th>education</th>
			<th>social</th>
			<th>favoriveLenguage</th>
			<th>os</th>
			<th>experience</th>
			<th>rank</th>
			<th>technology</th>
			<th>findOurSurvey</th>
		</tr>
		<c:forEach items="${personList}" var="person">
			<tr>
				<td>${person.id}</td>
				<td>${person.fullName}</td>
				<td>${person.age}</td>
				<td>${person.country}</td>
				<td>${person.sex}</td>
				<td>${person.email}</td>
				<td>${person.education}</td>
				<td>
					<c:forEach items="${person.social}" var="social">
						${social}<br/>
					</c:forEach>
				</td>
				<td>${person.favoriveLenguage}</td>
				<td>
					<c:forEach items="${person.os}" var="os">
						${os}<br/>
					</c:forEach>
				</td>
				<td>${person.experience}</td>
				<td>${person.rank}</td>
				<td>
					<c:forEach items="${person.technology}" var="technology">
						${technology}<br/>
					</c:forEach>
				</td>
				<td>${person.findOurSurvey}</td>
			</tr>
		</c:forEach>
	</table> 
	</div>
</body>
</html>
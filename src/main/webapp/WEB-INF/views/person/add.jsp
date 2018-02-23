<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/style.css">
<title>Опитування</title>
</head>
<body>

	<h1>Опитування</h1>
	
	<div class="add">
	<form:form 
		method="POST" 
		action="${pageContext.request.contextPath}/person/add" 
		modelAttribute="personModel"
		>
		
		<h3>Повне імя</h3>
		<form:input path="fullName" class="input"/>
		<hr/>
		<h3>Вік</h3>
			<form:select path="age" class="input">
				<form:options items="${ageList}"/>
			</form:select>
		<hr/>
		<h3>Країна проживання</h3>
			<form:select path="country" class="input">
				<form:options items="${countryList}"/>
			</form:select>
		<hr/>
		<h3>Стать</h3>
			<span><form:radiobutton path="sex" value="MAIL" label="mail"/></span>
			<span><form:radiobutton path="sex" value="FEMAIL" label="femail"/></span>
	 	<hr/>
	 	<h3>Адрес ел.пошти</h3>
			<form:input path="email" type="email" class="input"/>
		<hr/>
		<h3>Освіта</h3>
			<form:radiobuttons path="education" items="${educationList}"/>
		<hr/>
		<h3>Якими соц.мережаи корисутєтесь</h3>
			 <form:checkboxes items="${socialList}" path="social"/>
		<hr/>
		<h3>Улюблена мова програмування</h3>
			<span><form:radiobutton path="favoriveLenguage" value="Java" label="Java"/></span>
			<span><form:radiobutton path="favoriveLenguage" value="C++" label="C++"/></span>
			<span><form:radiobutton path="favoriveLenguage" value="Pyton" label="Pyton"/></span>
			<span><form:radiobutton path="favoriveLenguage" value="JavaScript" label="JavaScript"/></span>
			<span><form:radiobutton path="favoriveLenguage" value="C#" label="C#"/></span>
			<span><form:radiobutton path="favoriveLenguage" value="PHP" label="PHP"/></span>
			<span><form:radiobutton path="favoriveLenguage" value="Perl" label="Perl"/></span>
			<span><form:radiobutton path="favoriveLenguage" value="Other" label="Other"/></span>
		<hr/>
		<h3>Якими ОС користуєтесь </h3>
			<form:checkboxes items="${osList}" path="os"/>
		<hr/>
		<h3>Досвід у програмуванні </h3>
			<form:input path="experience" class="input"/>
		<hr/>
		<h3>Ранг в професії </h3>
			<form:select path="rank" class="input">
				<form:options items="${rankList}"/>
			</form:select>
		<hr/>
		<h3>Технології якими володієте: </h3>
			<form:checkboxes items="${technologyList}" path="technology"/>
		<hr/>
		<h3>Звідки дізнались про наше опитування </h3>
			<form:input path="findOurSurvey" class="input"/>
		<br/>
		<input type="submit" value="Закінчити опитування" class="button">
	</form:form>
	</div>

</body>
</html>
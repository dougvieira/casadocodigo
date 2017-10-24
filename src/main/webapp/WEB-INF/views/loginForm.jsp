<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta content="UTF-8">
<title>Livros de java, Android, Iphone, PHP, Ruby e muito mais - Casa do código</title>

<c:url value="/resources/css" var="cssPath"/>

<link rel="stylesheet" href="${cssPath }/bootstrap.min.css">
<link rel="stylesheet" href="${cssPath }/bootstrap-theme.min.css">
<script src="resourcers/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="container">
		<h1>Login da Casa Do Código</h1>
		<form:form servletRelativeAction="/login" method="post" >
			<div class="form-group">
				<label>E-mail</label>
				<input path="username" type="text" cssClass="form-control"/>
			</div> 
			<div class="form-group">
				<label>Senha</label>
				<input path="password" type="password" cssClass="form-control"/>
			</div>
			
			<button type="submit" class="btn btn-primary">Logar</button>
		</form:form>
	</div>
</body>
</html>
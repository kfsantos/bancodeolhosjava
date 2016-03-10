<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css"
	href="../bootstrap/css/bootstrap.css">
<title>Formulario de Busca</title>
</head>
<body>
	<br />
	<h2>Buscar por Nome</h2>
	<br />
	<div class="container">
		<form action="<c:url value='/doador/buscarporitem'/>" method="post">

			<br /> Nome<input class="form-control" type="text"
				name="doador.nome"> <br />
			<button class="btn btn-primary" type="submit">Buscar</button><br/>
		
		</form>
		
	</div>
	<c:forEach items="${errors}" var="erro">
		${erro.category} - ${erro.message} <br />
	</c:forEach>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css"
	href="../bootstrap/css/bootstrap.css">
<title>Login</title>
</head>
<body>
	<dir class="container">
	<h1 align="center">Login</h1>
		<form action="<c:url value='/login/autentica'/>" method="post">
			Nome<input class="form-control" type="text" name="usuario.nome"><br />
			Senha<input class="form-control" type="password" name="usuario.senha"><br />
			<button class="btn btn-primary" type="submit">Logar</button>
		</form>


	</dir>
	<br />
	<c:forEach items="${errors }" var="erro">
${erro.category} - ${erro.message} <br />
	</c:forEach>
</body>
</html>
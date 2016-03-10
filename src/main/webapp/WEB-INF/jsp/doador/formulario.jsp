<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css"
	href="../bootstrap/css/bootstrap.css">
<title>Formulário de Cadastro de Doador</title>
</head>
<body>
	<div class="container">
		<h2>Novo Doador</h2>
		<br />
		<form action="<c:url value='/doador/adicionar'/>" method="post">
			Nome:<input class="form-control" type="text" name="doador.nome"><br />
			Sexo:<input class="form-control" type="text" name="doador.sexo"><br />
			Endereço:<input class="form-control" type="text"
				name="doador.endereco.rua"><br /> Receptor:<input
				class="form-control" type="text"
				name="doador.relatorioDoador.receptor"><br /> Causa de
			Morte:<input class="form-control" type="text"
				name="doador.relatorioProducao.causaDaMorte"><br />
			<button class="btn btn-primary" type="submit">Cadastrar</button>
		</form>

	</div>
	<br/>
	<c:forEach items="${errors}" var="erro">
		${erro.category} - ${erro.message} <br />
	</c:forEach>

</body>
</html>
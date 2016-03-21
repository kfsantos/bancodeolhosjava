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
		<h2>Edição de Doador</h2>
		<br />
		<form action="<c:url value='/doador/adicionar'/>" method="post" items="${doadorEncontrado}" var="doador">
		
			<input class="form-control" type="hidden" name="doador.id" value="${doador.id}"><br />
			<input class="form-control" type="hidden" name="doador.endereco.id" value="${doador.endereco.id}"><br />
			<input class="form-control" type="hidden" name="doador.relatorioDoador.id" value="${doador.relatorioDoador.id}"><br />
			<input class="form-control" type="hidden" name="doador.relatorioProducao.id" value="${doador.relatorioProducao.id}"><br />
			Nome:<input class="form-control" type="text" name="doador.nome" value="${doador.nome}"><br />
			Sexo:<input class="form-control" type="text" name="doador.sexo" value="${doador.sexo}"><br />
			Endereço:<input class="form-control" type="text"
				name="doador.endereco.rua" value="${doador.endereco.rua}"><br /> Receptor:<input
				class="form-control" type="text"
				name="doador.relatorioDoador.receptor" value="${doador.relatorioDoador.receptor}"><br /> Causa de
			Morte:<input class="form-control" type="text"
				name="doador.relatorioProducao.causaDaMorte" value="${doador.relatorioProducao.causaDaMorte}"><br />
			<button class="btn btn-primary" type="submit">Salvar</button>
		
			</form>

	</div>
	<br/>
	<c:forEach items="${errors}" var="erro">
		${erro.category} - ${erro.message} <br />
	</c:forEach>

</body>
</html>
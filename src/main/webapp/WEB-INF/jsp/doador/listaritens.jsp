<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css"
	href="../bootstrap/css/bootstrap.css">
<title>Resultado da Busca</title>
</head>
<body>
<div class="container">
		<h1>Listagem de Doadores</h1>

		<table class="table table-stripped table-hover table-bordered">
			<thead>
				<tr>
					<th>Nome</th>
					<th>Sexo</th>
					<th>Endereço</th>
					<th>Receptor</th>
					<th>Causa da Morte</th>
					<th>Remover</th>
					<th>Editar</th>
					
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${doadorList}" var="doador">
					<tr>
						<td>${doador.nome}</td>
						<td>${doador.sexo}</td>
						<td>${doador.endereco.rua}</td>
						<td>${doador.relatorioDoador.receptor}</td>
						<td>${doador.relatorioProducao.causaDaMorte}</td>
						<td><a
							href="<c:url value="/doador/remover"/>?doador.id=${doador.id}"
							onclick="return confirm('Desejar remover o doador?')">Remover</a>
						</td>
						<td>
							<a href="<c:url value="/doador/editar"/>?doador.id=${doador.id}">
							Editar
							</a>
							
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="${linkTo[DoadorController].formulario()}">Adicionar Produto</a><br/><br/>
		<a href="${linkTo[DoadorController].formulariobusca()}">Buscar Produto</a><br/><br/>
		${mensagem}
	</div>
</body>
</html>
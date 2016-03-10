<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css"
	href="../bootstrap/css/bootstrap.css">
<title>Lista de Doadores</title>
</head>
<body>
<h3>Você está logado como ${usuarioLogado.usuario.nome}</h3>
	<div class="container">
<br/>
<h2>Lista de Doadores</h2>		
<br/>
		<table class="table table-stripped table-hover table-bordered">
			<thead>
				<tr>
					<th>Nome</th>
					<th>Sexo</th>
					<th>Endereço</th>
					<th>Receptor</th>
					<th>Causa da Morte</th>					
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
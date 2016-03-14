package br.com.bancodeolhosjava.controllers;

import javax.inject.Inject;
import javax.validation.Valid;

import br.com.bancodeolhosjava.daos.DoadorDao;
import br.com.bancodeolhosjava.models.Doador;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.validator.Validator;

@Controller
public class DoadorController {

	private final Validator validator;
	private final DoadorDao doadorDAO;
	private final Result result;

	@Inject
	public DoadorController(Validator validator, DoadorDao doadorDAO, Result result) {
		this.validator = validator;
		this.doadorDAO = doadorDAO;
		this.result = result;
	}

	public DoadorController() {
		this(null, null, null);
	}

	@Get
	public void inicio() {

	}

	@Get
	public void formulario() {

	}

	@Get
	public void formulariobusca() {

	}

	@Get
	public void lista() {
		result.include("doadorList", doadorDAO.listar());
	}

	@Get
	public void listaritens(String nome) {
		result.include("doadorList", doadorDAO.buscarporitem(nome));
	}

	@Post
	public void adicionar(@Valid Doador doador) {
		validator.onErrorForwardTo(this).formulario();
		doadorDAO.salvar(doador);
		result.include("mensagem", "Doador incluso com sucesso!");
		result.redirectTo(this).lista();
	}
	@Post
	public void remover(Doador doador) {
		doadorDAO.remover(doador);
		result.include("mensagem", "Doador removido com sucesso!");
		result.redirectTo(this).lista();
	}

	@Post
	public void buscarporitem(@Valid Doador doador) {
		validator.onErrorForwardTo(this).formulariobusca();
		result.redirectTo(this).listaritens(doador.getNome());
	}

}

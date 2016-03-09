package br.com.bancodeolhosjava.controllers;

import javax.inject.Inject;

import br.com.bancodeolhosjava.daos.DoadorDao;
import br.com.bancodeolhosjava.models.Doador;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.validator.Validator;

@Controller
public class DoadorController {

	private final Validator validator;
	private final DoadorDao doadorDAO;
	private final Result result;
	
	@Inject
	public DoadorController(Validator validator, DoadorDao doadorDAO, Result result){
		this.validator = validator;
		this.doadorDAO = doadorDAO;
		this.result = result;
	}
	
	public DoadorController(){
		this(null, null, null);
	}
	
	public void inicio(){
		
	}
	
	public void formulario(){
		
	}
	
	public void listar(){
		result.include("doadorList", doadorDAO.listar());
	}
	
	public void formulariobusca(){
		
	}
	
	public void adicionar(Doador doador){
		validator.onErrorForwardTo(this).formulario();
		doadorDAO.salvar(doador);
		result.include("mensagem", "Doador incluso com sucesso!");
		result.redirectTo(this).listar();
	}
	
	public void remover(Doador doador){
		doadorDAO.remover(doador);
		result.include("mensagem", "Doador removido com sucesso!");
		result.redirectTo(this).listar();
	}
	
	public void buscar(Doador doador){
		validator.onErrorForwardTo(this).formulariobusca();
		result.redirectTo(this).resultadobusca(doador.getNome());
	}

	private void resultadobusca(String nome) {
		result.include("doadorList", doadorDAO.buscarporitem(nome));
		// TODO Auto-generated method stub
		
	}
	
}

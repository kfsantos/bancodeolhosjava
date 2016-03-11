package br.com.bancodeolhosjava.controllers;

import javax.inject.Inject;

import br.com.bancodeolhosjava.daos.UsuarioDao;
import br.com.bancodeolhosjava.models.Usuario;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.validator.I18nMessage;
import br.com.caelum.vraptor.validator.Validator;
@Controller
public class LoginController {
		
	private final Result result;
	private final Validator validator;
	private final UsuarioLogado usuarioLogado;
	private final UsuarioDao dao;
	
	@Inject
	public LoginController(Result result, Validator validator, UsuarioLogado usuarioLogado, UsuarioDao dao){
	
		this.result = result;
		this.validator = validator;
		this.usuarioLogado = usuarioLogado;
		this.dao = dao;
	}
	
	public LoginController(){
		this(null, null, null, null);
	}
	@Get 
	public void formulario(){
		
	}
	@Post
	public void autentica(Usuario usuario){
		System.out.println("nome "+usuario.getNome()+" senha "+usuario.getSenha());
		if(!dao.existe(usuario)){
			validator.add(new I18nMessage("login", "login.invalido"));
			validator.onErrorForwardTo(this).formulario();
		}
		
		usuarioLogado.setUsuario(usuario);
		result.redirectTo(DoadorController.class).lista();
	}
	
	

}

package br.com.bancodeolhosjava.controllers;

import javax.inject.Inject;

import br.com.bancodeolhosjava.daos.UsuarioDao;
import br.com.bancodeolhosjava.models.Usuario;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.validator.Validator;

@Controller
public class UsuarioController {
	private final UsuarioDao usuarioDao;
	private final Validator validator;
	private final Result result;

	@Inject
	public UsuarioController(UsuarioDao usuarioDao, Validator validator, Result result) {
		this.usuarioDao = usuarioDao;
		this.validator = validator;
		this.result = result;
	}

	public UsuarioController() {
		this(null, null, null);
	}
	@Get
	public void formulario(){
		
	}
@Post
	public void adicionar(Usuario usuario) {
		validator.onErrorForwardTo(this).formulario();
		usuarioDao.salvar(usuario);
		result.include("mensagem", "Usuário foi adicionado com sucesso!!");
		result.redirectTo(this).formulario();
	}
}

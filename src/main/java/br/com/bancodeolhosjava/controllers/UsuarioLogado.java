package br.com.bancodeolhosjava.controllers;
import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.com.bancodeolhosjava.models.Usuario;
@SuppressWarnings("serial")
@SessionScoped
@Named
public class UsuarioLogado implements Serializable {
	private Usuario usuario;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}

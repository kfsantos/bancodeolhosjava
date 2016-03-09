package br.com.bancodeolhosjava.daos;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.bancodeolhosjava.models.Usuario;

public class UsuarioDao {
	private final EntityManager em;
	
	@Inject
	public UsuarioDao(EntityManager em){
		this.em = em;
	}
	
	public UsuarioDao(){
		this(null);
	}
	
	public void salvar(Usuario usuario){
		em.persist(usuario);
	}
	
	public void remover(Usuario usuario){
		em.remove(buscar(usuario));
	}

	private Usuario buscar(Usuario usuario) {
		// TODO Auto-generated method stub
		return em.find(Usuario.class, usuario.getId());
	}

}

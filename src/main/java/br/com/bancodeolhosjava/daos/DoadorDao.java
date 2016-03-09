package br.com.bancodeolhosjava.daos;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.bancodeolhosjava.models.Doador;

public class DoadorDao {
	private final EntityManager em;

	@Inject
	public DoadorDao(EntityManager em) {
		this.em = em;
	}

	public DoadorDao() {
		this(null);
	}

	public void salvar(Doador doador) {
		em.persist(doador);
	}

	public void remover(Doador doador) {
		em.remove(buscar(doador));
	}

	private Doador buscar(Doador doador) {
		return em.find(Doador.class, doador.getId());
	}

	public List<Doador> listar() {
		return em.createQuery("select d from doador d", Doador.class).getResultList();
	}
	
	public List<Doador>buscarporitem(String nome){
		return em.createQuery("select d from doador d where d.nome like :nome", Doador.class).setParameter("nome", "%" +nome+ "%").getResultList();
	}
}

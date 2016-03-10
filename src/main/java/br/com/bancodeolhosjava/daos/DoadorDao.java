package br.com.bancodeolhosjava.daos;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.bancodeolhosjava.models.Doador;
import br.com.bancodeolhosjava.models.Usuario;

@RequestScoped
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
		em.getTransaction().begin();
		em.persist(doador);
		em.getTransaction().commit();
	}

	public void remover(Doador doador) {
		em.getTransaction().begin();
		em.remove(buscar(doador));
		em.getTransaction().commit();
	
	}

	private Doador buscar(Doador doador) {
		return em.find(Doador.class, doador.getId());
	}

	@SuppressWarnings("unchecked")
	public List<Doador> listar() {
		return em.createQuery("select d from Doador d").getResultList();
	}

	public List<Doador> buscarporitem(String nome) {
		return em.createQuery("select d from Doador d where d.nome like :nome", Doador.class)
				.setParameter("nome", "%" + nome + "%").getResultList();
	}

	
}

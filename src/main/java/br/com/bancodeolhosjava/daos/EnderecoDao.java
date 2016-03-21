package br.com.bancodeolhosjava.daos;

import javax.persistence.EntityManager;

import br.com.bancodeolhosjava.models.Endereco;

public class EnderecoDao {
	private final EntityManager em;
	
	public EnderecoDao(EntityManager em){
		this.em = em;
	}
	
	public EnderecoDao(){
		this(null);
	}
	
	public void atualizar(Endereco endereco){
		em.getTransaction().begin();
		em.merge(endereco);
		em.getTransaction().commit();
	}

}

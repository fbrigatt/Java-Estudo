package com.algaworks.curso.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.curso.modelo.Cliente;

public class SalvandoPrimeiroObjeto {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();

		Cliente c = new Cliente();
		c.setNome("Pedro Bial");
		c.setIdade(40);
		c.setProfissao("Jornalista");
		c.setSexo("M");

		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();

		System.out.println("Cliente salvo com sucesso");

		// em.close();
	}

}

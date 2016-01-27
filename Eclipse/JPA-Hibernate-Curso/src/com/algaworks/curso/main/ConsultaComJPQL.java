package com.algaworks.curso.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.curso.modelo.Cliente;

public class ConsultaComJPQL {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();

		List<Cliente> clientes = em.createQuery("from Cliente where sexo = 'M'", Cliente.class).getResultList();

		for (Cliente c : clientes) {
			System.out.println("Codigo: " + c.getCodigo());
			System.out.println("Nome: " + c.getNome());
			System.out.println("Sexo: " + c.getSexo());
			System.out.println("-----------------------");
		}
	}
}
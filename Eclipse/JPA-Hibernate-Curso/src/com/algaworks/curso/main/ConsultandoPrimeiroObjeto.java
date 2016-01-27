package com.algaworks.curso.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.curso.modelo.Cliente;

public class ConsultandoPrimeiroObjeto {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();

		Cliente c = em.find(Cliente.class, 3L);

		if (c != null) {
			System.out.println("Nome: " + c.getNome());
			System.out.println("Idade: " + c.getIdade());
			System.out.println("Profissao: " + c.getProfissao());
			System.out.println("Sexo: " + c.getSexo());
		} else {
			System.out.println("Cliente não encontrado");
		}
	}
}

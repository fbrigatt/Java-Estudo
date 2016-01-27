package com.exercicios.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.exercicios.modelo.Agenda;

public class RemovendoAgenda {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploAgenda");
		EntityManager em = emf.createEntityManager();

		Agenda a = em.find(Agenda.class, 3L);

		em.getTransaction().begin();
		em.remove(a);
		em.getTransaction().commit();

		System.out.println("Contato Removido");
	}
}

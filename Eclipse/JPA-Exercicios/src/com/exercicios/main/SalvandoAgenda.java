package com.exercicios.main;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.exercicios.modelo.Agenda;

public class SalvandoAgenda {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploAgenda");
		EntityManager em = emf.createEntityManager();

		Agenda a = new Agenda();
		a.setNome("Raphael Silva");
		a.setTelefone("123456");
		a.setDataRegistro(new Date());

		em.getTransaction().begin();
		em.persist(a);
		em.getTransaction().commit();

		System.out.println("Contato Salvo na Agenda");
	}
}

package com.exercicios.main;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.exercicios.modelo.Agenda;

public class AtualizandoAgenda {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploAgenda");
		EntityManager em = emf.createEntityManager();

		Agenda a = em.find(Agenda.class, 2L);

		em.getTransaction().begin();
		a.setNome("Silva Raphael");
		a.setTelefone("987654321");
		a.setDataRegistro(new Date());
		em.getTransaction().commit();

		System.out.println("Contato Atualizado");

	}
}

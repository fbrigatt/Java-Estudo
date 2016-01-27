package com.exercicios.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.exercicios.modelo.Agenda;

public class ConsultandoAgenda {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploAgenda");
		EntityManager em = emf.createEntityManager();

		Agenda a = em.find(Agenda.class, 1L);

		System.out.println("Nome: " + a.getNome());
		System.out.println("Telefone: " + a.getTelefone());
		System.out.println("Data " + a.getDataRegistro());
	}
}

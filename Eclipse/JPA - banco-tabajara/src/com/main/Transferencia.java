package com.main;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.modelo.Conta;

public class Transferencia {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bancoTabajaraPU");
		EntityManager em = emf.createEntityManager();

		Scanner entrada = new Scanner(System.in);

		Conta c1 = em.find(Conta.class, 1L);
		if (c1 == null) {
			System.out.println("Digite o saldo inicial da conta 1: ");
			Double saldoInicialConta1 = entrada.nextDouble();
			c1 = new Conta();
			c1.setSaldo(saldoInicialConta1);
		}

		Conta c2 = em.find(Conta.class, 2L);
		if (c2 == null) {
			System.out.println("Digite o saldo inicial da conta 2: ");
			Double saldoInicialConta1 = entrada.nextDouble();
			c2 = new Conta();
			c2.setSaldo(saldoInicialConta1);
		}

		em.getTransaction().begin();
		em.persist(c1);
		em.persist(c2);
		em.getTransaction().commit();

		System.out.println("Saldo da Conta 1: " + c1.getSaldo());
		System.out.println("Saldo da Conta 2: " + c2.getSaldo());

		em.close();// fechando sess�o
		em = emf.createEntityManager();

		System.out.println("--------------------------");
		System.out.println("Digite o valor para retirar da conta 1 e depositar na conta 2: ");
		Double valorTransferencia = entrada.nextDouble();

		em.getTransaction().begin();
		c1.setSaldo(c1.getSaldo() - valorTransferencia);
		c2.setSaldo(c2.getSaldo() + valorTransferencia);

		em.merge(c1);
		em.merge(c2);

		if (c1.getSaldo() > 0) {
			em.getTransaction().commit();
			System.out.println("Transferencia realizada com sucesso");
		} else {
			em.getTransaction().rollback();
			System.err.println("Transferencia n�o realizada, saldo insuficiente");
		}
	}
}

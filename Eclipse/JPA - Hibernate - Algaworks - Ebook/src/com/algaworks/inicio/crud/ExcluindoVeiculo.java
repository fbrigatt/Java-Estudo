package com.algaworks.inicio.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.algaworks.inicio.factory.JpaUtil;
import com.algaworks.inicio.modelo.Veiculo;

public class ExcluindoVeiculo {
	public static void main(String[] args) {
		EntityManager manager = JpaUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();

		tx.begin();

		Veiculo veiculo = manager.find(Veiculo.class, 1L);

		manager.remove(veiculo);

		tx.commit();

		manager.close();
		JpaUtil.close();
	}
}

package com.algaworks.inicio.crud;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.algaworks.inicio.factory.JpaUtil;
import com.algaworks.inicio.modelo.Veiculo;

public class PersistindoVeiculo {

	public static void main(String[] args) {
		int i = 0;

		EntityManager manager = JpaUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		// do {
		tx.begin();

		Veiculo veiculo = new Veiculo();
		veiculo.setFabricante("Honda");
		veiculo.setModelo("Civic");
		veiculo.setAnoFabricacao(2012);
		veiculo.setAnoModelo(2013);
		veiculo.setValor(new BigDecimal(71300));

		manager.persist(veiculo);

		tx.commit();
		// i++;
		// } while (i < 5);

		manager.close();
		JpaUtil.close();

		System.out.println("Salvo no BD");
	}
}
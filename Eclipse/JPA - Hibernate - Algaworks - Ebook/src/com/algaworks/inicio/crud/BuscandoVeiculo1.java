package com.algaworks.inicio.crud;

import javax.persistence.EntityManager;

import com.algaworks.inicio.factory.JpaUtil;
import com.algaworks.inicio.modelo.Veiculo;

public class BuscandoVeiculo1 {

	public static void main(String[] args) {
		EntityManager manager = JpaUtil.getEntityManager();

		Veiculo veiculo = manager.find(Veiculo.class, 1L);

		System.out.println("Veículo de código " + veiculo.getCodigo() + " é um " + veiculo.getModelo());

		manager.close();
		JpaUtil.close();
	}
}

package com.algaworks.inicio.crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.algaworks.inicio.factory.JpaUtil;
import com.algaworks.inicio.modelo.Veiculo;

public class ListandoVeiculos {

	public static void main(String[] args) {
		EntityManager manager = JpaUtil.getEntityManager();

		Query query = manager.createQuery("from Veiculo");
		List<Veiculo> veiculos = query.getResultList();

		for (Veiculo veiculo : veiculos) {
			System.out.println(veiculo.getCodigo() + " - " + veiculo.getFabricante() + " " + veiculo.getModelo()
					+ ", ano " + veiculo.getAnoFabricacao() + "/" + veiculo.getAnoModelo() + " por " + "R$"
					+ veiculo.getValor());
		}

		manager.close();
		JpaUtil.close();
	}
}

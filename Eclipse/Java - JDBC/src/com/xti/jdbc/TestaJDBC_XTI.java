package com.xti.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestaJDBC_XTI {

	public static void main(String[] args) throws SQLException {
		Connection con = ConnectionFactory.getConnection();

		ContaDAO dao = new ContaDAO();

		Conta c1 = new Conta(1, "Raphael", 1000);
		Conta c2 = new Conta(2, "Silva", 2000);
		Conta c3 = new Conta(3, "Oliveira", 3000);

		// crud.salvar(con, c1);
		// crud.salvar(con, c2);
		// crud.salvar(con, c3);

		// c1.saldo = 39;
		// crud.alterar(con, c1);

		// crud.excluir(con, c1);

		List<Conta> contas = dao.listar(con);

		for (Conta conta : contas) {
			System.out.println(conta);
		}

		// Testando transferencia
		Conta origem = contas.get(0);
		Conta destino = contas.get(1);
		dao.transferir(con, origem, destino, 1500);

		System.out.println();

		// listar valores das transferencias
		contas = dao.listar(con);
		for (Conta conta : contas) {
			System.out.println(conta);
		}

	}
}

package com.xti.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContaDAO {

	public void salvar(Connection con, Conta conta) throws SQLException {
		String sql = "insert into conta values(?, ?, ?);";

		try (PreparedStatement stmt = con.prepareStatement(sql)) {

			stmt.setInt(1, conta.numero);
			stmt.setString(2, conta.nome);
			stmt.setDouble(3, conta.saldo);
			stmt.execute();

			System.out.println("Salvo com Sucesso");
		}
	}

	public void alterar(Connection con, Conta conta) throws SQLException {
		String sql = "update conta set cliente=?, saldo=? where numero=?;";

		try (PreparedStatement stmt = con.prepareStatement(sql)) {

			stmt.setString(1, conta.nome);
			stmt.setDouble(2, conta.saldo);
			stmt.setInt(3, conta.numero);
			int row = stmt.executeUpdate();

			System.out.println("Alterado com Sucesso: " + row + " linhas");
		}
	}

	public void excluir(Connection con, Conta conta) throws SQLException {
		String sql = "delete from conta where numero=?;";

		try (PreparedStatement stmt = con.prepareStatement(sql)) {

			stmt.setInt(1, conta.numero);
			int row = stmt.executeUpdate();

			System.out.println("Deletado com Sucesso: " + row + " linhas");
		}
	}

	public List<Conta> listar(Connection con) throws SQLException {
		List<Conta> lista = new ArrayList<>();
		String sql = "select numero, cliente, saldo from conta";
		try (PreparedStatement stmt = con.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
			while (rs.next()) {
				lista.add(new Conta(rs.getInt(1), rs.getString(2), rs.getDouble(3)));
			}
		}
		return lista;
	}

	public void transferir(Connection con, Conta origem, Conta destino, double valor) throws SQLException {

		if (origem.saldo >= valor) {

			try {
				con.setAutoCommit(false);

				/* SAQUE */
				origem.saldo -= valor;
				alterar(con, origem);

				/* DEPÓSITO */
				destino.saldo += valor;
				alterar(con, destino);
				con.commit();

			} catch (Exception e) {
				con.rollback();
				System.out.println("Erro na transferencia");
			}
		}
	}

}
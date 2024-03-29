package com.xti.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InserePessoaEmail {
	public static void main(String[] args) throws SQLException {

		String sql = "insert into pessoa (nome, sexo, email) values (?, ?, ?)";
		String[] pessoas = { "Sandra", "Beatriz", "Juliana", "Fatima" };

		Connection con = ConnectionFactory.getConnection();

		try (PreparedStatement stmt = con.prepareStatement(sql)) {

			for (int i = 0; i < pessoas.length; i++) {
				stmt.setString(1, pessoas[i]);
				stmt.setString(2, "F");
				stmt.setString(3, pessoas[i].toLowerCase() + "@xti.com.br");
				stmt.addBatch();
			}
			stmt.executeBatch();

			System.out.println("Contato salvo no banco");
		} catch (Exception e) {
		}
		System.out.println("Erro no bd");

		sql = "select * from pessoa";
		try (PreparedStatement stmt2 = con.prepareStatement(sql); ResultSet rs = stmt2.executeQuery()) {
			while (rs.next()) {
				System.out.println("Nome: " + rs.getString("nome"));
				System.out.println("Email: " + rs.getString("email"));
				System.out.println("---------------");
			}
		}

	}
}

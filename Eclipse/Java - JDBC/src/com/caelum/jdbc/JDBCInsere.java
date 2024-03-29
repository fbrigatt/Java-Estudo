package com.caelum.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

import com.caelum.jdbc.dao.ConnectionFactory;

public class JDBCInsere {

	public static void main(String[] args) throws SQLException {

		// conectando
		// Connection con = new ConnectionFactory().getConnection();

		try (Connection con = new ConnectionFactory().getConnection()) {
			// cria um preparedStatement
			String sql = "insert into contatos " + "(nome, email, endereco, dataNascimento)" + "values(?,?,?,?)";

			PreparedStatement stmt = con.prepareStatement(sql);

			// preenche os valores
			stmt.setString(1, "Caelum");
			stmt.setString(2, "contato@caelum.com.br");
			stmt.setString(3, "Rua da cidade");
			stmt.setDate(4, new java.sql.Date(Calendar.getInstance().getTimeInMillis()));

			// executa
			stmt.execute();

			// utilizando o Statement
			// String sql = "insert into contatos (nome) values ('Raphael')";
			// Statement stmt = con.createStatement();
			// stmt.execute(sql);

			stmt.close();

			System.out.println("Salvo no banco de dados");
		} catch (SQLException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}

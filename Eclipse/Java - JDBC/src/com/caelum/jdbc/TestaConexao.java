package com.caelum.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import com.caelum.jdbc.dao.ConnectionFactory;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {

		// Connection conexao =
		// DriverManager.getConnection("jdbc:mysql://localhost/fj21", "root",
		// "admin");
		Connection conexao = ConnectionFactory.getConnection();
		System.out.println("Conectado");
		conexao.close();
	}
}

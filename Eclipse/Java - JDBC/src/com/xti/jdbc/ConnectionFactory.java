package com.xti.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection getConnection() throws SQLException {
		System.out.println("Conectado");
		return DriverManager.getConnection("jdbc:mysql://localhost/xti", "root", "admin");
	}
}
package com.RouletteAPI.model;

import java.sql.Connection;
import java.sql.SQLException;
import org.apache.commons.dbcp2.BasicDataSource;

public class ConnectionDataBase {

	private final String DATABASE = "roulette";
	private final String URL = "jdbc:mysql://localhost:3306/" + DATABASE;
	private final String USER = "root";
	private final String PASSWORD = "root";
	private static ConnectionDataBase connectionDataBase;
	private BasicDataSource basicDataSource = null;

	private ConnectionDataBase() {
		basicDataSource = new BasicDataSource();
		basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		basicDataSource.setUsername(USER);
		basicDataSource.setPassword(PASSWORD);
		basicDataSource.setUrl(URL);
	}

	public static ConnectionDataBase getInstance() {
		if (connectionDataBase == null) {
			connectionDataBase = new ConnectionDataBase();
			return connectionDataBase;
		} else {
			return connectionDataBase;
		}
	}

	public Connection getConnection() {
		try {
			return this.basicDataSource.getConnection();
		} catch (SQLException e) {
			return null;
		}
	}

	public void closeConnection(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			System.out.println("Error al cerrar la conexion");
		}
	}
}
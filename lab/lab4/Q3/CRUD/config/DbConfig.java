package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConfig {
	private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	private static final String DATABASE_NAME = "crud_java";
	private static final String URL = "jdbc:mysql://localhost:3306/";
	private static final String USERNAME = "alphajr";
	private static final String PASSWORD = "password";

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(DRIVER_NAME);
		return DriverManager.getConnection(URL + DATABASE_NAME, USERNAME, PASSWORD);
	}

}

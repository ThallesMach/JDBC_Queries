package br.com.testajdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ConnectMySQL {

	public static void main(String[] args) throws Exception {


//		String url = "jdbc:mysql://localhost/softblue";
		
		String url = "jdbc:mysql://localhost/softblue?useSSL=false&serverTimezone=UTC";

		try (Connection conn = DriverManager.getConnection(url, "root", "")) {
			System.out.println("Conectou no banco de dados");


		}
	}
}


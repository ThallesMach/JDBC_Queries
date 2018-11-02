package br.com.dadojdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class ConnectMySQL {

	public static void main(String[] args) throws Exception {


//		String[] nomesProdutos = { "Feijão", "Batata", "Cebola", "tomate" };
		
//		String url = "jdbc:mysql://localhost/softblue";
		String url = "jdbc:mysql://localhost/softblue";

		try (Connection conn = DriverManager.getConnection(url, "root", "")) {
			System.out.println("Conectou no banco de dados");
			 
			String sql = "INSERT INTO Produto(id, nome) VALUES (null, 'Cebola')";
			
			try( Statement stmt = conn.createStatement() ){
				stmt.executeUpdate(sql);
				System.out.println("Produto inserido!");
			}
			
			
		}
	}
}


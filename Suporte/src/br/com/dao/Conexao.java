package br.com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class Conexao {
	
	protected Connection conn = null; 
	protected PreparedStatement pst = null; 
	protected ResultSet rs = null;
	
	public void abrirConexao() { 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://10.26.44.246:6020/suportedb?usetimezone=true","root","johnny1930");
		}
		catch(SQLException se) {
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	

}
public void fecharConexao() {
	try {
		conn.close();
	}
	catch(SQLException se) {
		se.printStackTrace(); 

	}
	catch(Exception e) { 
		e.printStackTrace(); 
		
	}
	
}
}
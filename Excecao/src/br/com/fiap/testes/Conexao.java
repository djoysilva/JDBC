package br.com.fiap.testes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {
	public static void main(String[] args) throws SQLException{
		Connection conectar = null;
		Statement estrutura = null;
		ResultSet resultado = null;
		try{
			conectar = DriverManager.getConnection("jdbc:oracle:thin:/:@192.168.60.15:1521:ORCL");
			estrutura = conectar.createStatement();
			resultado = estrutura.executeQuery("SELECT NR_CLIENTE, NM_CLIENTE FROM T_tb_CLIENTE");
			while(resultado.next()){
				System.out.print("\nCliente:" + resultado.getString("NM_CLIENTE"));
				System.out.println("[" + resultado.getString("NM_CLIENTE") + "]");
			}
			System.out.println("Abriu conexão");
			conectar.close();
		}catch (SQLException e){
			e.printStackTrace();
		}finally{
			try{
				resultado.close();
				estrutura.close();
				conectar.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
}

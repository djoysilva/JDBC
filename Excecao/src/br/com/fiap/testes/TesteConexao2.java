package br.com.fiap.testes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class TesteConexao2 {
	public static void main(String[] args){
		Connection conectar = null;
		PreparedStatement estrutura = null;
		ResultSet resultado = null;
		
		try{
			conectar = DriverManager.getConnection("jdbc:oracle:thin:/:@192.168.60.15:1521:ORCL");
			int intNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número a ser pesquisado: "));
			String strNome = JOptionPane.showInputDialog("Digite o nome a ser pesquisado: ");
			estrutura = conectar.prepareStatement("SELECT NR_CLIENTE, NM_CLIENTE " +
												"FROM T_LTP_CLIENTE WHERE NR_CLIENTE = " + intNumero + 
												" AND NM_CLIENTE = '" + strNome + "'");
			estrutura.setInt(1,intNumero);
			estrutura.setString(2, strNome);
			resultado = estrutura.executeQuery();
			while(resultado.next()){
				System.out.println("\nCliente: " + resultado.getString("NM_CLIENTE"));
				System.out.println("[" + resultado.getString("NR_CLIENTE")+ "]");
			}
		}catch (SQLException e){
			e.printStackTrace();
		}finally{
			try{
				resultado.close();
				estrutura.close();
				conectar.close();
			}catch (SQLException e){
				e.printStackTrace();
			}	
		}
	}
}

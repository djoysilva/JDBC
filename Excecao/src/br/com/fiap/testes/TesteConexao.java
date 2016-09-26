package br.com.fiap.testes;

import java.sql.Connection;

import br.com.fiap.conexao.ConexaoFactory;
import br.com.fiap.excecoes.Excecoes;

public class TesteConexao {
	public static void main(String[] args) throws Excecoes{
		Connection c = null;
		try{
			c = new ConexaoFactory().getConnection();
			System.out.println("Conexão aberta!");
		}catch(Exception e){
			System.out.println("Erro de conexão");
		}finally{
			try{
				c.close();
			}catch (Exception e){
				System.out.println(e);
			}
		}
	}
}

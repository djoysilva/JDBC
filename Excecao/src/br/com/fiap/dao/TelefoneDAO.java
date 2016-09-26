package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Telefone;
import br.com.fiap.conexao.ConexaoFactory;

public class TelefoneDAO {
	private Connection conexao;
	
	public TelefoneDAO() throws Exception{
		this.conexao = new ConexaoFactory().getConnection();
	}
	
	public void add(Telefone T, int codigo_cliente) throws Exception{
			PreparedStatement estrutura = conexao.prepareStatement("INSERT INTO T_LPT_TELEFONE values (?,?,?,?,?)");
			estrutura.setShort(1, T.getDdd());
			estrutura.setInt(2, T.getNumero());
			estrutura.setInt(3, codigo_cliente);
			estrutura.setInt(4, T.getCodigo());
			estrutura.setString(5, T.getOperadora());
			estrutura.execute();
			estrutura.close();
		
	}
	
	public List<Telefone> getAll(int codigo_cliente) throws Exception{
		List<Telefone> listaTelefone = new ArrayList<Telefone>();
		PreparedStatement estrutura = conexao.prepareStatement("select * from T_LPT_TELEFONE WHERE NR_CLIENTE =?");
		estrutura.setInt(1, codigo_cliente);
		ResultSet resultadoDados = estrutura.executeQuery();
		while(resultadoDados.next()){
			Telefone tel = new Telefone();
			tel.setDdd(resultadoDados.getShort("NR_DDD"));
			tel.setNumero(resultadoDados.getInt("NR_TELEFONE"));
			tel.setCodigo(resultadoDados.getInt("CD_TELEFONE"));
			tel.setOperadora(resultadoDados.getString("NM_OPERADORA"));
			listaTelefone.add(tel);
		}
		resultadoDados.close();
		estrutura.close();
		return listaTelefone;
	}
}

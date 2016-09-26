package br.com.fiap.bo;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Telefone;
import br.com.fiap.excecoes.Excecoes;

public class boCliente {
	public void verificarDdd(Telefone telefone) throws Excecoes{
		if(telefone.getDdd()<0 || telefone.getNumero()<0){
			throw new Excecoes("N�mero de telefone inv�lido");
		}
	}
	
	public void verificarNome(Cliente cliente) throws Excecoes{
		if(cliente.getNome().length()<2 || cliente.getNome().indexOf(" ")<0){
			throw new Excecoes("Nome inv�lido - Digite tamb�m o sobrenome");
		}
	}
	
	public void verificarEstrelas(Cliente cliente) throws Excecoes{
		if(cliente.getQtdeEstrelas()<1 || cliente.getQtdeEstrelas()>5){
			throw new Excecoes("Quantidade de estrelas inv�lida.");
		}
	}
}

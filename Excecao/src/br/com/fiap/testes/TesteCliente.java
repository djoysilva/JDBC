package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.excecoes.Excecoes;

public class TesteCliente {

	public static void main(String[] args) throws Excecoes{
		// TODO Auto-generated method stub
		Cliente objCliente = new Cliente();
      try {
    	  objCliente.setCodigo(Long.parseLong(JOptionPane.showInputDialog("Digite o código: ")));
      }
      catch(Exception e){
    	  throw new Excecoes("Ocorreu uma falha.",e);
      }
	}

}

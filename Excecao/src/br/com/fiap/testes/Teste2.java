package br.com.fiap.testes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Telefone;
import br.com.fiap.excecoes.Excecoes;

public class Teste2 {
	public static void main(String[] args) throws Excecoes{
		List<Telefone> meusFones = new ArrayList<Telefone>();
		int resp = 0;
		
		String strNome = JOptionPane.showInputDialog("Digite o nome do cliente");
		while(resp==0){
			short shoDdd = Short.parseShort(JOptionPane.showInputDialog("Digite o ddd: "));
			int intNum = Integer.parseInt(JOptionPane.showInputDialog("Digite o telefone: "));
			int intCodigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo: ")); 
			Telefone telefone = new Telefone(shoDdd, intNum, intCodigo);
			meusFones.add(telefone);
			resp = JOptionPane.showConfirmDialog(null, "Cadastrar mais telefones?",
														"ArrayList de Objetos",
														JOptionPane.YES_NO_CANCEL_OPTION,
														JOptionPane.QUESTION_MESSAGE);
		}
		Cliente pessoa = new Cliente();
		pessoa.setNome(strNome);
		pessoa.setTel(meusFones);
		
		System.out.println("Nome: " + pessoa.getNome());
		for(Telefone telefone : pessoa.getTel()){
			JOptionPane.showMessageDialog(null,"Tefones:" + telefone.getTelefone());			
		}
	}

}

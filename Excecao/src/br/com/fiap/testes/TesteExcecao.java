package br.com.fiap.testes;

import javax.swing.JOptionPane;

public class TesteExcecao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int i = 23;
		//int j = 0;
		
		//int i = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		//int j = Integer.parseInt(JOptionPane.showInputDialog("Digite outro: "));
		//double res = i/j;
		
		int nota = 0;
		int div = 0;
		int resultado = 0;
		
		try {
			nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota: "));
			div = Integer.parseInt(JOptionPane.showInputDialog("Digite o divisor: "));
			resultado = nota/div;
			System.out.println("Resultado: " + resultado);
		}
		catch(ArithmeticException e){
			System.out.println("Valor 0 no divisor - " + e);
		}
		catch(NumberFormatException e){
			System.out.println("Não é um número - " + e);
		}
		finally {
			System.out.println("Nota: " + nota);
			System.out.close();
		}

	}

}

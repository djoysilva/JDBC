package br.com.fiap.beans;

public class Telefone {
	private short ddd;
	private int numero;
	private int codigo;
	private String operadora;
	
	public Telefone() {
	}

	public Telefone(short ddd, int numero, int codigo, String operadora) {
		super();
		this.ddd = ddd;
		this.numero = numero;
		this.codigo = codigo;
		this.operadora = operadora;
	}


	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public String getTelefone(){
		return "(" + ddd + ")" + numero;
	}
	
	
	public short getDdd() {
		return ddd;
	}

	public void setDdd(short ddd) {
		this.ddd = ddd;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
		
}
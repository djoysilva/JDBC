package br.com.fiap.beans;

import java.util.List;

public class Cliente {
 private String nome;
 private byte qtdeEstrelas;
 private long codigo;
 private List<Telefone> tel;
 
/* 
public Cliente(String nome, byte qtdeEstrelas, long codigo, List<Telefone> tel) {
	super();
	this.nome = nome;
	this.qtdeEstrelas = qtdeEstrelas;
	this.codigo = codigo;
	this.tel = tel;
}
*/
 
public Cliente(String nome, byte qtdeEstrelas, long codigo, List<Telefone> tel){
	setNome(nome);
	setQtdeEstrelas(qtdeEstrelas);
	setCodigo(codigo);
	setTel(tel);
}

public Cliente() {
	
}

public List<Telefone> getTel() {
	return tel;
}

public void setTel(List<Telefone> tel) {
	this.tel = tel;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public byte getQtdeEstrelas() {
	return qtdeEstrelas;
}

public void setQtdeEstrelas(byte qtdeEstrelas) {
	this.qtdeEstrelas = qtdeEstrelas;
}

public long getCodigo() {
	return codigo;
}

public void setCodigo(long codigo) {
	this.codigo = codigo;
}


 
}

package com.estudo.javaBean;

public class PessoaBean {
	
	private String nome;
	private int idade;
	
	public PessoaBean() {
		
	}
	
	//setter and getter
	//Retorna valor
	public String getNome() {
		return nome;
	}
	//altera valor
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

}

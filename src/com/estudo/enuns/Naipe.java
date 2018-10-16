package com.estudo.enuns;

public enum Naipe {
	
	OURO("Vermelho"),
	PAUS("Preto"),
	ESPADA("Preto"),
	COPA("Vermelho");
	
	private String cor;
	
	Naipe(String cor){
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
	}

}

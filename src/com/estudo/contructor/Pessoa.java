package com.estudo.contructor;

public class Pessoa {
	
	String nome;
	int idade;
	
	Pessoa(String nome){
		this.nome = nome;
		//supondo que seja um construtor grande e compliado
	}
	
	Pessoa(String nome, int idade){
		this(nome);// Chama o primeiro construtor; dever a a primeira instrução	
		this.idade = idade;
		
	}
	
}

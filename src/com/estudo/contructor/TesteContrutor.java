package com.estudo.contructor;

public class TesteContrutor {
	
	public static void main(String[] args) {
		
		//p1.nome = "João";
		//p1.idade = 25;
		//System.out.println("Nome: \"" + p1.nome + "\" tem " + p1.idade + " anos.");
		
		//Contrutores
		Pessoa p1 = new Pessoa("João");
		Pessoa p2 = new Pessoa("Maria", 25);
		
		System.out.println("Nome: \"" + p1.nome + "\" tem " + p1.idade + " anos.");
		System.out.println("Nome: \"" + p2.nome + "\" tem " + p2.idade + " anos.");
		

		
	}

}

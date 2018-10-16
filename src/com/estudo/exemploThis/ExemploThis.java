package com.estudo.exemploThis;

public class ExemploThis {
	
	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.modelo = "Palio";
		System.out.println(carro.modelo);
		
		carro.alterarModelo("Civic");
		System.out.println(carro.modelo);
		
	}
	
}

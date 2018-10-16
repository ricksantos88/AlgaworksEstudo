package com.estudo.exemploThis;

public class Carro {
	
	String fabriccante;
	String modelo;
	String cor;
	int anoDeFabricacao;
	boolean biCombustivel;
	
	Proprietario dono;
	
	void alterarModelo(String modelo){
		if (modelo != null) {
			this.modelo = modelo;
		}
	}
	
	void ligar() {
		if (modelo != null) {
			System.out.println("Ligando carro: " + modelo);
		}
	}
	
}

package com.estudo.enuns;

public class Carta {
	
	private int numero;
	private Naipe naipe;
	
	Carta(int numero, Naipe naipe){
		
		this.numero = numero;
		this.naipe = naipe;
		
	}
	
	public void imprimirCarta() {
		System.out.println("Eu sou um " + numero + " de " + naipe + 
								" e tenho a cor " + naipe.getCor());
	}
	
}

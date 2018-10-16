package com.estudo.modificarstatic;

public class TesteContador {
	
	public static void main(String[] args) {
		/*
		Contador.count++;
		int valorCount = Contador.count;
		System.out.println("Valor: " + valorCount);
		*/
		
		Contador c = new Contador();
		c.incrementar();
		//System.out.println(Contador.COUNT);
		
		Contador.COUNT++;
		//System.out.println(c.COUNT);
		//System.out.println(Contador.COUNT);
		
		//Movido pra Classes
		Contador.imprimirContador();
	}
	
	/*
	public static void imprimirContador() {
		System.out.println("O valor do contador agora é: " + Contador.COUNT);
	}
	*/

}

package com.estudo.modificarstatic;

public class Contador {
	
	//Modificador Final não permite mudar o valor do atributo
	//public final static int COUNT = 0;
	public static int COUNT = 0;
	
	public void incrementar() {
		COUNT++;
	}
	
	public static void imprimirContador() {
		System.out.println("O valor do contador agora é: " + Contador.COUNT);
	}

}

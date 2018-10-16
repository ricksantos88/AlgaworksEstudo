package com.estudo.excecoes;

public class TesteExcecoes {
	
	public static void main(String[] args) {
		//int numero = 5/0; -> Lança exceção java.lang.ArithmeticException
		//System.out.println(numero);
		
		//
		//String s = "wendel santos";
		//s = null;
		//String maiuscula = s.toUpperCase(); //java.lang.NullPointerException
		//System.out.println(maiuscula);
		//
		
		ContaCorrente cc = new ContaCorrente(100);
		
		try {
			cc.depositar(-10);
		} catch (IllegalArgumentException e) {
			System.out.println("Você executou uma operação ilegal: " + e.getMessage());
		}
		
		
	}

}

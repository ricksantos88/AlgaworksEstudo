package com.estudo.strings;

public class TesteString {

	public static void main(java.lang.String[] args) {
		//String, StringBuilder e StringBuffer
		
		String s = "Olá"; //Criando string "Olá"
		s += " pessoal!"; //criando string "Olá Pessoal!";
		System.out.println(s);
		
		StringBuilder sb = new StringBuilder("Olá"); //Existe StringBuilder
		sb.append(" pessoal!"); //Resproveitando a StringBuilder
		
		String r = sb.toString();
		System.out.println("Com string builder: " + r);
		
	}

}

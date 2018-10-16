package com.estudo.strings;

public class TesteString {

	public static void main(java.lang.String[] args) {
		//String, StringBuilder e StringBuffer
		
		String s = "Ol�"; //Criando string "Ol�"
		s += " pessoal!"; //criando string "Ol� Pessoal!";
		System.out.println(s);
		
		StringBuilder sb = new StringBuilder("Ol�"); //Existe StringBuilder
		sb.append(" pessoal!"); //Resproveitando a StringBuilder
		
		String r = sb.toString();
		System.out.println("Com string builder: " + r);
		
	}

}

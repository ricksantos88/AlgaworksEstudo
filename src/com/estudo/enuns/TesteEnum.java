package com.estudo.enuns;

public class TesteEnum {
	
	public static void main(String[] args) {
		
		Carta quantoDePaus = new Carta(4, Naipe.PAUS);
		quantoDePaus.imprimirCarta();
		
		OperacaoAritimetica o1 = OperacaoAritimetica.ADICAO;
		OperacaoAritimetica o2 = OperacaoAritimetica.SUBTRACAO;
		
		int resultado01 = o1.opercao(10, 5);
		int resultado02 = o2.opercao(resultado01, 5);
		
		System.out.println("Resultado Adição: " + resultado01);
		System.out.println("Resultado Subtração: " + resultado02);
		
		for (OperacaoAritimetica oa : OperacaoAritimetica.values()) {
			System.out.println(oa + " - > " + oa.opercao(4, 2));
		}
		
	}

}

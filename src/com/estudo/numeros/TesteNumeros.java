package com.estudo.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

public class TesteNumeros {
	
	public static void main(String[] args) {
		
		DecimalFormat formartador  = new DecimalFormat("R$ #,##0.00");
		Double valorProduto = 1300.59;
		//R$ 1.300,59
		System.out.println(valorProduto);
		System.out.println(formartador.format(valorProduto));
		
		String entrada = "R$ 50,34";
		try {
			double numero = formartador.parse(entrada).doubleValue();
			System.out.println("Numero: " + numero);
		} catch (ParseException e) {
			System.out.println("Entrada Inválida");
		}
		
		BigDecimal bg = new BigDecimal(561568465465d);
		bg.divide(BigDecimal.TEN);
		System.out.println(bg);
	}

}

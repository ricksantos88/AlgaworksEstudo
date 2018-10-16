package com.estudo.sobreposicao;

import java.util.Date;

public class ProdutoPereceivel extends Produto{
	
	protected Date dataValidade;
	
	public void identificar() {
		super.identificar();
		System.out.println("Minha data de Validade é " + dataValidade + ". ");
	}

}

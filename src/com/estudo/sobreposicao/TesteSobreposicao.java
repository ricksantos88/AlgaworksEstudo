package com.estudo.sobreposicao;

import java.util.Date;

public class TesteSobreposicao {
	
	public static void main(String[] args) {
		ProdutoPereceivel pp = new ProdutoPereceivel();
		pp.descricao = "Banana";
		pp.dataValidade = new Date();
		pp.identificar();
		
	}

}

package com.estudo.abstrata;

public class TesteClasseAbstrata {
	
	public static void main(String[] args) {
		
		Produto p = new ProdutoPerecivel();
		p.descricao = "Caixa de leite";
		
		ProdutoPerecivel pp = (ProdutoPerecivel) p;
		pp.dataValidade = "01/01/2018";
		
		p.imprimirDescricao();
		
	}

}

package com.estudo.abstrata;

public class ProdutoPerecivel extends Produto{
	
	String dataValidade;

	public void imprimirDescricao() {
		// TODO Auto-generated method stub
		System.out.println("Descricao: " + super.getDescricao() + ". Vendendo em: " + dataValidade);
	}
	
}

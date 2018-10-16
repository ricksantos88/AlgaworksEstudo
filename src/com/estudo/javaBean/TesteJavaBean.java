package com.estudo.javaBean;

public class TesteJavaBean {
	
	public static void main(String[] args) {
		
		PessoaBean pessoa = new PessoaBean();
		pessoa.setNome("Maria");
		pessoa.setIdade(25);
		
		System.out.println("Nome: \"" + pessoa.getNome() + "\" tem " + pessoa.getIdade() + " anos.");
		
	}

}

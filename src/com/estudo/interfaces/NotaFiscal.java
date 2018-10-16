package com.estudo.interfaces;

public class NotaFiscal implements Imprimivel, EnviavelPorEmail {
	
	private int numero;
	
	public NotaFiscal(int numero){
		this.numero = numero;
	}
	
	@Override
	public void imprimir() {
		System.out.println("Vamos imprimir essa nota fiscal de numero: " + numero);
	}

	@Override
	public void enviar(String email) {
		System.out.println("Enviando nota de numero: " + numero + " para o e-mail: " + email);
	}

}

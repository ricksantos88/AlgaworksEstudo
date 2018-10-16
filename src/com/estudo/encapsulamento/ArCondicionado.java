package com.estudo.encapsulamento;

public class ArCondicionado {
	
	private int temperatura;
	
	public void trocarTemperatura(int temp) {
		if (temp >= 17 && temp <= 25) {
			this.temperatura = temp;
		}
	}
	
	public int obterTemperatura() {
		return this.temperatura;
	}

}

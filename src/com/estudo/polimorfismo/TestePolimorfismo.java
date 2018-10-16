package com.estudo.polimorfismo;

public class TestePolimorfismo {
	
	public static void main(String[] args) {
		 Conta conta = new Conta();
		 conta.setSaldo(4000);
		 //sendo um metodo static não ha necessidade de usar o nome da classe
		 TestePolimorfismo.imprimirSaldo(conta);
		 System.out.println();
		 //------------------------------------------------------------------
		 //ContaCorrente cc = new ContaCorrente();
		 Conta contaCorrente = new ContaCorrente();
		 contaCorrente.setSaldo(3500);
		 imprimirSaldo(contaCorrente);
		 System.out.println();
		//------------------------------------------------------------------
		 //ContaPoupanca cp = new ContaPoupanca();
		 Conta contaPoupanca = new ContaPoupanca();
		 contaPoupanca.setSaldo(2000);
		 imprimirSaldo(contaPoupanca);
		 
	}
	
	public static void imprimirSaldo(Conta conta) {
		//System.out.println("Saldo da Conta: R$" + conta.getSaldo());
		System.out.println("Saldo da Conta: R$" + conta.getSaldo());
		
		if (conta instanceof ContaCorrente) {
			ContaCorrente cc = (ContaCorrente) conta;
			System.out.println("O Limite da conta corrente é R$" + cc.getLimite());
		}
		
		if (conta instanceof ContaPoupanca) {
			ContaPoupanca cp = (ContaPoupanca) conta;
			System.out.println("O Rendimento da conta poupança é R$" + cp.getRendimentos());
		}
		
	}

}

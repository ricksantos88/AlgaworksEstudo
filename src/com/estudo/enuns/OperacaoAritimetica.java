package com.estudo.enuns;

public enum OperacaoAritimetica {
	
	ADICAO {
		public int opercao(int x, int y) {
			return x + y;
		}
	},
	SUBTRACAO {
		public int opercao(int x, int y) {
			return x - y;
		}
	};
	
	public abstract int opercao(int x, int y) ;
	
}

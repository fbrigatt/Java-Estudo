package com.algaworks.estudo.enums;

public enum OperacaoAritmetica {

	ADICAO {
		@Override
		public int operacao(int x, int y) {
			return x + y;
		}
	},
	SUBTRACAO {
		@Override
		public int operacao(int x, int y) {
			return x - y;
		}
	},
	MULTIPLICACAO {
		@Override
		public int operacao(int x, int y) {
			return 0;
		}
	},
	DIVISAO {
		@Override
		public int operacao(int x, int y) {
			return 0;
		}
	};

	public abstract int operacao(int x, int y);
}

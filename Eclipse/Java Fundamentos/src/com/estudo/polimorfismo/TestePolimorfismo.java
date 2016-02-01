package com.estudo.polimorfismo;

public class TestePolimorfismo {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.setSaldo(4000);
		imprimirSaldo(c1);
		// ----------------------------------
		Conta c2 = new ContaCorrente();
		c2.setSaldo(3500);
		imprimirSaldo(c2);
		// ----------------------------------
		Conta c3 = new ContaPoupanca();
		c3.setSaldo(2000);
		imprimirSaldo(c3);
	}

	public static void imprimirSaldo(Conta conta) {
		System.out.println("Saldo da conta: R$ " + conta.getSaldo());

		if (conta instanceof ContaCorrente) {
			ContaCorrente cc = (ContaCorrente) conta;
			System.out.println("O limite da cc é R$: " + cc.getLimite());

		}

		if (conta instanceof ContaPoupanca) {
			ContaPoupanca cp = (ContaPoupanca) conta;
			System.out.println("O rendimento da cp é R$: " + cp.getRendimentos());
		}
		System.out.println("----------------------------------");
	}

}

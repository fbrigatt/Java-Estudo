package com.xti.jdbc;

public class Conta {

	int numero;
	String nome;
	double saldo;

	public Conta(int numero, String cliente, double saldo) {
		this.numero = numero;
		this.nome = cliente;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", cliente=" + nome + ", saldo=" + saldo + "]";
	}

}
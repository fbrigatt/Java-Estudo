package com.algaworks.estudo.collections;

import java.util.ArrayList;
import java.util.List;

public class Teste2ArrayList {

	private static List<Aluno> alunos = new ArrayList<>();

	public static void main(String[] args) {

		novoAluno("Raphael");
		novoAluno("Silva");
		novoAluno("Bia");
		imprimirAlunos();

		novoAluno("Fernanda");
		novoAluno("Roberta");
		novoAluno("Jessica");
		imprimirAlunos();

		imprimirAlunos();
	}

	public static void novoAluno(String nome) {
		Aluno aluno = new Aluno(nome);
		alunos.add(aluno);
	}

	public static void imprimirAlunos() {
		for (Aluno a : alunos) {
			System.out.println(a.getNome());
		}
		System.out.println();
	}
}

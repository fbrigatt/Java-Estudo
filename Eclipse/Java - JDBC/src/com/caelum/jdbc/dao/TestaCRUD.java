package com.caelum.jdbc.dao;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class TestaCRUD {

	public static void main(String[] args) {

		// pronto pra gravar
		Contato contato = new Contato();
		contato.setNome("Caelum");
		contato.setEmail("contato@caelum.com.br");
		contato.setEndereco("R. Vergueiro 3185 cj57");
		contato.setDataNascimento(Calendar.getInstance());

		// grave nessa conexao
		ContatoDao dao = new ContatoDao();

		// metodo elegante
		// dao.adiciona(contato);

		exibirContatos(dao);

		// List<Contato> contatosPesquisar = dao.pesquisar(3);
		//// System.out.println(contatosPesquisar.size());
		// if (contatosPesquisar.size() == 0) {
		// System.out.println("nehum");
		// } else {
		// for (Contato c : contatosPesquisar) {
		//
		// System.out.println("Nome: " + c.getNome());
		// System.out.println("Email: " + c.getEmail());
		// System.out.println("Endereço: " + c.getEndereco());
		// SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		// System.out.println("Data de Nascimento: " +
		// formatador.format(c.getDataNascimento().getTime()) + "\n");
		// }
		// }

		contato.setNome("Silva");
		// dao.altera(contato);
		System.out.println("--------------------------------------");
		dao.remove(contato);
		exibirContatos(dao);

	}

	public static void exibirContatos(ContatoDao dao) {
		// exibe contatos
		List<Contato> contatos = dao.getLista();
		for (Contato c : contatos) {
			System.out.println("Nome: " + c.getNome());
			System.out.println("Email: " + c.getEmail());
			System.out.println("Endereço: " + c.getEndereco());
			SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
			System.out.println("Data de Nascimento: " + formatador.format(c.getDataNascimento().getTime()) + "\n");
		}
	}
}
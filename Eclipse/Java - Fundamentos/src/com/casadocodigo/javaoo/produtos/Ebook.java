package com.casadocodigo.javaoo.produtos;

import com.casadocodigo.javaoo.livraria.Autor;

public class Ebook extends Livro implements Promocional {
	private String waterMark;

	public Ebook(Autor autor) {
		super(autor);
	}

	public String getWaterMark() {
		return waterMark;
	}

	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}

	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		if (porcentagem > 0.15) {
			return false;
		}
		System.out.println("Aplicando desconto no Ebook");
		double desconto = this.getValor() * porcentagem;
		this.setValor(this.getValor() - desconto);
		return true;

		// return super.aplicaDescontoDe(porcentagem);
	}

	@Override
	public String toString() {
		return "Eu sou um Ebook";
	}

}
package casadocodigo.javaoo.produtos;

import casadocodigo.javaoo.exception.AutorNuloException;
import casadocodigo.javaoo.livraria.Autor;

public abstract class Livro implements Produto {

	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;

	public Livro(Autor autor) {
		// this();

		if (autor == null) {
			throw new AutorNuloException("O Autor do Livro não pode ser nulo");
		}

		this.autor = autor;
		this.isbn = "000-00-00000-00-0";
	}

	// public Livro() {
	// this.isbn = "000-00-00000-00-0";
	// }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public void mostrarDetalhes() {
		System.out.println("Mostrando detalhes do livro ");
		System.out.println("Nome: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: " + valor);
		System.out.println("ISBN: " + isbn);
		System.out.println("-");
		if (this.temAutor()) {
			autor.mostrarDetalhes();
		} else {
			System.out.println("Não existe Autor Cadastrado !!!");
		}
		System.out.println("-------------------------\n");
	}

	@Override
	public String toString() {
		return "Mostrando detalhes do livro\n" + "\nNome: " + nome
				+ "\nDescrição: " + descricao + "\nValor: " + valor
				+ "\nISBN: " + isbn + "\n-" + "\n" + autor.toString();

		// return "Livro [nome=" + nome + ", descricao=" + descricao +
		// ", valor="
		// + valor + ", isbn=" + isbn + ", autor=" + autor + "]";
	}

	// se o autor existir, return true, senão false
	boolean temAutor() {
		return this.autor != null;
	}

	// public void aplicaDescontoDe(double porcentagem) {
	// this.valor -= this.valor * (porcentagem / 100);
	// }

	// define o limite de 30% de desconto
	// public boolean aplicaDescontoDe(double porcentagem) {
	// if (porcentagem > 0.3) {
	// return false;
	// }
	// this.valor -= this.valor * porcentagem;
	// return true;
	// }

	// public boolean aplicaDescontoDe(double porcentagem) {
	// return false;
	// }

	// public abstract boolean aplicaDescontoDe(double porcentagem);

	// Note que o método compareTo retorna um int. Devemos retornar
	// 0 (zero) se o objeto comparado (parâmetro outro) for igual a este objeto
	// (this), um número negativo se este objeto for menor (deva vir antes
	// quando ordenado) que o objeto passado, ou um número positivo caso seja
	// maior(deva vir depois).
	// @Override
	// public int compareTo(Produto outro) {
	// if (this.getValor() < outro.getValor()) {
	// return -1;
	// }
	// if (this.getValor() > outro.getValor()) {
	// return 1;
	// }
	// return 0;
	// }

	@Override
	public int compareTo(Produto outro) {
		return (int) (this.getValor() - outro.getValor());
	}

}

package casadocodigo.javaoo.produtos;

import casadocodigo.javaoo.livraria.Editora;

public class Revista implements Produto, Promocional {

	private String nome;
	private String descricao;
	private double valor;
	private Editora editora;

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

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		if (porcentagem > 0.1) {
			return false;
		}
		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		return true;
	}

	// Note que o método compareTo retorna um int. Devemos retornar
	// 0 (zero) se o objeto comparado (parâmetro outro) for igual a este objeto
	// (this), um número negativo se este objeto for menor (deva vir antes
	// quando ordenado) que o objeto passado, ou um número positivo caso seja
	// maior(deva vir depois).
	@Override
	public int compareTo(Produto outro) {
		if (this.getValor() < outro.getValor()) {
			return -1;
		}
		if (this.getValor() > outro.getValor()) {
			return 1;
		}
		return 0;
	}

}

package com.thenewboston.properties;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Pessoa {

	private StringProperty nome = new SimpleStringProperty(this, "nome", "");

	// returns the StringProperty object
	public StringProperty nomeProperty() {
		return nome;
	}

	// return nome value
	public String getNome() {
		return nome.get();
	}

	// set nome value
	public void setNome(String nome) {
		this.nome.set(nome);
	}

}

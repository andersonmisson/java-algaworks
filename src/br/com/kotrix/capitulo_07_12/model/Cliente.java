package br.com.kotrix.capitulo_07_12.model;

public class Cliente {
	
	private String nome;
	
	public Cliente(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + "]";
	}
	
}

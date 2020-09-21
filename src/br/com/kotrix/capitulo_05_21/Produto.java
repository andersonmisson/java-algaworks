package br.com.kotrix.capitulo_05_21;

public abstract class Produto {
	
	String descricao;
	
	public abstract void imprimirDescricao(); // Agora toda herança terá que ter esse metodo implementado.
	
	public String getDescricao() {
		return descricao;
	}

}

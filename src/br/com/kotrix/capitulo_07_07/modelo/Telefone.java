package br.com.kotrix.capitulo_07_07.modelo;

public class Telefone {

	private String tipo;
	private String numero;
	
	public Telefone() {
		
	}

	public Telefone(String tipo, String numero) {
		super();
		this.tipo = tipo;
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	
}

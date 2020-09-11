package br.com.kotrix.capitulo_05_03;

public class Carro {
	
	String fabricante;
	String modelo;
	String cor;
	int anoDeFabricacao;
	boolean biCombustivel;
	
	void alterarModelo(String modelo) {
		if(modelo != null) {
			this.modelo = modelo;
		}
	}
	
	void ligar() {
		if (modelo != null) {
			System.out.println("Ligando o carro: " + modelo);
		}
	}

}

package br.com.kotrix.capitulo_05_03;

public class ExemploThis {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		carro.modelo = "Palio";
		
		System.out.println("Modelo Antes: " + carro.modelo);
		
		carro.alterarModelo("Civic");
		
		System.out.println("Modelo Depois: " + carro.modelo);

	}

}

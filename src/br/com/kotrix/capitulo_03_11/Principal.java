package br.com.kotrix.capitulo_03_11;

public class Principal {

	public static void main(String[] args) {
		
		Carro meuCarro = new Carro();
		
		//meuCarro.modelo = "Palio";
		
		Carro seuCarro = new Carro();
		
		seuCarro.modelo = "Civic";
		
		meuCarro.ligar();
		seuCarro.ligar();		
		
		System.out.println("--------------------------------");
		Paciente p = new Paciente();
		p.peso = 100;
		p.altura = 1.65;
		
		IMC imc = p.calcularIndiceDeMassaCorporal();
		
		System.out.println("Abaixo do peso ideal: " + imc.abaixoDoPesoIdeal);
		System.out.println("Peso ideal: " + imc.pesoIdeal);
		System.out.println("Obeso: " + imc.obeso);
		System.out.println("Grau de obesidade: " + imc.grauObesidade);
	}
	
}
package br.com.kotrix.capitulo_05_11;

public class TesteMatematica {

	public static void main(String[] args) {
		
		int numeroFibonacci = MatematicaUtil.calcularFibonacci(8);
		System.out.println("Número De Fibonacci de posição 8: " + numeroFibonacci);
		
		double areaCirculo = MatematicaUtil.calcularAreaCirculo(104.8);
		System.out.println("Área do círculo: " + areaCirculo);

	}

}

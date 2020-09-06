package br.com.kotrix.capitulo_02_27;

import java.util.Scanner;

public class ControleWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o numero inicial: ");
		int numeroInicial = entrada.nextInt();
		
		System.out.print("Digite o numero final: ");
		int numeroFinal = entrada.nextInt();
		
		int numeroAtual = numeroInicial;
		
		while (numeroAtual <= numeroFinal) {
			System.out.println(numeroAtual);
			numeroAtual++;
		}
		
		
	}
	
	
}
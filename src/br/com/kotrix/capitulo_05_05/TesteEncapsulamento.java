package br.com.kotrix.capitulo_05_05;

public class TesteEncapsulamento {
	
	public static void main(String[] args) {
		ArCondicionado ar = new ArCondicionado(); // 17 - 25
		
		ar.trocarTemperatura(21);
		System.out.println("Temperatura do ar: " + ar.obterTemperatura() + "�");
		
		ar.trocarTemperatura(10); // 10 n�o est� entre 17-25
		System.out.println("Temperatura do ar: " + ar.obterTemperatura() + "�");	
		
		ar.trocarTemperatura(17);
		System.out.println("Temperatura do ar: " + ar.obterTemperatura() + "�");
		
	}

}

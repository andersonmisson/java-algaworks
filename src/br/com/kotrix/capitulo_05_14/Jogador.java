package br.com.kotrix.capitulo_05_14;

public class Jogador extends Pessoa {
	
	protected boolean aindaJoga = false;
	
	public void dizerSeAindaJoga() {
		System.out.println("Ainda joga? " + aindaJoga);
	}
}

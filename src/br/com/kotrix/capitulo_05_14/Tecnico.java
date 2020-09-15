package br.com.kotrix.capitulo_05_14;

public class Tecnico extends Pessoa{
	
	protected boolean aindaTreina = true;
	
	public void dizerSeAindaTreina() {
		System.out.println("Ainda treina ? " + aindaTreina );
	}

}

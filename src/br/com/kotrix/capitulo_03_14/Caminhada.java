package br.com.kotrix.capitulo_03_14;

public class Caminhada {

	public void andar(Pessoa pessoa) {
		System.out.println("Eu \"" + pessoa.nome + "\"" 
				+ " estou andando com o \"" + pessoa.cachorro.nome + "\"");
	}
	
}
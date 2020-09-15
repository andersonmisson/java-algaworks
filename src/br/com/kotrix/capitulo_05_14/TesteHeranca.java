package br.com.kotrix.capitulo_05_14;

public class TesteHeranca {

	public static void main(String[] args) {
		
		Jogador j = new Jogador();
		j.nome = "Ronaldo";
		j.idade = 33;
		
		j.seApresentar();
		j.dizerSeAindaJoga();
		
		System.out.println("-------------");
		
		Tecnico t = new Tecnico();
		t.nome = "Sebastião";
		t.idade = 75;
		
		t.seApresentar();
		t.dizerSeAindaTreina();

	}

}

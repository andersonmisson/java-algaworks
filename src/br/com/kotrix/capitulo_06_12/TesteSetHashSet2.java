package br.com.kotrix.capitulo_06_12;

import java.util.Set;

public class TesteSetHashSet2 {

	public static void main(String[] args) {
		Set<Aluno> alunos = SimuladorBancoDeDados.buscarAlunos();
		
		// De alguma forma, sorteia o nome do aluno e constr�i o objeto ALuno
		Aluno alunoSorteado = new Aluno("Maria");
		
		if(alunos.contains(alunoSorteado)) {
			System.out.println("Parab�ns: " + alunoSorteado.getNome() + "! Voc� ganhou um brinde!" );
		} else {
			System.out.println("Aluno n�o cadastrado no banco de dados");
		}

	}

}

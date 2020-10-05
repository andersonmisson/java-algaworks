package br.com.kotrix.capitulo_07_09;

import br.com.kotrix.capitulo_07_09.modelo.Funcionario;

public class Teste {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario("João da Silva", 3000);
		
		System.out.println(funcionario.adiantamentoViagem(5, false));
		System.out.println(funcionario.adiantamentoViagem(5, true));

	}

}

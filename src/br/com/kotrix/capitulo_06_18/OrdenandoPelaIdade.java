package br.com.kotrix.capitulo_06_18;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenandoPelaIdade {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Jo�o", 22);
		Pessoa p2 = new Pessoa("Adriana", 23);
		Pessoa p3 = new Pessoa("Bruno", 21);
		
		List<Pessoa> pessoas = Arrays.asList(p1, p2, p3);
		IdadeComparador idadeComparator = new IdadeComparador();
		
		pessoas.sort(idadeComparator);
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
	}
	
}
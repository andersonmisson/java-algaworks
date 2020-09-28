package br.com.kotrix.capitulo_06_18;

import java.util.Comparator;

public class IdadeComparador implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa p1, Pessoa p2) {
		if (p1.getIdade() < p2.getIdade()) {
			return -1;
		} else if (p1.getIdade() > p2.getIdade()) {
			return 1;
		}
		
		return 0;
	}

}
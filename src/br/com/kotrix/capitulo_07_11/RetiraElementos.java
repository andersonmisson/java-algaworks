package br.com.kotrix.capitulo_07_11;

import java.util.List;

public class RetiraElementos {

	public static <T> T recuperaPrimeiro(List<T> lista) {
		return lista.get(0);
	}
	
}
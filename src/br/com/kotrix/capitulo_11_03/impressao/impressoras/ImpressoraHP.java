package br.com.kotrix.capitulo_11_03.impressao.impressoras;

import br.com.kotrix.capitulo_11_03.compra.Compra;
import br.com.kotrix.capitulo_11_03.impressao.Impressora;

public class ImpressoraHP implements Impressora {

	@Override
	public void imprimir(Compra c) {
		System.out.println("Enviando o comando para a impressora HP -> " + c);
	}
}

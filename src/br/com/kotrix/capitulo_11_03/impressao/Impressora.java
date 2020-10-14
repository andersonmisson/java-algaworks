package br.com.kotrix.capitulo_11_03.impressao;

import br.com.kotrix.capitulo_11_03.compra.Compra;

@FunctionalInterface
public interface Impressora {
	
	public void imprimir(Compra c);

}

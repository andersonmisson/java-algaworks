package br.com.kotrix.capitulo_05_23.impressao.impressoras;

import br.com.kotrix.capitulo_05_23.impressao.Impressora;
import br.com.kotrix.capitulo_05_23.impressao.Imprimivel;

public class ImpressoraEpson implements Impressora{
	
	@Override
	public void imprimir(Imprimivel imprimivel) {
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println(imprimivel.getCabecalhoPagina());
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println(imprimivel.getCorpoPagina());
		System.out.println();
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("==                   EPSON                   ==");
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
	}

}
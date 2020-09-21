package br.com.kotrix.capitulo_05_23.pagamento.operadoras;

import br.com.kotrix.capitulo_05_23.pagamento.Autorizavel;
import br.com.kotrix.capitulo_05_23.pagamento.Cartao;
import br.com.kotrix.capitulo_05_23.pagamento.Operadora;

public class Redecard implements Operadora {

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("456")
				&& autorizavel.getValorTotal() < 200;
	}

}
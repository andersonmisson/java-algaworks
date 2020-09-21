package br.com.kotrix.capitulo_05_23.pagamento;

public interface Operadora {
	
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao);

}

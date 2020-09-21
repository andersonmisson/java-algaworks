package br.com.kotrix.capitulo_05_22;

public class ContaPagar extends Conta{
	
	private Fornecedor fornecedor;
	
	public ContaPagar() {
		
	}

	public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
		this.fornecedor = fornecedor;
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
	}
	
	public void exibirDetalhes() {
		System.out.println("\nConta a Pagar");
		System.out.println("==========================");
		System.out.println("Fornecedor: "+ this.getFornecedor().getNome());
		System.out.println("Descri��o: " + this.getDescricao());
		System.out.println("Valor: " + this.getValor());
		System.out.println("DataVencimento: " + this.getDataVencimento());
		System.out.println("Situa��o: " + this.getSituacaoConta());
	}
	
	public void pagar() {
		if(SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("N�o pode pagar uma conta que j� est� paga: " + this.getDescricao() + ".");
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("N�o pode pagar uma conta que est� cancelada: " + this.getDescricao());
		} else {
			System.out.println("Pagando Conta " + this.getDescricao() 
					+ " no volar de " + this.getValor() 
					+ " e vencimento em " + this.getDataVencimento()
					+ " do fornecedor " +this.getFornecedor().getNome()
					+ ".");
			
			// altera situa��o da conta para PAGA
			this.situacaoConta = SituacaoConta.PAGA;
		}
	}
	
	
	// GETTER & SETTER
	
	public Fornecedor getFornecedor() {
		return this.fornecedor;
	}
	
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
}

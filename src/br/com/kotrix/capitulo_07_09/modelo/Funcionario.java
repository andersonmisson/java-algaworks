package br.com.kotrix.capitulo_07_09.modelo;

/**
 * Representa um funcionario da empresa...
 * 
 * @author Anderson
 * @author Andy
 *
 */
public class Funcionario {

	private String nome;
	private double salario;
	
	/**
	 * Não ultilizar mais , pois o salário é obrigatorio para outros métodos
	 * 
	 * @deprecated 
	 * @param nome
	 */
	public Funcionario(String nome) {
		this.nome = nome;
	}

	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	/**
	 * Calcula o adiantamento em dinheiro que deera ser pago ao funcionario
	 * 
	 * <p>o valor da diária é calculado dividindo-se o <b>salario base por 30(dias no mes)</b></p>
	 * 
	 * Caso o destino for uma capital, é adicionado 20% no valor do adiantamento
	 * 
	 * @param dias
	 * 		Quantidade de dias da viagem
	 * 
	 * @param capital
	 * 		Indica se é ou não uma capital brasileira
	 * 
	 * @return O valor em reais do adiantamento
	 * 
	 * @throws 	IllegalArgumentException
	 * 			Caso {@code dias} for menor ou igual a zero
	 * 
	 * @since 1.1.0
	 * 
	 * @see		Viagem
	 */
	
	
	public double adiantamentoViagem(int dias, boolean capital) {
		if(dias <= 0) {
			throw new IllegalArgumentException("DIas devem ser maior que zero.");
		}
		
		double valorDiaria = salario/30;
		
		double valorAdiantamento = valorDiaria * dias;
		
		if (capital) {
			valorAdiantamento *=1.20;
		}
		return valorAdiantamento;
	}
	
}

package br.com.kotrix.capitulo_06_17;

/**
 * Representa um pol�tico do governo.
 * Um pol�tico � eleito pelo povo. Ele tem o poder de
 * influenciar a maneira como a sociedade � governada.
 * 
 * @author Anderson Misson
 *
 */
public class Politico {
	/**
	 * Nome completo do pol�tico.
	 * N�o � indicado usar abrevia��es.
	 */
	private String nome;
	
	/**
	 * Refer�ncia para o cargo do pol�tico.
	 * Um cargo define o sal�rio base do pol�tico e a
	 * fun��o que ele deve exercer.
	 */
	private Cargo cargo;
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Cargo getCargo() {
		return this.cargo;
	}
	
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

}

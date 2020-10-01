package br.com.kotrix.capitulo_07_04.dao;

import java.util.List;

import br.com.kotrix.capitulo_07_04.modelo.Cliente;

public interface ClienteDAO {
	
	public void salvar(Cliente cliente);

	public Cliente buscarPeloCodigo(Long codigo);

	public List<Cliente> buscarTodos();

}

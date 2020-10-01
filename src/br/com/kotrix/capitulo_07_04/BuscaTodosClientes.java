package br.com.kotrix.capitulo_07_04;

import java.util.List;

import br.com.kotrix.capitulo_07_04.dao.ClienteDAO;
import br.com.kotrix.capitulo_07_04.dao.DAOFactory;
import br.com.kotrix.capitulo_07_04.modelo.Cliente;

public class BuscaTodosClientes {

	public static void main(String[] args) {
		
		ClienteDAO clienteDAO = DAOFactory.getDaoFactory().getClienteDAO();
		
		List<Cliente> clientes = clienteDAO.buscarTodos();
		
		for(Cliente cliente: clientes) {
			System.out.println("----- Cliente -----");
			System.out.printf("Codigo: %d\n", cliente.getCodigo());
			System.out.printf("Nome: %s\n", cliente.getNome());
			System.out.println();
		}
		
	}

}

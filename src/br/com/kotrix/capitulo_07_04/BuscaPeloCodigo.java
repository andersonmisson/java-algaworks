package br.com.kotrix.capitulo_07_04;

import br.com.kotrix.capitulo_07_04.dao.ClienteDAO;
import br.com.kotrix.capitulo_07_04.dao.DAOFactory;
import br.com.kotrix.capitulo_07_04.modelo.Cliente;

public class BuscaPeloCodigo {

	public static void main(String[] args) {
		ClienteDAO clienteDAO = DAOFactory.getDaoFactory().getClienteDAO();
		
		Cliente cliente = clienteDAO.buscarPeloCodigo(2L);

		if(cliente != null) {
			System.out.println("----- Cliente encontrado -----");
			System.out.printf("Codigo: %d\n", cliente.getCodigo());
			System.out.printf("Nome: %s\n", cliente.getNome());
			System.out.println();
		} else {
			System.out.println("Nenhum Cliente Encontrado");
		}
		
	}

}

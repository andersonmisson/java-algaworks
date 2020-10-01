package br.com.kotrix.capitulo_07_04;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import br.com.kotrix.capitulo_07_04.dao.ClienteDAO;
import br.com.kotrix.capitulo_07_04.dao.DAOFactory;
import br.com.kotrix.capitulo_07_04.modelo.Cliente;

public class SalvaCliente {

	public static void main(String[] args) throws Exception{
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		
		Cliente cliente = new Cliente();
		
		String nome = JOptionPane.showInputDialog(null, "Nome do cliente", "Cadastro do cliente", JOptionPane.QUESTION_MESSAGE);
		
		if(nome !=null) {
		cliente.setNome(nome);
		
		ClienteDAO clienteDAO = DAOFactory.getDaoFactory().getClienteDAO();
		clienteDAO.salvar(cliente);
		System.out.println("Cliente Salvo com sucesso");
		}
	}
}

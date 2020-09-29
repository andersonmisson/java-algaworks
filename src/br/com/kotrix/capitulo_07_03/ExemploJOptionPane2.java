package br.com.kotrix.capitulo_07_03;

import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ExemploJOptionPane2 {

	public static void main(String[] args) throws Exception{
		
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName()); // Mudar o icone do Painel

		JOptionPane.showMessageDialog(null, "Seu Cadastro foi realizado com sucesso!");
		
		JOptionPane.showMessageDialog(null, "Atenção - email não informado", "Atenção", JOptionPane.WARNING_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Por favor o CPF", "Erro", JOptionPane.ERROR_MESSAGE);
		
		JOptionPane.showConfirmDialog(null, "Obrigado", "Obrigado", JOptionPane.PLAIN_MESSAGE);
		
		URL url = ExemploJOptionPane2.class.getResource("algaworks.png");
		Icon icone = new ImageIcon(url);
		
		JOptionPane.showMessageDialog(null, "Obrigado por escolher a Algaworks", "Algaworks", JOptionPane.INFORMATION_MESSAGE, icone);
	}

}

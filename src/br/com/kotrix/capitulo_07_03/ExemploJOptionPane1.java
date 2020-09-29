package br.com.kotrix.capitulo_07_03;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ExemploJOptionPane1 {

	public static void main(String[] args) throws Exception{
		
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName()); // Mudar o Icone do Painel
		
		JOptionPane.showMessageDialog(null, "Seu cadastro foi feito com sucesso.");
	}

}

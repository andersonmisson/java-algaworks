package br.com.kotrix.capitulo_07_10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidandoEmails {

	public static void main(String[] args) {

		String [] emails = {"joao@joao.com", "maria@", "jose@jose", "ricardo@ricardo.com"};
		
		// w significa qualquer palavra até o @
		Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+");
		for(String email : emails) {
			Matcher matcher = pattern.matcher(email);
			if(matcher.matches()) {
				System.out.println(email + " é um email válido");
			}
		}
	}

}

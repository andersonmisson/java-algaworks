package br.com.kotrix.capitulo_06_07;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteDatas {
	
	public static void main(String[] args) {
		Date hoje = new Date();
		
		System.out.println("--- PRIMEIRO PRINT ---");
		System.out.println(hoje);
		
		System.out.println("--- SEGUNDO PRINT ---");
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(formatador.format(hoje));
	
		System.out.println("--- TERCEIRO PRINT ---");
		String dataAniversario = "20/01/1985";
		DateFormat formatador2 = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date aniversario = formatador2.parse(dataAniversario);
			System.out.println(formatador2.format(aniversario));
		} catch (Exception e) {
			System.out.println("Formato de data inválido");
		}
		
	}

}

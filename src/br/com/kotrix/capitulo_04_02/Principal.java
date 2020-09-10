package br.com.kotrix.capitulo_04_02;

public class Principal {

	public static void main(String[] args) {
		
		Integer i = new Integer(10); // Isso é um Wrapper
		Integer b = 10; // Isso é um Boxing
		int x = i; // Isso é um Unboxing, tirou do objeto e colocou na variavel.
		
		Integer i1 = 127;
		Integer i2 = 127;
		
		Integer i3 = 128;
		Integer i4 = 128;
		
		System.out.println("-----------------");
		System.out.println(i1 == i2);
		System.out.println(i3 == i4); // acima de 128, o java coloca em outra memoria, por isso o erro
		
		System.out.println("-----------------");
		
		// Forma certa de se comparar valores EQUALS
		System.out.println(i1.equals(i2));
		System.out.println(i3.equals(i4));
		System.out.println(i1.equals(i3));
		
		
	}
	
}
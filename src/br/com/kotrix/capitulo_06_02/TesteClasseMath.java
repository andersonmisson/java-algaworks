package br.com.kotrix.capitulo_06_02;

import static java.lang.Math.PI;
import static java.lang.Math.max;

public class TesteClasseMath {

	public static void main(String[] args) {

		// Comprimento de uma circunfer�ncia 2 x r x PI (3,1415)
				int raio = 4;
				double comprimento = 2 * raio * PI;
				System.out.println("Comprimento: " + comprimento);
				
				
				// M�ximo e minimo
				double[] precosProdutoA = {30.20, 25.49};
				double maiorPreco = max(precosProdutoA[0], precosProdutoA[1]);
				System.out.println("Maior pre�o: " + maiorPreco);
				System.out.println("Menor pre�o: " +
						Math.min(precosProdutoA[0], precosProdutoA[1]));

				
				// Pot�ncia
				System.out.println("2^3: " + Math.pow(2, 3));
				
				// Raiz quadrada
				System.out.println("Raiz de 9: " + Math.sqrt(9));
				
				// Arredondamento ceil, floor e round
				double n = 5.4;
				System.out.println("Menor inteiro: " + Math.floor(n)); // arredonda para baixo
				System.out.println("Maior inteiro: " + Math.ceil(n)); // arredonda para cima
				System.out.println("Arredondando: " + Math.round(n)); // arredonda para o mais proximo.
				
				// Trigonometria
				System.out.println("Seno: " + Math.sin(40));
				
				// N�meros randomicos
				double numeroAleatorio = Math.random() * 100;
				System.out.println(numeroAleatorio);
				
			}
			
		}
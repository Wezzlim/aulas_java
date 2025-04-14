package aula_02;

import java.util.Scanner;

public class Váriaveis {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		 
		//Variaveis
		System.out.println("Digite o primeiro número inteiro: ");
		int numero_01 = leia.nextInt();
		
		System.out.println("Digite o segundo número inteiro: ");
		int numero_02 = leia.nextInt();
		
		int total = numero_01 + numero_02;
		char opcao = 'V';
		boolean menorIdade = true;
		
		System.out.println("Digite o seu nome: ");
		String nome = leia.next();
		
		//Constante PI
		final double PI = 3.1415;
		
		//Atribuindo valor
		//numero_02 = 75;
			
		//Exibição tela
		System.out.println("Váriavel numero 1 é igual a: " + numero_01);
		System.out.println("Váriavel numero 2 é igual a: " + numero_02);
		System.out.printf("A soma dos valores 1 e 2 é: %d\n", total);
		System.out.printf("Constante PI é igual a: %.2f\n", PI);
		System.out.println("Váriavel nome em letras maiúsculas: " + nome.toUpperCase());
		System.out.println("Váriavel nome em letras minúsculas: " + nome.toLowerCase());

	}

}

package aula_02;

import java.util.Scanner;

public class V�riaveis {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		 
		//Variaveis
		System.out.println("Digite o primeiro n�mero inteiro: ");
		int numero_01 = leia.nextInt();
		
		System.out.println("Digite o segundo n�mero inteiro: ");
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
			
		//Exibi��o tela
		System.out.println("V�riavel numero 1 � igual a: " + numero_01);
		System.out.println("V�riavel numero 2 � igual a: " + numero_02);
		System.out.printf("A soma dos valores 1 e 2 �: %d\n", total);
		System.out.printf("Constante PI � igual a: %.2f\n", PI);
		System.out.println("V�riavel nome em letras mai�sculas: " + nome.toUpperCase());
		System.out.println("V�riavel nome em letras min�sculas: " + nome.toLowerCase());

	}

}

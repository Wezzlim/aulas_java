package aula_04;

import java.util.Scanner;

public class ExercicioDoWhile {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		System.out.println("******************************************");
		System.out.println("****************BEM VINDO*****************");
		System.out.println("******************************************");
		
		System.out.println("Digite números inteiros\n(quando quiser sair do programa digite 0)\n");
		
		int numero = 0;
		int soma = 0;
		
		do
		{
			System.out.println("Pode digitar: ");
			numero = leia.nextInt();
			
			if(numero > 0)
			{
				soma += numero;
			}
		}
		while(numero != 0);
		
		System.out.printf("A soma nos números positivos é: %d", soma);
		
		System.out.println("\n******************************************");
		System.out.println("***************VOLTE SEMPRE***************");
		System.out.println("******************************************");
		
		leia.close();
	}

}

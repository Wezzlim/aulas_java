package aula_05;

import java.util.Scanner;

public class ExercicioVetores {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("*******************************************************");
		System.out.println("**********************BEM-VINDO************************");
		System.out.println("*******************************************************");

		
        // criiando o vetor vazio
        int[] vetor = new int[10];

     
        System.out.println("Digite 10 números inteiros (não repetidos):");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = leia.nextInt();
        }

        System.out.print("\nDigite o número que você deseja encontrar: ");
        int numero = leia.nextInt();

        // VERificando se o número esta no vetor
        boolean encontrado = false;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                System.out.println("\nO número " + numero + " está localizado na " + i + "º posição (com zero de posição inicial)" );
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("O número " + numero + " não foi encontrado!");
        }
		
		
		leia.close();
	}

}

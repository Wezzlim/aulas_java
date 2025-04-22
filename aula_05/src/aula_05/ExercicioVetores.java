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

     
        System.out.println("Digite 10 n�meros inteiros (n�o repetidos):");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("N�mero " + (i + 1) + ": ");
            vetor[i] = leia.nextInt();
        }

        System.out.print("\nDigite o n�mero que voc� deseja encontrar: ");
        int numero = leia.nextInt();

        // VERificando se o n�mero esta no vetor
        boolean encontrado = false;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                System.out.println("\nO n�mero " + numero + " est� localizado na " + i + "� posi��o (com zero de posi��o inicial)" );
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("O n�mero " + numero + " n�o foi encontrado!");
        }
		
		
		leia.close();
	}

}

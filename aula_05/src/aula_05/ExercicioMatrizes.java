package aula_05;

import java.util.Scanner;

public class ExercicioMatrizes {

	public static void main(String[] args) {
	
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("*******************************************************");
		System.out.println("**********************BEM-VINDO************************");
		System.out.println("*******************************************************");
		
		 // criando matriz para armazenar notas dos 10 alunos (10 linhas porr 4 colunas)
        double[][] notas = new double[10][4];

        // criando vetor para armazenar asm�dias
        double[] medias = new double[10];

        // lendo as notas de cada aluno
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite as 4 notas do aluno " + (i + 1) + ":");
            double soma = 0;

            for (int j = 0; j < 4; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[i][j] = leia.nextDouble();
                soma += notas[i][j]; // j� aproveita e soma aqui mesmo
            }

            // calculando a m�dia e armazeenando no vetor
            medias[i] = soma / 4;
        }

        // exibir as m�dias de cada aluno
        System.out.println("\nM�dias dos alunos:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Aluno %d: %.1f\n", (i + 1), medias[i]);
        }

		
		
		leia.close();
	}

}

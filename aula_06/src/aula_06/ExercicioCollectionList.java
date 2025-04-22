package aula_06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioCollectionList {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
        ArrayList<String> cores = new ArrayList<>();

        // entrada
        System.out.println("Digite 5 cores:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Cor " + (i + 1) + ": ");
            String cor = leia.nextLine();
            cores.add(cor);
        }

        // mostrando todas as cores
        System.out.println("\nListar todas as cores:");
        for (String cor : cores) {
            System.out.println(cor);
        }

        // ordenando e mostrando as cores em ordem alfabética
        Collections.sort(cores);
        System.out.println("\nOrdenar as cores:");
        for (String cor : cores) {
            System.out.println(cor);
        }

        leia.close();


	}
}

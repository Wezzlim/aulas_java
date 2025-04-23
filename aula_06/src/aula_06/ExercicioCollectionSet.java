package aula_06;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExercicioCollectionSet {

	public static void main(String[] args) {
		
        Scanner leia = new Scanner(System.in);
        Set<Integer> numerosUnicos = new HashSet<>();

        System.out.println("Digite 10 números inteiros (repetidos serão ignorados):\n");

        int contador = 0;
        while (contador < 10) {
            System.out.print("Número " + (contador + 1) + ": ");
            int numero = leia.nextInt();
            numerosUnicos.add(numero); // só adiciona se for unico Set vai cuida disso)
            contador++; // conta todas as entradas inclusive repetidas
        }

        //  mostrando os dados usando Iterator (somente os valores unicos)
        System.out.println("\nListar dados do Set (sem repetir):");
        Iterator<Integer> iterator = numerosUnicos.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        leia.close();

	}

}

package aula_02;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.println("SEJA BEM VINDO!!!!");

        System.out.print("numero1: ");
        float n1 = leia.nextFloat();
        
        System.out.print("numero2: ");
        float n2 = leia.nextFloat();
        
        System.out.print("numero3: ");
        float n3 = leia.nextFloat();
        
        System.out.print("numero4: ");
        float n4 = leia.nextFloat();

        float diferenca = (n1 * n2) - (n3 * n4);

        System.out.printf("Diferença: %.1f\n", diferenca);
        
        leia.close();

	}

}

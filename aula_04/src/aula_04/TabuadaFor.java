package aula_04;

import java.util.Scanner;

public class TabuadaFor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		int numero = leia.nextInt();
		
		for(int cont = 1; cont <= 10; cont ++)
		{
			System.out.printf("\n %d x %d = %d", numero, cont, (numero * cont));
		}

		
		leia.close();
	}

}

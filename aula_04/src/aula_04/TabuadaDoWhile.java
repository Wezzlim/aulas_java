package aula_04;

import java.util.Scanner;

public class TabuadaDoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		int numero = leia.nextInt();
		int cont = 1;
		
		do
		{
			System.out.printf("\n %d x %d = %d", numero, cont, (numero * cont));
			cont ++;
		} while(cont <= 10);
		
		
		leia.close();
	}

}

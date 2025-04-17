package aula_04;

import java.util.Scanner;

public class TabuadaWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		int numero = leia.nextInt();
		int cont = 1;
		
		while(cont <= 10)
		{
			System.out.printf("\n %d x %d = %d", numero, cont, (numero * cont));
			cont ++;
		}
		
		
		leia.close();
	}

}

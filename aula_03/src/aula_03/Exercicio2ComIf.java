package aula_03;

import java.util.Scanner;

public class Exercicio2ComIf {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("*****BEM VINDO******");
		System.out.println("**********************");
		
		System.out.println("Digite um n�mero: ");
		int numero = leia.nextInt();
		int divisor = 2;
		
		if(numero % divisor == 0 && numero > 0)
		{
			System.out.printf("O n�mero %d � Positivo e par", numero);
		}
		else if(numero % divisor == -1 && numero < 0)
		{
			System.out.printf("O n�mero %d � Negativo e impar", numero);
		}
		else if(numero % divisor == 0 && numero < 0)
		{
			System.out.printf("O n�mero %d � Negativo e par", numero);
		}
		else if(numero % divisor == 1 && numero > 0)
		{
			System.out.printf("O n�mero %d � Positivo e impar", numero);
		}
		else
		{
			System.out.println("O numero que digitou � zero, e ele � neutro!");
		}
		
		leia.close();
	}

}

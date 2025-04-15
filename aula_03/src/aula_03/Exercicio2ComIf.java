package aula_03;

import java.util.Scanner;

public class Exercicio2ComIf {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("*****BEM VINDO******");
		System.out.println("**********************");
		
		System.out.println("Digite um número: ");
		int numero = leia.nextInt();
		int divisor = 2;
		
		if(numero % divisor == 0 && numero > 0)
		{
			System.out.printf("O número %d é Positivo e par", numero);
		}
		else if(numero % divisor == -1 && numero < 0)
		{
			System.out.printf("O número %d é Negativo e impar", numero);
		}
		else if(numero % divisor == 0 && numero < 0)
		{
			System.out.printf("O número %d é Negativo e par", numero);
		}
		else if(numero % divisor == 1 && numero > 0)
		{
			System.out.printf("O número %d é Positivo e impar", numero);
		}
		else
		{
			System.out.println("O numero que digitou é zero, e ele é neutro!");
		}
		
		leia.close();
	}

}

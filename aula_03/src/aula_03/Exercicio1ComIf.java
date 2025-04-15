package aula_03;

import java.util.Scanner;

public class Exercicio1ComIf {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("*****BEM VINDO******");
		System.out.println("Digite 3 numeros inteiros: ");
		System.out.println("**********************");
		System.out.println("Digite o número A: ");
		int numeroA = leia.nextInt();
		
		System.out.println("Digite o número B: ");
		int numeroB = leia.nextInt();
		
		System.out.println("Digite o número C: ");
		int numeroC = leia.nextInt();
		
		if(numeroA + numeroB > numeroC)
		{
			System.out.printf("A Soma de A + B é Maior do que C");
		}
		else if(numeroA + numeroB < numeroC)
		{
			System.out.printf("A Soma de A + B é Menor do que C");
		}
		else
		{
			System.out.printf("A Soma de A + B é igual a C");
		}
		leia.close();
	}

}

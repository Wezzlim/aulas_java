package aula_08;

import java.util.Scanner;

public class CalculadoraMetodos {

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner(System.in);
		int opcao;
		
		System.out.println("\nDigite o primeiro numero: ");
		double numero1 = leia.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		double numero2 = leia.nextDouble();
		
		while(true)
		{
		
		System.out.println("\n********************************************");
		System.out.println("1 - Somar");
		System.out.println("2 - Subtrair");
		System.out.println("3 - Multiplicar");
		System.out.println("4 - Dividir");
		System.out.println("0 - Sair");
		System.out.println("********************************************");
		System.out.println("Qual operação você deseja executar?");
		
		opcao = leia.nextInt();
		
		if(opcao == 0)
		{
			sobre();
			leia.close();
			System.exit(0);
		}
		
		switch(opcao)
		 {
			case 1 -> System.out.printf("\nRESULTADO: %.2f + %.2f = %.2f\n", numero1, numero2, somar(numero1, numero2));
			case 2 -> System.out.printf("\nRESULTADO: %.2f - %.2f = %.2f\n", numero1, numero2, subtrair(numero1, numero2));
			case 3 -> System.out.printf("\nRESULTADO: %.2f * %.2f = %.2f\n", numero1, numero2, multiplicar(numero1, numero2));
			case 4 -> System.out.printf("\nRESULTADO: %.2f / %.2f = %.2f\n", numero1, numero2, dividir(numero1, numero2));
			default -> System.out.println("Opção inválida!");
		 }
		
		}
		
	}
	
	static double somar(double numero1, double numero2)
	{	
		return numero1 + numero2;
	}
	
	static double subtrair(double numero1, double numero2)
	{	
		return numero1 - numero2;
	}
	
	static double multiplicar(double numero1, double numero2)
	{	
		return numero1 * numero2;
	}
	
	static double dividir(double numero1, double numero2)
	{	
		return numero1 / numero2;
	}

	static void sobre()
	{
		System.out.println("Calculadora com métodos");
		System.out.println("Feito por: Wesley");
	}
	
}

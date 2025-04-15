package aula_03;

import java.util.Scanner;

public class ConversorMoedas {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double valorConvertido = 0.0;
		String moeda = "";
		
		System.out.println("******Bem vindo ao Conversor de Moedas******");
		
		System.out.println("\n1 - Converter para Dólar(USD$)         ");
		System.out.println("\n2 - Converter para Euro (EUR$)         ");
		System.out.println("\n3 - Converter para Peso (ARS$)         ");
		System.out.println("******************************************");
		System.out.println("Digite o numero da opção desejada: ");
		
		int opcao = leia.nextInt();
		
		System.out.println("Digite o valor em Reais (R$)");
		double valor = leia.nextFloat();
		
		switch(opcao) {
		case 1:
			valorConvertido = valor / 5.86;
			moeda = "Dólar";
			break;
		case 2:
			valorConvertido = valor / 6.63;
			moeda = "Euro";			
			break;
		case 3:
			valorConvertido = valor / 0.0049;
			moeda = "Peso Argentino";	
			break;
		default:
			System.out.println("Opção incorreta!");
			leia.close();
			return;
		}
		
		System.out.printf("Valor Convertido em %s: %.2f", moeda, valorConvertido);
		
		leia.close();
	}

}

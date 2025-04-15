package aula_03;

import java.util.Scanner;

public class Exercicio1ComSwitch {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("*******BEM VINDO********");
		System.out.println("************************");
		
		System.out.println("Cardapio de hoje: \n"
				+ "1 = Cachorro Quente R$ 10.00\n"
				+ "2 = X-Salada R$ 15.00\n"
				+ "3 = X-Bacon R$ 18.00\n"
				+ "4 = Bauru R$ 12.00\n"
				+ "5 = Refrigerante R$ 8.00\n"
				+ "6 = Suco de laranja R$ 13.00\n"
				+ "Informe o código do produto de 1 a 6:");
		int codigo = leia.nextInt();
		
		String nomeProduto = "";
		double preco = 0.0;
		
		switch(codigo)
		{
			case 1: 
				nomeProduto = "Cachorro Quente";
				preco = 10.00;
				break;
			case 2:
				nomeProduto = "X-Salada";
				preco = 15.00;
				break;
			case 3:
				nomeProduto = "X-Bacon";
				preco = 18.00;
				break;
			case 4:
				nomeProduto = "Bauru";
				preco = 12.00;
				break;
			case 5:
				nomeProduto = "Refrigerante";
				preco = 8.00;
				break;
			case 6:
				nomeProduto = "Suco de laranja";
				preco = 13.00;
				break;
			default:
				System.out.println("Código invalido, Escolha de 1 a 6!");
				leia.close();
				return;
		}
		
		System.out.println("Qual a quantidade desse produto vc deseja: ");
		int quantidade = leia.nextInt();
		
		double total = 0.0;
		
        if (quantidade > 0) 
        {
            total = quantidade * preco;
            System.out.printf("Produto: %s\n", nomeProduto);
            System.out.printf("Valor total: R$ %.2f\n", total);
        } else {
            System.out.println("Quantidade inválida! Digite um número maior que zero.");
        }
		
		leia.close();
	}

}

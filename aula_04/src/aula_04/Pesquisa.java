package aula_04;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, 
			esporte, 
			futebol = 0, 
			voleibolM18 = 0, 
			baqueteMn18 = 0,
			totalRespostas = 0, 
			somaIdades = 0;
		double media = 0;
		
		String continua = "S";
		
		while(continua.equalsIgnoreCase("S"))
		{
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			
			do {
			System.out.println("Digite o seu esporte favorito: (1- Fut / 2 - Volei / 3 - basquete / 4 - outros): ");
			esporte = leia.nextInt();
			
			if(esporte < 1 || esporte > 4)
			{
				System.out.println("Incorreto, digite um valor entre 1 e 4!");
			}
			
			}
			while(esporte < 1 || esporte > 4);
			
			// Quantas pessoas gostam de fut
			if(esporte == 1)
			{
				futebol ++;
			}
			
			// Qauantas pessoas gostam de volei e sao 18+
			if(esporte == 2 && idade >= 18)
			{
				voleibolM18 ++;
			}
			
			// Qauantas pessoas gostam de basquete e sao 18-
			if(esporte == 3 && idade < 18)
			{
				baqueteMn18 ++;
			}
			
			totalRespostas ++;
			
			somaIdades += idade;
			
			System.out.println("Deseja continuar? (S/N)? ");
			// Se começar com numero e dps com string colocar esse skip
			leia.skip("\\R");
			continua = leia.nextLine().toUpperCase();
		}
		
		media = Math.round(somaIdades / totalRespostas); 
		System.out.printf("\nTotal de pessoas que gostam de futebol: %d", futebol);
		System.out.printf("\nTotal de pessoas que gostam de voleibol e são maiores de idade: %d", voleibolM18);
		System.out.printf("\nTotal de pessoas que gostam de basquete e são menores de idade: %d", baqueteMn18);
		System.out.printf("\nMédia de idade: " + media);
		
		leia.close();
	}

}

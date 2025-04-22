package aula_05;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//vetor de numero inteiros inicializado com valores
		int vetorInteiros[] = {10, 15, 35, 70, 140, 280, 480};
		
		//vetor de objetos float, com tamanho 5
		Float vetorReal[] = new Float[5];
		
		// Vetor de Objetos String
		String vetorStrings[] = { "Boxer", "Pastor Alemão", "Pinscher", "Husky Siberiano", "Corgi" };
		
		//variavel float para armazenar a soma dos elementos do valorReal
		float soma = 0;
		
		//laço for tradicional p exibir dados do vetorInteiros
		for(int indice = 0; indice < vetorInteiros.length; indice ++)
		{
		System.out.printf("\nVetor Inteiros[%d] = %d ", indice, vetorInteiros[indice]);
		}
		
		//laço for tradicional p inserir dados no vetorReal
		for(int indice = 0; indice < vetorReal.length; indice ++)
		{
		System.out.println("\nDigite um número Real: ");
		vetorReal[indice] = leia.nextFloat();
		}
		
		// Laço repeticao for each - var pra nao precisar tipar
		for(var valor : vetorReal) 
		{
			//System.out.println("Elemento atual: " + valor);
			soma += valor;
		}
		
		System.out.println("Resultado da soma: " + soma);
		
		//funcao pra ordem crescente sort
		Arrays.sort(vetorReal);
		
		for(var valor : vetorReal) 
		{
			System.out.println("Elemento atual: "  + valor);
		}
		
		//funcao reverse para ordem descrescente com collecions.reveser order
		Arrays.sort(vetorReal, Collections.reverseOrder());
		
		// exibindo o vetorReal com os dados em ordem descrescente
		for(var valor : vetorReal) 
		{
			System.out.println("\nRevorso agora:\n");
			System.out.println("Elemento atual: "  + valor);
			
			//ordenando o vetor strings em ordem crescente
			Arrays.sort(vetorStrings);
			
			//exibindo o vetorString com os dados em ordem crescente
			for(var valor1 : vetorStrings) 
			{
				System.out.println("Elemento atual: "  + valor1);
			}
			
		}
		
		leia.close();
	}
}

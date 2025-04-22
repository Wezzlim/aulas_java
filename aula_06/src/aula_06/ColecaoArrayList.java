package aula_06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ColecaoArrayList {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		ArrayList<Double> numeros = new ArrayList<Double>();
		
		numeros.add(2.0);
		numeros.add(3.0);
		numeros.add(9.0);
		numeros.add(6.0);
		numeros.add(2.0);
		
		/*System.out.println("Digite um número Real: ");
		double input = leia.nextDouble();
		
		numeros.add(input)*/
		
		// listando os valores da coleçao ArrayList
		for(var numero : numeros)
		{
			System.out.println(numero);
		}
		
		System.out.println("Indíce do número 9: " + numeros.indexOf(9.0));

		System.out.println("Qual valor está armazenado no Indíce 2? " + numeros.get(2));
		
		System.out.println("O número 9 existe na coleção? " + numeros.contains(9.0));
		
		//Alterar o valor de um elemento
		numeros.set(2, 10.0);
		
		//FORMA REDUZIDA DO FOREACH
		//:: = reference percorre todo arraylist 
		//e execute o metodo println com o valor q vc encontrar
		System.out.println("Exibe os dados após a atualização: ");
		numeros.forEach(System.out::println);
		
		// Excluir um elemento da lista, com base no índice
		numeros.remove(2);
		
		// Excluir um elemento da lista, com base no elemento
		numeros.remove(2.0);
		
		System.out.println("Exibe os dados após a exclusão: ");
		numeros.forEach(System.out::println);
		
		System.out.println("Qual é o tamanho da coleção? " + numeros.size());
		
		//Limpar a coleção
		//numeros.clear();
		
		System.out.println("A coleção está vazia? " + numeros.isEmpty());
		
		// ordenar a colection
		numeros.sort(null);
		
		//exibe os dados att, atravez do método forEach
		System.out.println("Exibir os dados ordenados em ordem crescente");
		numeros.forEach(System.out::println);
		
		// ordenar a colection em ordem decrescente, mas primeiro tem q ter a crescente
		numeros.sort(Comparator.reverseOrder());
		
		//exibe os dados att, atravez do método forEach
		System.out.println("Exibir os dados ordenados em ordem decrescente");
		numeros.forEach(System.out::println);
		
		leia.close();
	}

}

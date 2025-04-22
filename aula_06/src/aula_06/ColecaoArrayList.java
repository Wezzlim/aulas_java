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
		
		/*System.out.println("Digite um n�mero Real: ");
		double input = leia.nextDouble();
		
		numeros.add(input)*/
		
		// listando os valores da cole�ao ArrayList
		for(var numero : numeros)
		{
			System.out.println(numero);
		}
		
		System.out.println("Ind�ce do n�mero 9: " + numeros.indexOf(9.0));

		System.out.println("Qual valor est� armazenado no Ind�ce 2? " + numeros.get(2));
		
		System.out.println("O n�mero 9 existe na cole��o? " + numeros.contains(9.0));
		
		//Alterar o valor de um elemento
		numeros.set(2, 10.0);
		
		//FORMA REDUZIDA DO FOREACH
		//:: = reference percorre todo arraylist 
		//e execute o metodo println com o valor q vc encontrar
		System.out.println("Exibe os dados ap�s a atualiza��o: ");
		numeros.forEach(System.out::println);
		
		// Excluir um elemento da lista, com base no �ndice
		numeros.remove(2);
		
		// Excluir um elemento da lista, com base no elemento
		numeros.remove(2.0);
		
		System.out.println("Exibe os dados ap�s a exclus�o: ");
		numeros.forEach(System.out::println);
		
		System.out.println("Qual � o tamanho da cole��o? " + numeros.size());
		
		//Limpar a cole��o
		//numeros.clear();
		
		System.out.println("A cole��o est� vazia? " + numeros.isEmpty());
		
		// ordenar a colection
		numeros.sort(null);
		
		//exibe os dados att, atravez do m�todo forEach
		System.out.println("Exibir os dados ordenados em ordem crescente");
		numeros.forEach(System.out::println);
		
		// ordenar a colection em ordem decrescente, mas primeiro tem q ter a crescente
		numeros.sort(Comparator.reverseOrder());
		
		//exibe os dados att, atravez do m�todo forEach
		System.out.println("Exibir os dados ordenados em ordem decrescente");
		numeros.forEach(System.out::println);
		
		leia.close();
	}

}

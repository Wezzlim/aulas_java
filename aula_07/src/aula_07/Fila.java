package aula_07;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		//estrutura de dados fila
		//precisa do linkedlist pra saber quem é p anterior e proximo
		Queue<String> fila = new LinkedList<String>();
		
		//add elementos
		fila.add("Carlos");
		fila.add("Giovana");
		fila.add("Livia");
		fila.add("Maria");
		fila.add("Samuel");
		fila.add("Fabricio");
		fila.add("Victor");
		
		System.out.println(fila);
		
		fila.remove();
		
		System.out.println(fila);
		
		//add elemento no final fila
		fila.add("Thiago");
		
		System.out.println(fila);
		
		//guarda quem é o proximo a ser chamado (HEAD)
		System.out.println(fila.peek());
		
		fila.remove("Samuel");
		System.out.println(fila);
		
		//mostra e remove
		System.out.println(fila.poll());
		
		System.out.println(fila);
		
		System.out.println("A Maria está na fila? " + fila.contains("Maria"));
		System.out.println("O Carlos está na fila? " + fila.contains("Carlos"));
		System.out.println("O Samuel está na fila? " + fila.contains("Samuel"));
		
		System.out.println("Qual é o tamanho da fila? " + fila.size());
		
		int contador = 0;
		
		for(var pessoa : fila)
		{
			contador ++;
			if(pessoa.equalsIgnoreCase("maria"))
			{
				System.out.println("Posição: " + contador);
			}
		}
		
		
	}

}

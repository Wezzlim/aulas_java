package aula_06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {
		
		Set<String> frutas = new HashSet<String>();
		
		frutas.add("Maçã");
		frutas.add("Morango");
		frutas.add("Abacate");
		frutas.add("Banana");
		frutas.add("maçã");
		
		
		System.out.println(frutas);
		
		for(var fruta : frutas)
		{
			System.out.println(fruta.hashCode());
		}
		
		System.out.println("Morango existe na coleção? " + frutas.contains("Morango"));
		
		// Excluir um elemento da coleção
		frutas.remove("Morango");
		
		// criar um iterator
		Iterator<String> iFrutas = frutas.iterator();
		
		// listei os dados após a exclusão de um elemento
		while(iFrutas.hasNext())
		{
			System.out.println(iFrutas.next());
		}
		
		// criamos a coleçao arraylist
		ArrayList<String> frutasList = new ArrayList<String>();
		
		// adicionamos todos os elementos da coleçao set (frutas)
		//na coleção arraylist (frutasList)
		frutasList.addAll(frutas);
		
		//ordenamos frutasList em ordem crescente
		frutasList.sort(null);
		
		// Exibimos frutasList em ordem crescente
		System.out.println("Exibir os dados do Array List");
		frutasList.forEach(System.out::println);

	}

}

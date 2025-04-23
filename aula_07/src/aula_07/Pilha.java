package aula_07;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Stack<String> pilha = new Stack<String>();
		
		pilha.add("Comunicação não Violenta");
		pilha.add("IT: A Coisa");
		pilha.add("A coragem de ser imperfeito");
		pilha.add("Quem pensa enriquece");
		pilha.add("Diário de um banana");
		pilha.add("Senhor dos anéis");
		pilha.add("O Código da Vinci");
		
		System.out.println("Digite um livro: ");
		pilha.push(leia.nextLine());
		
		System.out.println(pilha);
		
		//retira um elemento da pilha
		pilha.pop();
		
		System.out.println(pilha);
		
		//adiciona um elemento na pilha
		pilha.push("Roube como um Artista");
		
		//exibe o elemento que está no topo de pilha
		System.out.println(pilha.peek());
		
		// verifica se um elemento existe na pilha
		System.out.println("O livro Díario de um Banana, existe na pilha? " + pilha.contains("Diário de um banana"));
		
		System.out.println(pilha);
		
		leia.close();
	}

}

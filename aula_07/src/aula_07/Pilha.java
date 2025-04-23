package aula_07;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Stack<String> pilha = new Stack<String>();
		
		pilha.add("Comunica��o n�o Violenta");
		pilha.add("IT: A Coisa");
		pilha.add("A coragem de ser imperfeito");
		pilha.add("Quem pensa enriquece");
		pilha.add("Di�rio de um banana");
		pilha.add("Senhor dos an�is");
		pilha.add("O C�digo da Vinci");
		
		System.out.println("Digite um livro: ");
		pilha.push(leia.nextLine());
		
		System.out.println(pilha);
		
		//retira um elemento da pilha
		pilha.pop();
		
		System.out.println(pilha);
		
		//adiciona um elemento na pilha
		pilha.push("Roube como um Artista");
		
		//exibe o elemento que est� no topo de pilha
		System.out.println(pilha.peek());
		
		// verifica se um elemento existe na pilha
		System.out.println("O livro D�ario de um Banana, existe na pilha? " + pilha.contains("Di�rio de um banana"));
		
		System.out.println(pilha);
		
		leia.close();
	}

}

package aula_07;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
        Scanner leia = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n==========================================");
            System.out.println("            PILHA DE LIVROS               ");
            System.out.println("         Sistema de Organização           ");
            System.out.println("==========================================");
            System.out.println(" 1 - Adicionar livro na pilha            ");
            System.out.println(" 2 - Listar todos os livros              ");
            System.out.println(" 3 - Retirar livro do topo               ");
            System.out.println(" 0 - Encerrar programa                   ");
            System.out.println("==========================================");
            System.out.print("Digite a opção desejada: ");
            opcao = leia.nextInt();
            leia.nextLine(); 

            if (opcao == 1) {
                System.out.print("Digite o nome do livro: ");
                String livro = leia.nextLine();
                pilha.push(livro);
                System.out.println("\nLivro \"" + livro + "\" adicionado à pilha!");
            } else if (opcao == 2) {
                System.out.println("\nLivros na pilha:");
                if (pilha.isEmpty()) {
                    System.out.println("A pilha está vazia!");
                } else {
                    for (int i = pilha.size() - 1; i >= 0; i--) {
                        System.out.println(pilha.get(i));
                    }
                }
            } else if (opcao == 3) {
                if (pilha.isEmpty()) {
                    System.out.println("A pilha está vazia! Nenhum livro para retirar.");
                } else {
                    String retirado = pilha.pop();
                    System.out.println("O livro \"" + retirado + "\" foi retirado da pilha!");
                }
            } else if (opcao == 0) {
                System.out.println("Programa Finalizado!");
            } else {
                System.out.println("Opção incorreta, tente novamente.");
            }

        } while (opcao != 0);

        leia.close();

	}

}

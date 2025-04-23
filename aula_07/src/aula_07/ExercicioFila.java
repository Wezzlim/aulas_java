package aula_07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {
		
        Queue<String> fila = new LinkedList<>();
        Scanner leia = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n==========================================");
            System.out.println("          BEM-VINDO AO BANCO DIGITAL      ");
            System.out.println("           Sistema de Atendimento         ");
            System.out.println("==========================================");
            System.out.println(" 1 - Adicionar cliente à fila            ");
            System.out.println(" 2 - Listar todos os clientes na fila    ");
            System.out.println(" 3 - Chamar próximo cliente              ");
            System.out.println(" 0 - Encerrar atendimento                ");
            System.out.println("==========================================");
            System.out.print("Digite a opção desejada: ");
            opcao = leia.nextInt();
            leia.nextLine(); 

            if (opcao == 1) {
                System.out.print("Digite o nome do cliente: ");
                String nome = leia.nextLine();
                fila.add(nome);
                System.out.println("\nFila:");
                for (String cliente : fila) {
                    System.out.println(cliente);
                }
                System.out.println("\nCliente Adicionado!");
            } else if (opcao == 2) {
                System.out.println("\nLista de Clientes na Fila:");
                if (fila.isEmpty()) {
                    System.out.println("A fila está vazia!");
                } else {
                    for (String cliente : fila) {
                        System.out.println(cliente);
                    }
                }
            } else if (opcao == 3) {
                if (fila.isEmpty()) {
                    System.out.println("A Fila está vazia!");
                } else {
                    fila.poll(); // remove o primeiro da fila
                    System.out.println("\nFila:");
                    for (String cliente : fila) {
                        System.out.println(cliente);
                    }
                    System.out.println("\nO Cliente foi Chamado!");
                }
            } else if (opcao == 0) {
                System.out.println("Programa Finalizado!");
            } else {
                System.out.println("Opção incorreta, Tente novamente.");
            }

        } while (opcao != 0);

        leia.close();
	}

}

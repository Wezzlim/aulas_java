package aula_02;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
        Scanner leia = new Scanner(System.in);
        float soma = 0; 

        System.out.println("Seja bem-vindo!!!!!\nAbaixo digite suas notas de 0 a 10");

        for (int i = 0; i < 4; i++) {
            while (true) {
                System.out.printf("Digite a nota %d: ", i + 1);
                String entrada = leia.next(); 

                try {
                    if (entrada.contains(",")) {
                    	//usei split pra dividr a string onde houver virgula
                        String[] partes = entrada.split(",");
                        if (partes[1].length() > 2) {
                            System.out.println("Digite no máximo 2 casas decimais.");
                            continue;
                        }
                    }

                    float nota = Float.parseFloat(entrada.replace(",", "."));
                    if (nota >= 0 && nota <= 10) {
                        soma += nota;
                        break;
                    } else {
                        System.out.println("Nota incorreta! Digite entre 0 e 10.");
                    }

                } catch (Exception e) {
                    System.out.println("Entrada incorreta! Tente novamente.");
                }
            }
        }

        System.out.printf("\nSua média final foi: %.2f\n", soma / 4);

	}

}

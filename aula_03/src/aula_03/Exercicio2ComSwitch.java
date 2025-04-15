package aula_03;

import java.util.Scanner;

public class Exercicio2ComSwitch {

	public static void main(String[] args) {
		
        Scanner leia = new Scanner(System.in);
        System.out.println("***** CALCULADORA SIMPLES *****");
        System.out.println("********************************");

        System.out.print("Digite o 1º número: ");
        float numero1 = leia.nextFloat();

        System.out.print("Digite o 2º número: ");
        float numero2 = leia.nextFloat();

        System.out.println("Escolha a operação:\n"
                + "1 = Soma\n"
                + "2 = Subtração\n"
                + "3 = Multiplicação\n"
                + "4 = Divisão");
        System.out.print("Digite o código da operação (1 a 4): ");
        int operacao = leia.nextInt();

        float resultado = 0.0f;
        boolean operacaoValida = true;

        switch (operacao) {
            case 1:
                resultado = numero1 + numero2;
                System.out.printf("%.2f + %.2f = %.2f\n", numero1, numero2, resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.printf("%.2f - %.2f = %.2f\n", numero1, numero2, resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.printf("%.2f * %.2f = %.2f\n", numero1, numero2, resultado);
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.printf("%.2f / %.2f = %.2f\n", numero1, numero2, resultado);
                } else {
                    System.out.println("Erro: divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operação Inválida! Por favor, escolha de 1 a 4.");
                operacaoValida = false;
        }

        leia.close();

	}

}

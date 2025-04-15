package aula_03;

import java.util.Scanner;

public class Exercicio2ComSwitch {

	public static void main(String[] args) {
		
        Scanner leia = new Scanner(System.in);
        System.out.println("***** CALCULADORA SIMPLES *****");
        System.out.println("********************************");

        System.out.print("Digite o 1� n�mero: ");
        float numero1 = leia.nextFloat();

        System.out.print("Digite o 2� n�mero: ");
        float numero2 = leia.nextFloat();

        System.out.println("Escolha a opera��o:\n"
                + "1 = Soma\n"
                + "2 = Subtra��o\n"
                + "3 = Multiplica��o\n"
                + "4 = Divis�o");
        System.out.print("Digite o c�digo da opera��o (1 a 4): ");
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
                    System.out.println("Erro: divis�o por zero n�o � permitida.");
                }
                break;
            default:
                System.out.println("Opera��o Inv�lida! Por favor, escolha de 1 a 4.");
                operacaoValida = false;
        }

        leia.close();

	}

}

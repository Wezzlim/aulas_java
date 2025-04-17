package aula_04;

import java.util.Scanner;

public class ExercicioComFor {

	public static void main(String[] args) {
		
        Scanner leia = new Scanner(System.in);

        int numero1 = 0, numero2 = 0;

        System.out.println("**************************************************************************");
        System.out.println("******************************** BEM VINDO *******************************");
        System.out.println("**************************************************************************");
        System.out.println("Digite 2 números inteiros (porém o primeiro deve ser menor que o segundo)");

        // loop para eu conseguir validar o interval - omitindo func como while true
        for (;;) {
            System.out.println("\nSabendo da regra acima, por favor digite o primeiro número inteiro: ");
            numero1 = leia.nextInt();

            System.out.println("Agora digite o segundo número inteiro: ");
            numero2 = leia.nextInt();

            if (numero1 >= numero2) {
                System.out.println("\nIntervalo inválido! O primeiro número deve ser menor do que o segundo. Tente novamente.");
            } else {
                break; // colquei break pra quando o intervalo esta correto
            }
        }

        System.out.printf("\nNo intervalo de %d e %d:\n", numero1, numero2);

        for (int verificador = numero1; verificador <= numero2; verificador++) {
            if (verificador % 3 == 0 && verificador % 5 == 0) {
                System.out.printf("%d é múltiplo de 3 e 5\n", verificador);
            }
        }

        leia.close();
	}

}

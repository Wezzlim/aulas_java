package aula_02;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Seja bem vindo!!!!!\nDigite o seu salário por favor: ");
		float salario = leia.nextFloat();
		
		System.out.println("Agora, digite o abono salarial: ");
		float abono = leia.nextFloat();
		
		float salarioNovo = (salario + abono);
		
		System.out.printf("Seu novo salário (já com o abono), é de: \nR$ %.2f", salarioNovo);

	}

}

package aula_02;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Seja bem vindo!!!!");

        System.out.print("Salário Bruto: ");
        float salarioBruto = leia.nextFloat();
        
        System.out.print("Adicional Noturno: ");
        float adicionalNoturno = leia.nextFloat();
        
        System.out.print("Horas Extras: ");
        float horasExtras = leia.nextFloat();
        
        System.out.print("Descontos: ");
        float descontos = leia.nextFloat();

        float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

        System.out.printf("Salário Líquido: %.2f\n", salarioLiquido);
       
	}

}

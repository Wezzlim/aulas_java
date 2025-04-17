package aula_04;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("******************************************");
		System.out.println("****************BEM VINDO*****************");
		System.out.println("******************************************");
		
		System.out.println("Armazene as idades em numeros inteiros\n(quando quiser sair do programa digite um numero negativo)\n");

		
		int pessoasMenos21 = 0;
		int pessoasMais50 = 0;
		int idade = 0;
		
		while(idade >= 0)
		{
			System.out.println("Digite a idade (Em numero inteiro): ");
			idade = leia.nextInt();
			
			if(idade < 21 && idade > 0)
			{
				pessoasMenos21 ++;
			}
			if(idade > 50)
			{
				pessoasMais50 ++;
			}
		}
		
		System.out.printf("\nTotal de pessoas menores que 21 anos: %d pessoa(s)", pessoasMenos21);
		System.out.printf("\nTotal de pessoas maiores que 50 anos: %d pessoa(s)", pessoasMais50);
		
		System.out.println("\n******************************************");
		System.out.println("***************VOLTE SEMPRE***************");
		System.out.println("******************************************");
		
		
		leia.close();
	}

}

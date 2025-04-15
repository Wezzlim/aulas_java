package aula_03;

public class Caracteres {

	public static void main(String[] args) {
		
		String frase_01 = "Turma Java82";
		String frase_02 = "TURMA JAVA82";
		String frase_03 = "turma java82";
		String frase_04 = "TURMA JAVA82";
		
		System.out.println(frase_01 == frase_02);
		System.out.println(frase_02 == frase_04);
		
		System.out.println(frase_01.equals(frase_02));
		System.out.println(frase_02.equals(frase_04));
		
		System.out.println(frase_01.equalsIgnoreCase(frase_02));
		System.out.println(frase_02.equalsIgnoreCase(frase_04));
		
		System.out.println(frase_01.compareTo(frase_02));
		System.out.println(frase_02.compareTo(frase_04));
	}

}

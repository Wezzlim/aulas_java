package triatleta;

public abstract class Pessoa {

	private String nome;

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// m�todo abstrato dentro da classe abstrata
	public abstract void cansou();
	
	public void visualizar()
	{
		System.out.println("\n****************************");
		System.out.println("Dados do atleta");
		System.out.println("\n****************************");
		System.out.println("Nome do atleta: " + this.nome);
	}
}

package triatleta;

public class JogadorFutebol extends Pessoa implements Corredor {

	public JogadorFutebol(String nome) {
		super(nome);
		
	}

	@Override
	public void aquecer() {
		System.out.println("Aquecendo fora dos gramados...");
		
	}

	@Override
	public void correr() {
		System.out.println("Jogando...");
		
	}

	@Override
	public void cansou() {
		System.out.println("Fim do jogo...");
		
	}
	
	

}

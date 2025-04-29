package triatleta;

public class TestaTriatleta {

	public static void main(String[] args) {
		
		Triatleta t1 = new Triatleta("Wesley");

		t1.visualizar();
		
		t1.aquecer();
		t1.nadar();
		t1.pedalar();
		t1.correr();
		t1.cansou();
		
		JogadorFutebol jf1 = new JogadorFutebol("Lucas Moura");
		
		//pra ver oq acontece
		jf1.visualizar();
		
		jf1.aquecer();
		jf1.correr();
		jf1.cansou();
	}

}

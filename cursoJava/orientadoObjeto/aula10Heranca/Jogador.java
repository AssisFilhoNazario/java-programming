package aula10Heranca;

public class Jogador extends Pessoa {
	protected boolean aindaJoga = false;
	
	public void dizerAindaJoga() {
		System.out.println("Ainda joga "+ aindaJoga);
	}
}
